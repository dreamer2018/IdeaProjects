import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

/**
 * Created by zhoupan on 15-12-29.
 */
public class DateConversion {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long time=scanner.nextLong();
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.print(sdf.format(1452168358));
    }
}
