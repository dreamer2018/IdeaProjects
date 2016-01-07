/**
 * Created by zhoupan on 16-1-7.
 */
public class test {
    public static void main(String[] args) {
        Integer s = new Integer(9);
        Integer t = new Integer(9);
        Long u = new Long(9);
        System.out.println(s.equals(new Integer(9)));  //true
        System.out.println(s==t);   //false
        System.out.println(s.equals(9));   //true
        //System.out.println(s==u);
    }
}
