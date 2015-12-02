import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by zhoupan on 12/2/15.
 */
public class FinallyTest {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try{
            fis=new FileInputStream("src/Circle.java");
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
           // return;
            //System.exit(0);
        }finally {
            if(fis!=null){
                try{
                    fis.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            System.out.println("执行finally块里的资源回收！");
        }

    }
}
