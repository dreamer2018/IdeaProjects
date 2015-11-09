/**
 * Created by zhoupan on 15-11-9 下午8:15.
 */
import java.lang.*;
import java.util.Scanner;
public class JavaQuestion3{

    public static Object max(Comparable[] a){
        Comparable max;
        max=a[0];
        for(int i=1;i<a.length;i++){
            if(max.compareTo(a[i])<0){
                max=a[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Comparable[] str={s.next(),s.next(),s.next(),s.next(),s.next()};
        Comparable[] a={s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        System.out.println("Max string is "+JavaQuestion3.max(str));
        System.out.println("Max integer is "+JavaQuestion3.max(a));
    }
}
