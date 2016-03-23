/**
 * Created by zhoupan on 15-12-29.
 */
import java.util.Scanner;

public class NameSort {
    public Comparable[] Sort(Comparable[] name){
        Comparable c=null;
        int k;
        for (int i = name.length-1; i>=0 ; i--) {
            k=i;
            for (int j = 0 ; j < i ; j++) {
                if(name[k].compareTo(name[j]) < 0){
                    k=j;
                }
            }
            if (k!=i) {
                c = name[i];
                name[i] = name[k];
                name[k] = c;
            }
        }
        return name;
    }

    public static void main(String[] args) {
        NameSort ns= new NameSort();
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        Comparable[] name= new Comparable[n];
        for (int i = 0; i < n; i++) {
            name[i]=s.next();
        }
        name=ns.Sort(name);
        for (int i=0;i<n;i++){
            if(i<n-1){
                System.out.println(name[i]);
            }
            else {
                System.out.print(name[i]);
            }
        }
    }
}
