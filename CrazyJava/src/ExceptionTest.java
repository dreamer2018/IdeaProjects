/**
 * Created by zhoupan on 12/2/15.
 */
//import java.util.Scanner;
import javax.swing.*;
class Division{
    public double division(int a,int b){
        try {
            double c;
            return c=a/b;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return 0;
        }
    }
}
public class ExceptionTest {
    public static void main(String[] args) {
        String str1=JOptionPane.showInputDialog("请输入：",null);
        String str2=JOptionPane.showInputDialog("请输入：",null);
        int a=Integer.parseInt(str1);
        int b=Integer.parseInt(str2);
        Division d=new Division();
        double c=d.division(a,b);
        JOptionPane.showMessageDialog(null,c);
    }
}
