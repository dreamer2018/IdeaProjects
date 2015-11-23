/**
 * Created by zhoupan on 15-11-23 下午8:49.
 */

//import java..*;
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
    public String getColour(String colour){
        return this.colour=colour;
    }
    //定义两个抽象的方法
    public abstract String getType();
}
public class Circle extends Shape{

    //定义Circle的无参构造器
    public Circle(){}

    //定义Circle的有参构造器
    public Circle(String colour){
        super(colour);
    }

    public double getArea(int r){
        return Math.PI*Math.pow(r,2);
    }

    public String getType(){

    }
}