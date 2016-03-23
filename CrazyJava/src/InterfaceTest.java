/**
 * Created by zhoupan on 12/1/15.
 */
interface HumanBing{

    int age=20;
    String name="Jake";
    //定义方法
    public String getName();
    public int getAge();
    public void eatFood();
}
class Student implements HumanBing{

    //无参构造器
    public Student(){
    }

    //实现接口的抽象方法
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void eatFood(){
        System.out.println("在吃饭！");
    }
}
public class InterfaceTest {

    public static void main(String[] args) {
        Student s=new Student();
        System.out.printf("%d岁的%s",s.getAge(),s.getName());
        s.eatFood();
    }

}
