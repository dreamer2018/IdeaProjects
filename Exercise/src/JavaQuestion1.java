/**
 * Created by zhoupan on 15-11-9 下午3:54.
 */
import java.util.Scanner;
class Rectangule{
    double width=1;
    double height=1;


    public Rectangule(){

    }
    public Rectangule(double width, double height) {

        this.width = width;
        this.height = height;
    }

    public double getArea() {

        return width*height;
    }

    public double getPerimeter() {

        return 2*(width+height);
    }
}

public class JavaQuestion1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Rectangule r=new Rectangule(scanner.nextDouble(),scanner.nextDouble());
        System.out.println(r.getArea());
        System.out.print(r.getPerimeter());
    }
}
