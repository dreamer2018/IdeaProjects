/**
 * Created by zhoupan on 15-11-10 下午12:36.
 */
public class EqualTest {
    public static void main(String[] args) {
        int i1=65;
        float i2=65f;
        char i3='A';
        System.out.println(i1 == i2);
        System.out.println(i1==i3);
        System.out.println(i2==i3);
        String s1=new String("hello");
        String s2="hello";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3=s1;
        System.out.println(s3==s1);
        System.out.println(s3.equals(s1));
        
    }
}
