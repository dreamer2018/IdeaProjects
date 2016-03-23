import java.text.DecimalFormat;

/**
 * Created by zhoupan on 16-1-7.
 */
public class test {
    public static void main(String[] args) {
        double b;
        b=100.45;
        //保留一位小数,四舍五入
        System.out.println(new DecimalFormat("0.0").format(b));  //100.5
        //保留一位小数，四射无入
        System.out.println(new DecimalFormat("#.#").format(b));  //100.5
        b=11.0023;
        //保留两位小数,四舍五入
        System.out.println(new DecimalFormat("0.00").format(b));  //11.00
        //保留两位小数，四射五入，但当末尾位0时，自动忽略
        System.out.println(new DecimalFormat("#.##").format(b));  //11
        b=20000.23456;
        //格式化分隔数字
        System.out.println(new DecimalFormat("#,##,###.####").format(b)); //20,000.2346
        b=0.23365;
        //按百分制输出,保留两位小数
        System.out.println(new DecimalFormat("#.##%").format(b)); //23.36%
        b=0.23366;
        System.out.println(new DecimalFormat("#.##%").format(b)); //23.37%
        b=123.455;
        //将所有数字加上负号输出,保留两位小数
        System.out.println(new DecimalFormat("-#.##").format(b)); //-123.45
        b=-123.456;
        System.out.println(new DecimalFormat("-#.##").format(b)); //--123.46
        b=0.00235;
        //按科学计数法输出,保留两位小数
        System.out.println(new DecimalFormat("#.##E0").format(b)); //2.35E-3
        b=0.00236;
        System.out.println(new DecimalFormat("#.##E0").format(b)); //2.36E-3
    }
}
