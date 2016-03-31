package src.NetProgramming;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zhoupan on 16-3-31.
 *
 *
 **/

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(8000);
        int i=0;
        while (true){

            Socket s = ss.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("News:你好");
            System.out.println("新连接："+i);
            i++;
            ps.close();
            s.close();
        }
    }
}
