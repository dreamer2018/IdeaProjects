package JAVXEXAM;

import java.util.Scanner;
/**
 * Created by zhoupan on 16-1-8.
 */
public class CharSort {
    public void Sort(String name){
        int k;
        char[] c = name.toCharArray();
        for (int i = 0; i<name.length() ; i++) {
            k=i;
            for (int j =i+1 ; j < name.length() ; j++) {
                if( c[k]>c[j]){
                    k=j;
                }
            }
            if (k!=i) {
                char  ch = c[i];
                c[i]=c[k];
                c[k]=ch;
            }
        }
        name=name.valueOf(c);
        System.out.print(name);
    }
    public static void main(String[] args) {
        CharSort cs= new CharSort();
        int n,i;
        Scanner s= new Scanner(System.in);
        String[] name = new String[100];
        for (i = 0; i < 100; i++) {
            if(s.hasNext()){
                System.out.println();
            }
            cs.Sort(s.next());
        }
    }
}