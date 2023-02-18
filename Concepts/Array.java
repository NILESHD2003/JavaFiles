package Concepts;
public class Array {
    public static void main(String[] args) {
        //creating array
        int[] array=new int[3];//here array is object and new word allocates memory.
        //initializing array
        array[0]=1;
        array[1]=2;
        array[2]=3;
        /*
        or it can be written as
        >>>int[] array = {1,2,3,4,5};>>>here the size will be declared automatically.
         */

        //displaying array

        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
