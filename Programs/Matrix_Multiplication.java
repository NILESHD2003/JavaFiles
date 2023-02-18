package Programs;

import java.util.Scanner;

class Matrix{
    int[][] matrix_input(int x,int y)
    {
        int[][]X=new int[x][y];

        Scanner sc=new Scanner(System.in);

        int a=1;
        for (int i=0;i<x;i++)
        {
            int b=1;
            for (int j=0;j<y;j++)
            {
                System.out.print("Element["+a+"]["+b+"]=");
                X[i][j]=sc.nextInt();
                b++;
            }
            a++;
        }
        return X;
    }
    void matrix_multiplication(int[][] a,int[][] b,int[][] c,int size)
    {
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                c[i][j]=0;
                for(int k=0;k<size;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }//end of k loop
                System.out.print(c[i][j]+" ");
            }//end of j loop
            System.out.println();
        }
    }

}

public class Matrix_Multiplication{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Matrix obj=new Matrix();

        System.out.println("Enter for Matrix A");
        System.out.print("Rows:");
        int rows_a=scan.nextInt();
        System.out.print("Columns:");
        int col_a=scan.nextInt();
        System.out.println("");
        System.out.println("Enter for Matrix B");
        System.out.print("Rows:");
        int rows_b=scan.nextInt();
        System.out.print("Columns:");
        int col_b=scan.nextInt();
        System.out.println("");

        int[][]A=new int[rows_a][col_a];
        int[][]B=new int[rows_b][col_b];
        int[][]C=new int[rows_a][col_b];

        //taking input of A and B using method

        System.out.println("Enter matrix A");
        A=obj.matrix_input(rows_a,col_a);
        System.out.println("Enter matrix B");
        B=obj.matrix_input(rows_b,col_b);

        //multiplying matrix

        System.out.println("Multiplication:");
        obj.matrix_multiplication(A,B,C,rows_b);

    }
}