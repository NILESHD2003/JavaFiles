package Programs;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter no of elements to be added:");
        int size=scan.nextInt();
        int[] array=new int[size];

        System.out.println("Array of size "+size+" created successfully");

        for(int i=0;i< array.length;i++)
        {
            System.out.print("Enter Element "+i+1+":");
            array[i]=scan.nextInt();
        }

        System.out.println("Sorting the array");
        int temp;
        for(int i=0; i < size; i++){
            for(int j=1; j < (size-i); j++){
                if(array[j-1] > array[j])
                {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Sorted array is:");
        for (int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
