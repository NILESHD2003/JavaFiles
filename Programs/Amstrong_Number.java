package Programs;

import java.util.Scanner;

public class Amstrong_Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter Number to Check:");
        int num=s.nextInt();
        int temp=num;
        int new_num=0;
        while(num>0) {
            int l = num % 10;
            new_num += (l * l * l);
            num = num / 10;
        }
        if(temp==new_num)
        {
            System.out.println("Entered number is amstrong number.");
        }
        else
        {
            System.out.println("Entered number is not a amstrong number");
        }
    }
}
