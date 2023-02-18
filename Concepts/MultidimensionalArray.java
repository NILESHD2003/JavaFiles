package Concepts;

public class MultidimensionalArray {
    public static void main(String[] args) {

        //initalizing 2D array
        int[][] array=new int[2][2];
        //accessing array
        array[0][0]=100;
        array[0][1]=101;
        array[1][0]=102;
        array[1][1]=103;

        //dispaying array using for loop
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.println(array[i][j]);
            }
        }

    }
}
