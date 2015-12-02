/**
 * Created by zhoupan on 12/2/15.
 */
import java.util.Scanner;

class Division{
    public double division(int a,int b){
        try {
            double c;
            return c=a/b;
        }catch (Exception e){
            System.out.println(e);
            return 0;
        }
    }
}
public class ExceptionTest {
    public static void main(String[] args) {
        double c;
        Scanner s=new Scanner(System.in);
        Division d=new Division();
        try {
            c=d.division(s.nextInt(),s.nextInt());
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e+":您的输入不合法");
        }
    }
}
