package JAVXEXAM;

/**
 * Created by zhoupan on 16-1-8.
 */
import java.util.Calendar;
import  java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculation calculation = new Calculation();
        double a,b,c;
        for (int i = 0;i< 100 ; i++) {
            a=scanner.nextDouble();
            b=scanner.nextDouble();
            c=scanner.nextDouble();
            calculation.m1(a,b,c);
            if(!scanner.hasNext()){
                break;
            }
            else{
                System.out.println();
            }

        }
    }
    public void m1(double a,double b,double c){
        if(b*b-4*a*c<0){
            System.out.print("The equation has no real roots.");
        }
        else if(Math.abs(b*b-4*a*c)<10e-6){
            System.out.printf("The root is:%.2f.", ((-b / (2 * a))));
        }else{
            System.out.printf("The roots are %.2f and %.2f.",(-b+Math.sqrt((b*b-4*a*c)))/2*a,(-b-Math.sqrt((b*b-4*a*c)))/2*a);
        }
    }
}