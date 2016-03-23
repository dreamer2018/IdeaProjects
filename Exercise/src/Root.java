/**
 * Created by zhoupan on 15-11-9.
 */
public class Root {
    static {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root(){

    }
}
class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参构造器");
    }
    public Mid(String msg){
        //调用Min的无参构造器
        this();
        System.out.println("Mid的有参构造器,msg是:" + msg);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf(){
        //通过super调用父类的初始化块
        super("最近挺高兴的，但是也挺忙的，也许是因为忙而快乐！");
        System.out.println("Leaf的无参构造器");
    }
}
