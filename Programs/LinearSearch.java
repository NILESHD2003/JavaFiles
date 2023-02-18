package Programs;

import java.util.Scanner;

public class LinearSearch
{
    static int search(int []arr,int size,int x)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr={9,3,0,7,3,9,4,3,0,4};
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        int s=S.nextInt();
        int value= arr.length;

        int Ans=search(arr,value,s);

        System.out.println(Ans);
    }
}
