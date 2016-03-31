/**
 * Created by zhoupan on 12/10/15.
 */
public class TeachableProgrammer extends Programmer{
    public TeachableProgrammer() {
    }
    public TeachableProgrammer(String name){
        super(name);
    }
    private void thach(){
        System.out.println(getName()+"教师在讲台上讲课...");
    }
    class Closure implements Teachable{
        public void work() {
            thach();
        }
    }
    public Teachable getCallbackReference(){
        return new Closure();
    }
}
