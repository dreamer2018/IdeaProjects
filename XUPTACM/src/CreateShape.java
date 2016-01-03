/**
 * Created by zhoupan on 16-1-3.
 */
import java.util.Scanner;
interface IShape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

public class CreateShape implements IShape {

    public double side1,side2;
    public double getArea(){
        return (side1*side2)/2;
    }
    public double getPerimeter(){
        return side1+side2+Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreateShape cs = new CreateShape();
        cs.side1=scanner.nextDouble();
        cs.side2=scanner.nextDouble();
        System.out.printf("%.4f\n",cs.getArea());
        System.out.printf("%.4f",cs.getPerimeter());
    }
}
