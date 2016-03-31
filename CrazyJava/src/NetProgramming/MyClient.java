
package src.NetProgramming;

import java.io.*;
import java.net.Socket;

/**
 * Created by sel on 16-3-31.
 */
public class MyClient {
    public static void main(String[] args) throws IOException {
        //定义需要连接的服务器的IP和端口
        Socket s = new Socket("127.0.0.1",8000);
        //客户端启动ClientThread线程不断地读取来自服务器的数据
        new Thread(new ClientThread(s)).start();
        //获取该socket对应的输出流
        PrintStream ps = new PrintStream(s.getOutputStream());
        String line = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((line = br.readLine()) != null){
            //将用户的键盘输入内容写入Socket对应的输出流中
            ps.println(line);
        }
    }
}
class ClientThread implements Runnable{
    //该线程负责处理的socket
    private Socket s;
    //该线程所处理的socket对应的输入流
    BufferedReader br = null;
    public ClientThread(Socket s) throws IOException {
        this.s=s;
        br = new BufferedReader((new InputStreamReader(s.getInputStream())));
    }
    @Override
    public void run() {
        String content = null;
        //循环不断的读取Socket中的内容，并将这些内容打印出来
        try {
            while ((content = br.readLine()) != null){
                System.out.println(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
