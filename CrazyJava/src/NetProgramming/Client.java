package src.NetProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
/**
 * Created by zhoupan on 16-3-31.
 */

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {

        for(int i=0;i<100;i++) {
            Socket socket = new Socket("127.0.0.1", 8000);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = br.readLine();
            System.out.println("Server:" + line);
            br.close();
            socket.close();
            //Thread.sleep(1000);
        }
    }
}
