/**
 * Created by zhoupan on 15-12-29.
 */
import java.util.Scanner;
class PhoneNumber{

    public String name;
    public String number;

    public PhoneNumber(String name, String number) {
        this.name = name;
        this.number = number;
    }
}
public class FindNumber {
    public String findInfo(PhoneNumber[] ph,String name){
        for (PhoneNumber p : ph) {
            if(p.name.equals(name)){
                return p.number;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        FindNumber fd = new FindNumber();
        String name;
        String number;
        PhoneNumber[] ph= new PhoneNumber[100];
        for (int i = 0; i < 100 ; i++) {
            name=s.next();
            if(name.equals("noname")){
                break;
            }
            number=s.next();
            ph[i]= new PhoneNumber(name,number);
        }
        try {
            String str = fd.findInfo(ph, s.next());
            if (str != null) {
                System.out.println(str);
            }
        }catch (NullPointerException n){
            System.out.println("Not found.");
        }
    }
}
