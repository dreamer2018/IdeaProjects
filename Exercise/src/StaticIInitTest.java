/**
 * Created by zhoupan on 15-11-9.
 */
public class StaticIInitTest {
    static int a=200;
    static {
        a=100;
    }

    public static void main(String[] args){
        System.out.print("a="+a);
    }
}
