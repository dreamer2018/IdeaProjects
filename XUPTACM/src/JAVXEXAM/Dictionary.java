package JAVXEXAM;
import java.util.Scanner;

/**
 * Created by zhoupan on 16-1-8.
 */
public class Dictionary {
    public static void main(String[] args) {
        String[] key = new String[100];
        String[] value = new String[100];
        Dictionary m = new Dictionary();
        String tmp;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < key.length; i++) {
            tmp=scanner.next();
            if(tmp.equals("end")){
                break;
            }
            key[i]=tmp;
            value[i]=scanner.next();
        }
        String find=scanner.next();
        String result=m.findValue(key,value,find);
        if(find.equals(result)){
            System.out.print("没找到。");
        }else{
            System.out.print(result);
        }

    }
    public String findValue(String[] key,String[] value,String str){
        for (int i = 0; i < key.length; i++) {
            if(str.equals(key[i])){
                return value[i];
            }
        }
        return str;
    }
}
