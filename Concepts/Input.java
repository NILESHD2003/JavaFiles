package Concepts;

import java.util.Scanner;

public class Input {
    public static void main(String[] args)
    {
        /*
        //notes
            here we can take inputs by using Scanner class.Here S is always capital.java.util.Scanner is a predefined class
            new keyword is used to take input in java.Functions in java are called as methods.
            There are different types of predefined-methods to take input which are defined in Scanner class
            for integer----nextInt()
            for double-----nextDouble()
            for string-----nextLine()
        */
        //Additon Program
        int a,b,c;

        System.out.println("Enter Any two numbers:");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st Number:-");
        a= s.nextInt();
        System.out.println("Enter 2nd Number:-");
        b=s.nextInt();

        c=a+b;

        System.out.println("Sum of Two numbers is "+c);
    }
}
