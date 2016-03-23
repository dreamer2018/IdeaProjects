/**
 * Created by zhoupan on 15-11-8.
 */
public class InstanceInitTest {
    {
        int a=10;
    }
    int a=20;
    {
        int a=15;
    }
    public static void main(String[] args){
        System.out.print("a="+new InstanceInitTest().a+"\n");
    }
}
