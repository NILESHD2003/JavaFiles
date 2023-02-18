package Concepts;

import java.util.Scanner;

public class Condition_If_Else {
    public static void main(String[] arg)
    {
        int pass;

        Scanner Scan=new Scanner(System.in);

        System.out.print("Enter Your Password:");
        pass=Scan.nextInt();
        if(pass==1111)
        {
            System.out.print("Hello!");
        }
        else
            System.out.print("Wrong Password");
    }
}
