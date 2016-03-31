import com.sun.corba.se.spi.activation.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by sel on 16-3-31.
 */
public class MyServer {
    public static ArrayList<Socket> socketList = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        //绑定服务器的端口
        ServerSocket ss = new ServerSocket(8000);
        while (true){
            //此代码将会阻塞，将一直等到别人来连接
            Socket s = ss.accept();
            socketList.add(s);
            System.out.println("test");
            //每当客户端连接后，启动一个ServerThread线程为客户端服务
            new Thread(new ServerThread(s)).start();
        }

    }
}
class ServerThread implements Runnable{

    //定义当前线程所处理的Socket
    Socket s = null;
    //该线程所处理的socket对应的输入流
    BufferedReader br = null;
    public ServerThread(Socket s) throws IOException{
        this.s=s;
        //初始化对应的输入流
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }
    @Override
    public void run() {
        try {
            String content = null;
            //采用循环不断的从Socket中读取客户端发送过来的数据
            while ((content = readFromClient()) != null){
                //遍历socketList中的每个socket,将读到的内容向每个socket发送一次
                for (Socket s : MyServer.socketList){
                    System.out.println("input");
                    if (s != this.s) {
                        PrintStream ps = new PrintStream(s.getOutputStream());
                        ps.println(content);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String readFromClient(){
        try {
            return br.readLine();
        }//如果捕获到异常，则表明该socket对应的客户端已经关闭
        catch (IOException e){
            //删除该Socketgit
            MyServer.socketList.remove(s);
        }
        return null;
    }
}
