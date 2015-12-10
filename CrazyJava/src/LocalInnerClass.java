/**
 * Created by zhoupan on 12/10/15.
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        class InnerSuper{
            int a;
        }
        class InnerSuber extends InnerSuper{
            int b;
        }
        InnerSuber is=new InnerSuber();
        is.a=100;
        is.b=20;
        System.out.printf("a=%d,b=%d",is.a,is.b);
    }
}
