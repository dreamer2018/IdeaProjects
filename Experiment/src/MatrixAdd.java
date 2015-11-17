/**
 * Created by zhoupan on 15-11-17 下午9:22.
 */
import java.util.Scanner;

class Matrix{

    //矩阵的长
    private int x;
    //矩阵的宽
    private int y;
    //创建一个矩阵
    private double[][] matrix=new double[3][3];

    //矩阵的无参构造器，默认为3*3矩阵
    public Matrix(){
        this.x=3;
        this.y=3;
    }
    //矩阵的有参构造器
    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setMatrix(double[][] matrix){
        this.matrix=matrix;
    }
    //矩阵的get方法，用于获取矩阵
    public double[][] getMatrix() {
        return matrix;
    }
}

public class MatrixAdd {

    public double[][] addMatrix(double[][] matrix1, double[][] matrix2 ){

        double[][] temp= new double[matrix1.length][matrix1.length];
        for (int i = 0; i <temp.length; i++) {
               for(int j=0;j<temp[i].length;j++){
                   temp[i][j]=matrix1[i][j]+matrix2[i][j];
               }
        }
        return temp;
    }

    public void printResult(double[][] a, double[][] b, double[][] c){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]+" \t");
            }
            if(i==1){
                System.out.print("+\t");
            }else {
                System.out.print("\t");
            }
            for (int j = 0; j <b[i].length ; j++) {
                System.out.print(b[i][j]+" \t");
            }
            if(i==1){
                System.out.print("=\t");
            }else {
                System.out.print("\t");
            }
            for (int j = 0; j <c[i].length ; j++) {
                System.out.print(c[i][j]+" \t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        MatrixAdd ma=new MatrixAdd();

        double[][] array1=new double[3][3];
        double[][] array2=new double[3][3];


        for(int i=0;i<array1.length;i++){
            for (int j=0; j< array1[i].length; j++){
                array1[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<array2.length;i++){
            for (int j=0; j< array2[i].length; j++){
                array2[i][j]=s.nextInt();
            }
        }

        //创建两个矩阵对象
        Matrix m1=new Matrix(3,3);
        Matrix m2=new Matrix(3,3);

        //初始化两个矩阵
        m1.setMatrix(array1);
        m2.setMatrix(array2);

        //按格式打印出结果
        ma.printResult(m1.getMatrix(),m2.getMatrix(),ma.addMatrix(m1.getMatrix(),m2.getMatrix()));
    }
}
