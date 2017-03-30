package Client;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by zhoupan on 3/30/17.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8000);
        try {
            System.out.println("socket = " + socket);
            new Thread(new InputThread(socket)).start();
            new Thread(new OutputThread(socket)).start();
            while (true) {
            }
        } finally {
            System.out.println("closing...");
            socket.close();
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
            Scanner scanner = new Scanner(System.in);
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
            while (scanner.hasNext()) {
                out.println(scanner.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}