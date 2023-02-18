package Programs;

import java.util.Scanner;

class Prime_Num {
    static int isprime(int n)
    {
        for (int i = 2; i < n; i++)
        {
            if(n%i == 0){
                return -1;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        int lower_bound , upper_bound ;

        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter the range of numbers");
        System.out.print("Lower limit:");
        lower_bound=Sc.nextInt();
        System.out.print("Upper Limit:");
        upper_bound=Sc.nextInt();

        for (int i = lower_bound; i <= upper_bound; i++)
        {
            if(isprime(i) == 1)
            {
                System.out.print(i+" ");
            }
        }
    }
}

