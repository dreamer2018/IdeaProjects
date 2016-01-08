package JAVXEXAM;

/**
 * Created by zhoupan on 16-1-8.
 */

import java.math.BigInteger;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String str=scanner.next();
        char c='\0';
        int n=0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)=='+'){
                c='+';
                n=i;
                break;
            }else if(str.charAt(i)=='-'){
                c='-';
                n=i;
                break;
            }else if(str.charAt(i)=='*'){
                c='*';
                n=i;
                break;
            }else if(str.charAt(i)=='/'){
                c='/';
                n=i;
                break;
            }
        }
        char[] ch1 = new char[n];
        char[] ch2 = new char[str.length()-n-1];
        for (int i = 0,j=-1; i < str.length(); i++) {
            if(i<n){
                ch1[i]=str.charAt(i);
            }else if(i==n){

            } else {
                j++;
                ch2[j]=str.charAt(i);
            }
        }
        String str1 = String.valueOf(ch1);
        String str2 = String.valueOf(ch2);
        BigInteger b1 = new BigInteger(str1);
        BigInteger b2 = new BigInteger(str2);
        calculator.countNum(b1,b2,c);
    }
    public void  countNum(BigInteger b1,BigInteger b2,char ch){
        BigInteger b;
        switch (ch){
            case '+':
                b = b1.add(b2);
                System.out.println(b.toString());
                break;
            case '-':
                b = b1.subtract(b2);
                System.out.println(b.toString());
                break;
            case '*':
                b=b1.multiply(b2);
                System.out.println(b.toString());
                break;
            case '/':
                b=b1.divide(b2);
                System.out.println(b.toString());
                break;
        }
    }
}
