/**
 * Created by zhoupan on 15-11-10 上午8:52.
 */
public class Primitive2String {
    public static void main(String[] args) {

        String intstr="123";
        int int1=Integer.parseInt(intstr);
        int int2=new Integer(intstr);
        System.out.println("int1="+int1+",int2="+int2);
        String str1=String.valueOf("123");
        String str2=String.valueOf("false");
        System.out.println("str1="+str1+"str2="+str2);
        Integer a1=129;
        Integer a2=128;
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        System.out.println(Boolean.compare(true,false));
        System.out.println(Boolean.compare(true,true));
        System.out.println(Boolean.compare(false,true));
        System.out.println(Integer.compare(2,3));
    }
}
