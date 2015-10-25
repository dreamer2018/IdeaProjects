/**
 * Created by zhoupan on 15-10-25.
 */
import java.util.Scanner;

public class HuaRongChess{

    //初始化棋盘
    public void initChessBoard(String[][] chessboard) {
        chessboard[0][0] = "马";
        chessboard[0][1] = "曹";
        chessboard[0][2] = "操";
        chessboard[0][3] = "张";
        chessboard[1][0] = "超";
        chessboard[1][1] = "曹";
        chessboard[1][2] = "操";
        chessboard[1][3] = "飞";
        chessboard[2][0] = "赵";
        chessboard[2][1] = "关";
        chessboard[2][2] = "羽";
        chessboard[2][3] = "黄";
        chessboard[3][0] = "云";
        chessboard[3][1] = "丙";
        chessboard[3][2] = "丁";
        chessboard[3][3] = "忠";
        chessboard[4][0] = "  ";
        chessboard[4][1] = "甲";
        chessboard[4][2] = "  ";
        chessboard[4][3] = "乙";
    }
    //打印出棋盘的分布
    public void printChessBoard(String[][] chessboard){

        System.out.print("\n");
        for(int i=0; i<chessboard.length; i++){
            System.out.print("\t");
            for(int j=0; j<chessboard[i].length; j++){
                System.out.print(chessboard[i][j]);
            }
            System.out.println();

        }
    }
    //检测是否可以移动
    public boolean isMove(String[][] chessboard, String str, String direction) {
        int sign = 0;
        System.out.println(str + " " + direction);
        if (direction.equals("上")) {
            for (int i = 0; i < chessboard.length; i++) {
                for (int j = 0; j < chessboard[i].length; j++) {
                    if (str.length() == 1) {  /*输入一个字符时*/
                        if (str.charAt(0) == chessboard[i][j].charAt(0)) {
                            sign = 1;
                            if (i <= 0) {
                                return false;
                            }else if (!chessboard[i - 1][j].equals("  ") && chessboard[i - 1][j].charAt(0) != str.charAt(0)){
                                return false;
                            }
                        }
                    } else { /*输入多个字符时*/
                        if (str.charAt(0) == chessboard[i][j].charAt(0) || str.charAt(1) == chessboard[i][j].charAt(0)) {
                            sign = 1;
                            if (i <= 0) {
                                return false;
                            }else if (!chessboard[i - 1][j].equals("  ") && chessboard[i - 1][j].charAt(0) != str.charAt(0) && chessboard[i - 1][j].charAt(0) != str.charAt(1)) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (sign == 1) {
                return true;
            } else {
                return false;
            }
        } else if (direction.equals("下")) {
            for (int i = 0; i < chessboard.length; i++) {
                for (int j = 0; j < chessboard[i].length; j++) {
                    if (str.length()==1){
                        if (str.charAt(0) == chessboard[i][j].charAt(0)) {
                            sign = 1;
                            if (i >= 4) {
                                return false;
                            } else if (!chessboard[i + 1][j].equals("  ")&& chessboard[i + 1][j].charAt(0) != str.charAt(0)) {
                                return false;
                            }
                        }
                    }
                    else{
                        if (str.charAt(0) == chessboard[i][j].charAt(0) || str.charAt(1) == chessboard[i][j].charAt(0)) {
                            sign = 1;
                            if (i >= 4) {
                                return false;
                            } else if (!chessboard[i + 1][j].equals("  ") && chessboard[i + 1][j].charAt(0) != str.charAt(0) && chessboard[i + 1][j].charAt(0) != str.charAt(1) ) {
                                System.out.print(chessboard[i+1][j]+"test2"+str);
                                return false;
                            }
                        }
                    }
                }
            }
            if (sign == 1) {
                return true;
            }
            else{
                return false;
            }
        }
        else if (direction.equals("左")) {
            for (int i = 0; i < chessboard.length; i++) {
                for (int j = 0; j < chessboard[i].length; j++) {
                    if(str.length()==1) {
                        if (str.charAt(0) == chessboard[i][j].charAt(0)) {
                            sign = 1;
                            if (j <= 0) {
                                return false;
                            } else if (!chessboard[i][j-1].equals("  ") && chessboard[i][j-1].charAt(0) != str.charAt(0)) {
                                return false;
                            }
                        }
                    }
                    else
                    {
                        if (str.charAt(0) == chessboard[i][j].charAt(0) || str.charAt(1) == chessboard[i][j].charAt(0)) {
                            sign = 1;
                            System.out.println("test");
                            if (j <= 0) {
                                return false;
                            } else if (!chessboard[i][j-1].equals("  ") && chessboard[i][j-1].charAt(0) != str.charAt(0) && chessboard[i][j-1].charAt(0) != str.charAt(1)) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (sign == 1) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (direction.equals("右")) {
            for (int i = 0; i < chessboard.length; i++) {
                for (int j = 0; j < chessboard[i].length; j++) {
                    if(str.length()==1) {
                        if (str.charAt(0) == chessboard[i][j].charAt(0)) {
                            sign = 1;
                            if (j >= 4) {
                                return false;
                            } else if (!chessboard[i][j+1].equals("  ") && chessboard[i][j+1].charAt(0) != str.charAt(0)) {
                                return false;
                            }
                        }
                    }
                    else{
                        if (str.charAt(0) == chessboard[i][j].charAt(0) || str.charAt(1) == chessboard[i][j].charAt(0)) {
                            sign = 1;
                            if (j >= 4) {
                                return false;
                            } else if (!chessboard[i][j+1].equals("  ") && chessboard[i][j+1].charAt(0) != str.charAt(0) && chessboard[i][j+1].charAt(0) != str.charAt(1) ) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (sign == 1) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    //移动棋子
    public void moveChessPiece(String[][] chessboard, String str, String direction) {
        int sign = 0;
        if (direction.equals("上")){
            for (int i = 0; i < chessboard.length; i++) {
                for (int j = 0; j < chessboard[i].length; j++) {
                    if(str.length()==1) {
                        if (str.charAt(0) == chessboard[i][j].charAt(0)) {
                            chessboard[i - 1][j] = chessboard[i][j];
                            chessboard[i][j] = "  ";
                        }
                    }
                    else {
                        if (str.charAt(0) == chessboard[i][j].charAt(0) || str.charAt(1) == chessboard[i][j].charAt(0)) {
                            chessboard[i - 1][j] = chessboard[i][j];
                            chessboard[i][j] = "  ";
                        }
                    }
                }
            }
        } else if (direction.equals("下")) {
            for (int i = chessboard.length-2; i >=0 ; i--) {
                for (int j =0; j<chessboard[i].length; j++) {
                    if(str.length()==1) {
                        if (str.charAt(0) == chessboard[i][j].charAt(0)) {
                            chessboard[i + 1][j] = chessboard[i][j];
                            chessboard[i][j] = "  ";
                        }
                    }
                    else{
                        if (str.charAt(0) == chessboard[i][j].charAt(0) || str.charAt(1) == chessboard[i][j].charAt(0)) {
                            chessboard[i + 1][j] = chessboard[i][j];
                            chessboard[i][j] = "  ";
                        }
                    }
                }
            }
        } else if (direction.equals("左")) {
            for (int i = 0; i < chessboard.length; i++) {
                for (int j = 0; j < chessboard[i].length; j++) {
                    if(str.length()==1) {
                        if (str.charAt(0) == chessboard[i][j].charAt(0)) {
                            chessboard[i][j - 1] = chessboard[i][j];
                            chessboard[i][j] = "  ";
                        }
                    }
                    else{
                        if (str.charAt(0) == chessboard[i][j].charAt(0) || str.charAt(1) == chessboard[i][j].charAt(0)) {
                            chessboard[i][j - 1] = chessboard[i][j];
                            chessboard[i][j] = "  ";
                        }
                    }
                }
            }
        } else if (direction.equals("右")) {
            for (int i = 0; i < chessboard.length; i++) {
                for (int j = chessboard[i].length-2; j >=0; j--) {
                    if(str.length()==1) {
                        if (str.charAt(0) == chessboard[i][j].charAt(0)) {
                            chessboard[i][j + 1] = chessboard[i][j];
                            chessboard[i][j] = "  ";
                        }
                    }
                    else
                    {
                        if (str.charAt(0) == chessboard[i][j].charAt(0) || str.charAt(1) == chessboard[i][j].charAt(0)) {
                            chessboard[i][j + 1] = chessboard[i][j];
                            chessboard[i][j] = "  ";
                        }
                    }
                }
            }
        }
    }
    //检测是否成功
    public boolean isSuccessful(String[][] chessboard){
        if(chessboard[4][1]=="曹" && chessboard[4][2]=="操"){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        String[][] chessboard= new String[5][4];
        HuaRongChess hrc= new HuaRongChess();
        Scanner scanner=new Scanner(System.in);
        hrc.initChessBoard(chessboard);

        for(int i=0;;i++)
        {
            hrc.printChessBoard(chessboard);
            System.out.print("请输入：");
            String name=scanner.next();
            String direction=scanner.next();
            if(hrc.isMove(chessboard,name,direction)){
                hrc.moveChessPiece(chessboard, name, direction);
            }else if(hrc.isSuccessful(chessboard)){
                System.out.println("恭喜你,游戏通关了！");
                break;
            }
            else{
                System.out.println(name+"无法向"+direction+"移动,请重新输入！");
            }
        }
    }
}
