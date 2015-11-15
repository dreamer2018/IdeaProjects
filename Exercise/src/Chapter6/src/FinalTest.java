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
    public final int Max(int a, int b){
        if(a>b) {
            return a;
        }
        return b;
    }
}

class FinaChild extends Fina{

    //不能重写
    //public int Max(int a,int b){}

}
public class FinalTest {
    public static void main(String[] args) {
        System.out.println(Fina.a);
        System.out.println(Fina.b);
        Fina fina=new Fina();
        System.out.println(fina.c);
    }
}