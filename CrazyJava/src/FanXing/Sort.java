package FanXing;

/**
 * Created by zhoupan on 16-1-8.
 */

public class Sort{
    public static <E extends Comparable<E>> void selectionSort(E[] list){
        int n;
        E tmp;
        for (int i = 0; i < list.length; i++) {
            n=i;
            for (int j = i+1; j < list.length; j++) {
                if(list[n].compareTo(list[j])>0){
                    n=j;
                }
            }
            tmp=list[n];
            list[n]=list[i];
            list[i]=tmp;
        }
    }

    public static void main(String[] args) {
        Integer[]  a = {2,4,3,5,8,1,7};
        Sort.selectionSort(a);
        for(Integer i : a){
            System.out.printf("%d\t",i);
        }
    }
}
