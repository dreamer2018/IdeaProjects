/**
 * Created by zhoupan on 12/10/15.
 */
interface Teachable{
    void work();
}
public class Programmer {
    private String name;

    public Programmer(){}
    public Programmer(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void work() {
        System.out.println(name+"在灯下认真敲键盘...");
    }
}
