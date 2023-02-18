package Concepts;
public class ArrayMethods {
    public static void main(String[] args) {

        int[] array={10,20,30};
        //.length can be used to print the size of array.
//        System.out.println(array.length);

        //--------------------------------------------------------------------------------------------------------------
        //Displaying array


        //Method 1---Naive(Simple) method
//        System.out.print(array[0]+" ");
//        System.out.print(array[1]+" ");
//        System.out.print(array[2]);

        //Method 2---Using For-loop
//        for(int i=0;i< array.length;i++)
//        {
//            System.out.print(array[i]+" ");
//        }

        //Method 3---Using Each-loop
        for(int element:array)
        {
            System.out.println(element);
        }


        //--------------------------------------------------------------------------------------------------------------
    }
}
