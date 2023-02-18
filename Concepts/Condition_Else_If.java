package Concepts;

import java.util.Scanner;

public class Condition_Else_If {
    public static void main(String[] arg)
    {
        int age;

        Scanner S =new Scanner(System.in);

        System.out.println("Enter Your Age:");
        age=S.nextInt();

        if((age>=60)&&(age<=100))
            System.out.println("Your age is more than 60");
        else if(age<=18)
            System.out.println("Your age is less than or equals to 18");
        else
            System.out.println("Enter Valid age");
    }
}
