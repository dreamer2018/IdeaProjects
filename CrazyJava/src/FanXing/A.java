package FanXing;

import java.util.Objects;

/**
 * Created by zhoupan on 16-1-8.
 */
public class A extends Apple<String>{
    public String getInfo(){
        return "子类"+super.getInfo();
    }
}
