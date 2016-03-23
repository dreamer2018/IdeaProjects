/**
 * Created by zhoupan on 16-1-3.
 */
import java.util.Scanner;
public class ScoreFind {
    public double findInfo(Score[] s,String name){
        for(Score sc : s) {
            if(name.equals(sc.name)){
                return sc.score;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Score[] s = new Score[100];
        ScoreFind scorefind = new ScoreFind();
        String name;
        double score,tmp;
        Scanner scanner =new Scanner(System.in);
        for (int i = 0; i <100 ; i++) {
            name=scanner.next();
            if(name.equals("noname")){
                break;
            }
            score=scanner.nextDouble();
            s[i]= new Score(name,score);
        }
        name=scanner.next();
        try {
            tmp = scorefind.findInfo(s, name);
            if (tmp < 0) {
                System.out.print("Not found.");
            } else {
                System.out.print(tmp * 0.21);
            }
        }catch (NullPointerException ne){
            System.out.print("Not found.");
        }
    }
}
class Score{
    public String name;
    public double score;

    public Score(String name, double score) {
        this.name = name;
        this.score = score;
    }
}
