package JAVXEXAM;

/**
 * Created by zhoupan on 16-1-7.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

interface IShape {
        public abstract double getArea();
        public abstract double getPerimeter();
}
public class creatShape implements IShape {

        public double side;
        public double getArea(){

            return 3*(side*Math.sqrt(side*side-side*side/4));
        }
        public double getPerimeter(){
            return 6*side;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            creatShape m =new creatShape();
            m.side=scanner.nextDouble();
            DecimalFormat df = new DecimalFormat("###.####");
            System.out.println(df.format(m.getArea()));
            System.out.print(df.format(m.getPerimeter()));
        }
}
