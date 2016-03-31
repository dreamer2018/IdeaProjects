package src.NetProgramming;
/**
 * Created by zhoupan on 16-3-31.
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception{
        java.net.InetAddress ip = java.net.InetAddress.getByName("www.baidu.com");
        System.out.println(ip);
        System.out.println("是否可达："+ip.isReachable(2000));

    }
}