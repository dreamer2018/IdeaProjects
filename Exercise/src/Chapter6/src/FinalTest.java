/**
 * Created by zhoupan on 15-11-15.
 */
class Fina{
    static final int a;
    static final int b;
    final int c;
    final String str;
    static {
        a=10;
        b=20;
    }
    {
        c=100;
        str="hello owrld";
    }
}
public class FinalTest {
    public static void main(String[] args) {
        System.out.println(Fina.a);
        System.out.println(Fina.b);
        Fina fina=new Fina();
        System.out.println(fina.c);
        System.out.println(fina.str);
    }
}
