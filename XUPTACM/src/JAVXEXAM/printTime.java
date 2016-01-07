package JAVXEXAM;

/**
 * Created by zhoupan on 16-1-7.
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class printTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long time = scanner.nextLong();
        long days = scanner.nextLong();
        long time2 = time + days*1000*60*60*24;
        Date date1 = new Date(time);
        Date date2 = new Date(time2);
        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf.format(date1));
        System.out.print(sdf.format(date2));
    }
}
