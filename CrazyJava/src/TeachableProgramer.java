/**
 * Created by zhoupan on 12/10/15.
 */
public class TeachableProgramer {
    public static void main(String[] args) {
        TeachableProgrammer tp= new TeachableProgrammer("Jack");
        //tp.work();
        //tp.getCallbackReference().work();
        tp.work();
        TeachableProgrammer.Closure c= tp.new Closure();
        c.work();
    }
}
