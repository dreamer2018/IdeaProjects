/**
 * Created by zhoupan on 15-11-10 上午8:14.
 */
package Chapter6;

import java.util.DoubleSummaryStatistics;

public class Primitive2Wrapper {
    public static void main(String[] args) {
        Boolean b=new Boolean("TRue");
        System.out.println(b.booleanValue());
        Long l=new Long("1234");
        System.out.println(l.intValue());
        Double d=new Double("12.534");
        System.out.println(d.doubleValue());

    }
}
