package Concepts;

import java.util.Scanner;

public class Nested_If_Else {
    public static void main(String[] arg)
    {
        int num1, num2, num3;

        Scanner obj=new Scanner(System.in);

        System.out.println("Enter Num 1:-");
        num1=obj.nextInt();
        System.out.println("Enter Num 2:-");
        num2=obj.nextInt();
        System.out.println("Enter Num 3:-");
        num3=obj.nextInt();

        if(num1>num2)
        {
            if(num1>num3)
                System.out.println("Num1 is greater");
            else
                System.out.println("Num3 is greater");
        }
        else
        {
            if(num2>num3)
                System.out.println("Num2 is greater");
            else
                System.out.println("Num3 is greater");
        }
    }
}
