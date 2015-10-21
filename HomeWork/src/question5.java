/**
 * Created by zhoupan on 9/24/15.
 */
import javax.swing.*;
public class question5 {
    public static void main(String[] args){
        int sign,result=0;
        String[][] str=new String[6][];
        String[] last_name=new String[]{"赵","钱","孙","李","周","吴","郑","王", "冯","陈","楮","卫","蒋","沈","韩","杨", "朱","秦","尤","许","何","吕","施","张", "孔","曹","严","华","金","魏","陶","姜", "戚","谢","邹","喻","柏","水","窦","章", "云","苏","潘","葛","奚","范","彭","郎", "鲁","韦","昌","马","苗","凤","花","方", "俞","任","袁","柳","酆","鲍","史","唐"};
        int[] num=new int[6];
        str[0]=new String[]{"赵    ","孙    ","周    ","郑    \n","冯    ","褚    ","蒋    ","韩    \n","朱    ","尤    ","何    ","施    \n","孔    ","严    ","金    ","陶    \n","戚    ","邹    ","柏    ","窦    \n","云    ","潘    ","奚    ","彭    \n","鲁    ","昌    ","苗    ","花    \n","俞    ","袁    ","酆    ","史    \n"};
        str[1]=new String[]{"钱    ","孙    ","吴    ","郑    \n","陈    ","褚    ","沈    ","韩    \n","秦    ","尤    ","吕    ","施    \n","曹    ","严    ","魏    ","陶    \n","谢    ","邹    ","水    ","窦    \n","苏    ","潘    ","范    ","彭    \n","韦    ","昌    ","凤    ","花    \n","任    ","袁    ","鲍    ","史    \n"};
        str[2]=new String[]{"李    ","周    ","关    ","郑    \n","卫    ","蒋    ","沈    ","韩    \n","讨    ","何    ","吕    ","施    \n","华    ","金    ","魏    ","陶    \n","俞    ","柏    ","水    ","窦    \n","葛    ","奚    ","范    ","彭    \n","马    ","苗    ","风    ","花    \n","柳    ","酆    ","鲍    ","史    \n"};
        str[3]=new String[]{"王    ","冯    ","陈    ","褚    \n","卫    ","蒋    ","沈    ","韩    \n","张    ","孔    ","曾    ","严    \n","华    ","金    ","魏    ","陶    \n","章    ","云    ","苏    ","潘    \n","葛    ","奚    ","范    ","彭    \n","方    ","俞    ","任    ","袁    \n","柳    ","酆    ","鲍    ","史    \n"};
        str[4]=new String[]{"杨    ","朱    ","泰    ","龙    \n","许    ","何    ","吕    ","施    \n","张    ","孔    ","曾    ","严    \n","华    ","金    ","魏    ","陶    \n","郎    ","鲁    ","韦    ","昌    \n","马    ","苗    ","凤    ","花    \n","方    ","俞    ","任    ","袁    \n","柳    ","酆    ","鲍    ","史    \n"};
        str[5]=new String[]{"姜    ","戚    ","谢    ","邹    \n","喻    ","柏    ","水    ","窦    \n","章    ","云    ","苏    ","潘    \n","葛    ","奚    ","范    ","彭    \n","郎    ","鲁    ","韦    ","昌    \n","马    ","苗    ","凤    ","花    \n","方    ","俞    ","任    ","袁    \n","柳    ","酆    ","鲍    ","史    \n"};
        for(int i=0;i<6;i++) {
            sign = JOptionPane.showConfirmDialog(null, "Yout Last Name In Here ?\n" + str[i][0] + str[i][1] + str[i][2] + str[i][3] + str[i][4] + str[i][5] + str[i][6] + str[i][7] + str[i][8] + str[i][9] + str[i][10] + str[i][11] + str[i][12] + str[i][13] + str[i][14] + str[i][15] + str[i][16] + str[i][17] + str[i][18] + str[i][19] + str[i][20] + str[i][21] + str[i][22] + str[i][23] + str[i][24] + str[i][25] + str[i][26] + str[i][27] + str[i][28] + str[i][29] + str[i][30] + str[i][31]);
            if (sign == 0) {
                num[i] = 1;
            } else if (sign == 1) {
                num[i] = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Not Found Your Last Name\n");
                return;
            }
        }
        for(int i=0;i<6;i++)
        {
            result+=num[i]*Math.pow(2,i);
        }
        //JOptionPane.showMessageDialog(null,"result="+result);
        JOptionPane.showMessageDialog(null,"Your Last Name Is: "+last_name[result-1]);
    }
}
