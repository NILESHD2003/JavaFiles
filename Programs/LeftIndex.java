package Programs;

import java.util.Scanner;

class Find{
    void find(int[] arr,int l,int x)
    {
        int a=-1,b=-1;
        for(int i=0;i<l;i++)
        {
            if (x==arr[i])
            {
                a=i;
                break;
            }
        }

        for (int j=l-1;j>=0;j--)
        {
            if (x==arr[j])
            {
                b=j;
                break;
            }
        }

        System.out.println(a+" "+b);
    }
}
public class LeftIndex {
    public static void main(String[] args)
    {
        int[] arr={9,3,0,7,3,9,4,3,0,4};//this can be generalised by using varArgs another function is needed
        int l= arr.length;
        int num;

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number to print:");
        num= scan.nextInt();

        Find f=new Find();

        f.find(arr,l,num);
    }
}
