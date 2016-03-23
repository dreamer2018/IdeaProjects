package src.Chapter6;

/**
 * Created by zhoupan on 15-11-16 上午9:29.
 */
public class StringTest {
    public static void main(String[] args) {
        String str1= new String("hello");
        String str2= new String("hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
