/**
 * Created by zhoupan on 10/22/15.
 */
public class PersonTest{
    public static void main(String[] args){
        GetSet gt=new GetSet("Bob");
        GetSet gt1=gt;
        gt.setId(1001);
        gt.setSex(false);
        gt.setScore(90.0);
        gt1.toString();
    }

}
