package Concepts;

import java.util.Scanner;

public class Condition_If {
    public static void main(String[] arg){
        int pass;

        Scanner Scan=new Scanner(System.in);

        System.out.print("Enter Your Password:");
        pass=Scan.nextInt();
        if(pass==1111)
        {
            System.out.print("Hello!");
        }
    }
}
