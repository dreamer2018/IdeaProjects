

/**
 * Created by zhoupan on 15-11-10 下午12:14.
 */
package Chapter6;

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.println("此人名为"+name);
    }

    @Override
    public String toString() {
        return "对象为："+super.toString();
    }
}
public class PrintObject {
    public static void main(String[] args) {
        Person person=new Person("xiaoming");
        person.printInfo();
        System.out.println(person.toString());
        System.out.println(person);
    }
}
