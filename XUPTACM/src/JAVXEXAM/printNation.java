package JAVXEXAM;

/**
 * Created by zhoupan on 16-1-7.
 */

import java.util.Scanner;
class National{
    String[] nation1 = new String[4];
    String[] nation2 = new String[4];
    public void initInfo(){
        nation1[0]="中国";
        nation2[0]="日本";
        nation1[1]="韩国";
        nation2[1]="美国";
        nation1[2]="英国";
        nation2[2]="加拿大";
        nation1[3]="巴西";
        nation2[3]="法国";
    }
    public String findInfo(String name){
        for (int i = 0; i <nation1.length ; i++) {
            if(nation1[i].equals(name))
            {
                return nation2[i];
            }
        }
        for (int i = 0; i <nation2.length ; i++) {
            if(nation2[i].equals(name)){
                return nation1[i];
            }
        }
        return name;
    }
}
public class printNation{
    public static void main(String[] args) {
        National national = new National();
        Scanner scanner = new Scanner(System.in);
        String name=scanner.next();
        national.initInfo();
        String name2=national.findInfo(name);
        if(name.equals(name2)){
            System.out.printf("%s今日无比赛", name);
        }else {
            System.out.print(name2);
        }
    }
}