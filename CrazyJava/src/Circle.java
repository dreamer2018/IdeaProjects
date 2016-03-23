/**
 * Created by zhoupan on 11/24/15.
 */
abstract class Shape {

    //定义一般初始化块
    {
        System.out.println("执行Shape的初始化块");
    }

    String colour;
    //定义无参构造器
    public Shape(){};
    //定义参构造器
    public Shape(String colour){
        this.colour=colour;
    }

    //colour的geter方法
    public String getColour(){
        return colour;
    }
    //定义两个抽象的方法
    public abstract String getType();
}
public class Circle extends Shape{

    int r;
    //定义Circle的无参构造器
    public Circle(){}

    //定义Circle的有参构造器
    public Circle(String colour,int r){
        super(colour);
        this.r=r;
    }

    public double getArea(){
        return Math.PI*Math.pow(r,2);
    }

    public String getType(){
        return getColour()+"圆形";
    }

    public static void main(String[] args) {
        Circle c = new Circle("红色",5);
        System.out.printf("%s的面积为%.4f\n",c.getType(),c.getArea());
    }

}
