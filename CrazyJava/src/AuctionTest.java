import java.util.DoubleSummaryStatistics;

/**
 * Created by zhoupan on 12/3/15.
 */
class AuctionException extends Exception{
    public AuctionException(){

    }
    public AuctionException(String msg){
        super(msg);
    }
}
public class AuctionTest {
    private double initPrice=30;
    public void bid(String bidPrice) throws AuctionException{
        double d=0;
        try {
            d= Double.parseDouble(bidPrice);
        }catch (Exception e){
            e.printStackTrace();
            throw new AuctionException("价格必须是数值，不能包含其他字符");
        }
        if(initPrice>d){
            throw new AuctionException("竞拍价比起价低，不允许竞拍");
        }
        initPrice=d;
    }

    public static void main(String[] args) {
        AuctionTest at=new AuctionTest();
        try {
            at.bid("df");
        }catch (AuctionException a){
            System.out.println(a.getMessage());

        }
    }
}
