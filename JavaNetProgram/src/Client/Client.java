package Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static javafx.application.Platform.exit;
import static javafx.application.Platform.isFxApplicationThread;

/**
 * Created by zhoupan on 3/30/17.
 */
public class Client {
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8000);
        try {
            System.out.println("socket = " + socket);
            Thread input = new Thread(new InputThread(socket));
            Thread output = new Thread(new OutputThread(socket));
            input.start();
            output.start();
            input.join();
            output.join();


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            socket.close();
            System.out.println("closing...");
        }
    }
}

class OutputThread implements Runnable {

    private Socket socket;

    public OutputThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                if (in.readLine() == null) {
                    Client.flag = true;
                    break;
                }
                System.out.println(in.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class InputThread implements Runnable {
    private Socket socket;

    public InputThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.print("请输入：");
            Scanner scanner = new Scanner(System.in);
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
            out.println(scanner.next());
            while (scanner.hasNext() && !Client.flag && scanner.next().equals("#exit")) {
                out.println(scanner.next());
                System.out.print("请输入：");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}