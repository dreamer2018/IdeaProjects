/**
 * Created by zhoupan on 9/22/15.
 */
import java.util.Scanner;
public class question2 {
    public static void main(String[] args){
        for(int i=1;i<=8;i++){
            for(int j=1;j<=8-i;j++){
                System.out.print("\t");
            }
            for(int j=0;j<i;j++){
                int a=2,b;
                b=(int)Math.pow(a,j);
                System.out.printf("%3d\t",b);
            }
            for(int j=i-2;j>=0;j--){
                int a=2,b;
                b=(int)Math.pow(a,j);
                System.out.printf("%3d\t",b);
            }

            System.out.println();
        }
    }
}
