/**
 * Created by zhoupan on 15-11-9 上午9:59.
 */
import java.math.*;
import java.util.Scanner;
//抽象类
abstract class shape {
    /* 抽象方法 求面积 */
    public abstract double getArea();
    /* 抽象方法 求周长 */
    public abstract double getPerimeter();
}
class Circle extends shape{

    double r;
    public Circle(double r)
    {
        this.r=r;
    }
    public double getArea()
    {
        return Math.PI*Math.pow(r,2);
    }
    public double getPerimeter(){
        return 2*Math.PI*r;
    }

}
class Rectangle extends shape{
    double high,wide;
    public Rectangle(double high,double wide)
    {
        this.high=high;
        this.wide=wide;
    }
    public double getArea()
    {

        return high*wide;
    }
    public double getPerimeter(){
        return 2*(high+wide);
    }
}
public class AbstractTest {
    public static double sumArea(shape[] a){
        double sum=0;
        for(shape s:a){
            sum+=s.getArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        shape c1=new Circle(scanner.nextDouble());
        shape c2=new Circle(scanner.nextDouble());
        shape r1=new Rectangle(scanner.nextDouble(),scanner.nextDouble());
        shape r2=new Rectangle(scanner.nextDouble(),scanner.nextDouble());
        shape[] s={c1,c2,r2,r1};
        System.out.printf("The total area is %.4f", AbstractTest.sumArea(s));
    }
}
