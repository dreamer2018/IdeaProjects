/**
 * Created by zhoupan on 11/24/15.
 */
class  Person{

    private String name;
    int age;

    public Person(){

    }
    public Person(String name){
        this.name=name;
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void AllLife(){
        System.out.println("享年"+age+"的"+name+"有一个独一无二的人生");
    }
}
class SomeOne extends Person{
    public SomeOne(){
        super("保罗*沃克",43);
    }
    public void Test(){
        AllLife();
    }
}
public class FinalOverLoad {
    public static void main(String[] args) {
        SomeOne so = new SomeOne();
        so.Test();
    }
}
