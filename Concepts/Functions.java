package Concepts;

import java.util.Scanner;

 class Addition{
    int Add(int x, int y)
    {
        int sum;

        sum=x+y;

        return sum;
    }
}

public class Functions {

    public static void main(String[] args)
    {
        /*Functions are called as Methods in Java*/
        Scanner Scan=new Scanner(System.in);

        System.out.print("Enter A:");
        int a= Scan.nextInt();

        System.out.print("Enter b:");
        int b= Scan.nextInt();

        Addition obj=new Addition();

        int add = obj.Add(a,b);

        System.out.println("Addition is "+add);
    }
}
