package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zhoupan on 3/30/17.
 */
public class Server {

    public static final int PORT = 8000;

    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(PORT);
        System.out.println("Started: " + s);
        try {
            while (true) {
                Socket socket = s.accept();
                new Thread(new ServerThread(socket)).start();
            }
        } finally {
            s.close();
        }
    }
}

class ServerThread implements Runnable {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("Connection accepted: " + socket);
            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            PrintWriter out =
                    new PrintWriter(
                            new BufferedWriter(
                                    new OutputStreamWriter(
                                            socket.getOutputStream())), true);
            while (true) {
                String str = in.readLine();
                if (null == str) {
                    break;
                }
                System.out.println("______________________________________");
                System.out.println("Echoing: " + str);
                System.out.println(socket.getRemoteSocketAddress());
                System.out.println("port : " + socket.getPort());
                System.out.println("LocalPort : " + socket.getLocalPort());
                System.out.println("______________________________________");
                out.println(str);
                out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("closing...");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
