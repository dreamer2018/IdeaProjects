/**
 * Created by zhoupan on 12/9/15.
 */
class OutClass{
    class InnerClass{
        public InnerClass(){
            System.out.println("hello world\n");
        }
    }
}
public class CreateInnerClassInstance {
    public static void main(String[] args) {
        //OutClass.InnerClass in = new OutClass().new InnerClass();
        OutClass out = new OutClass();
        OutClass.InnerClass in;
        in = out.new InnerClass();
    }
}
