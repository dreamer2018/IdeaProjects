/**
 * Created by zhoupan on 15-11-17 下午9:22.
 */
class Matrix{

    //创建一个矩阵
    private int[][] matrix=new int[3][3];

    //矩阵的set方法，用于初始化矩阵
    public void setMatrix(int[][] matrix1) {
        this.matrix = matrix1;
    }

    //矩阵的get方法，用于获取矩阵
    public int[][] getMatrix() {
        return matrix;
    }
}

public class MatrixAdd {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
