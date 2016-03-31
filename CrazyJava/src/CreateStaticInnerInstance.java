/**
 * Created by zhoupan on 12/10/15.
 */
class Out {
    static class Inn {
        public Inn() {
            System.out.println("Inn class construct");
        }
    }
}
public class CreateStaticInnerInstance {
    public static void main(String[] args) {
        //Out.Inn in;
        //in=new Out.Inn();
        Out.Inn in =new Out.Inn();
    }
}
