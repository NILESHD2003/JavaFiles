package Programs;

import java.util.Scanner;

public class Threenumsgreatest {
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the Three Numbers:");
        int a=S.nextInt();
        int b=S.nextInt();
        int c=S.nextInt();

        if((a>b)&&(a>c))
        {
            System.out.println(a + " is the greatest number.");
        }
        else if ((b>c)&&(b>a))
        {
            System.out.println(b + " is the greatest number");
        }
        else
            System.out.println(c +" is the greatest number");
    }
}
