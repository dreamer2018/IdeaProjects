/**
 * Created by zhoupan on 15-12-29.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class CharReplace {
    public static void main(String[] args) {
        int i,j;
        Scanner s = new Scanner(System.in);
        String[]  fstr = new String[100];
        String[] lstr = new String[100];
        String tmp;
        for ( i = 0; i < 100 ; i++) {
            tmp=s.next();
            if(tmp.equals("end")){
                break;
            }
            fstr[i]=tmp;
        }
        String str1=s.next();
        String str2=s.next();
        for (j= 0; j < i ; j++) {
            Pattern pattern = Pattern.compile(str1);
            Matcher matcher = pattern.matcher(fstr[j]);
            lstr[j] = matcher.replaceAll(str2);
        }
        for (int k = 0; k < i ; k++) {
            if(k < i-1) {
                System.out.println(lstr[k]);
            }else{
                System.out.print(lstr[k]);
            }
        }
    }
}
