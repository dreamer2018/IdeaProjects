import java.io.*;

/**
 * Created by zhoupan on 12/2/15.
 */
public class AutoCloseTest {
    public static void main(String[] args) throws IOException{
        try (
                BufferedReader br=new BufferedReader(new FileReader("src/AutoCloseTest.java"));
                PrintStream ps=new PrintStream(new FileOutputStream("a.txt"));
        )
        {
            System.out.println(br.readLine());
            ps.println("hello world");
        }
    }
}
