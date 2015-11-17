/**
 * Created by zhoupan on 15-11-17 下午4:51.
 */

import java.util.Random;
class Cards{

    //创建纸牌
    private int[]  cards=new int[52];

    //对纸牌进行初始化
    {
        for(int i=0,j=0;i<52;i++){
            if(i%4==0){
                j++;
            }
            cards[i]=j;
        }
    }
    //创建纸牌的get方法
    public int[] getCards() {
        return cards;
    }
}

public class CardsGame{

    //获取一张纸牌
    public int getCard(int[] cards){

        Random r=new Random();

        //netInt(int num)：产生0-51之间的随机数
        return cards[r.nextInt(52)];
    }

    //获取四张牌的和
    public int getCardsSum(Cards c){

        int num=0;

        for(int i=0;i<4;i++) {
            num+=this.getCard(c.getCards());
        }

        return num;
    }

    public static void main(String[] args) {

        int num;

        //创建纸牌游戏的对象
        CardsGame cg=new CardsGame();

        for(int i=1;;i++) {
            num = cg.getCardsSum(new Cards());
            if(num==24){
                System.out.printf("选了%d次牌\n",i);
                break;
            }
        }
    }
}