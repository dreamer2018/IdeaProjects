/**
 * Created by zhoupan on 12/9/15.
 */
class OutClass{
    class InnerClass{
        public InnerClass(String str){
            System.out.println("hello world"+str);
        }
    }
}
class SubClass extends OutClass.InnerClass{
    public SubClass(OutClass out){
        out.super("   SuperClass");
        System.out.println("  I am SubClass");
    }
}
public class CreateInnerClassInstance {
    public static void main(String[] args) {
        //OutClass.InnerClass in = new OutClass().new InnerClass();
        OutClass out = new OutClass();
        OutClass.InnerClass in;
        in = out.new InnerClass("   hehe");
        SubClass s=new SubClass(new OutClass());
    }
}
