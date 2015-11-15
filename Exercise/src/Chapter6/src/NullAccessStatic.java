/**
 * Created by zhoupan on 15-11-10 下午3:24.
 */

public class NullAccessStatic {
    private static void test(){
        System.out.println("NullAccessStatic类的类方法");
    }

    public static void main(String[] args) {
        NullAccessStatic n=null;
        n.test();
       // n.toString();
    }
}
