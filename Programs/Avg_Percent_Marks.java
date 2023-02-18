package Programs;

import java.util.Scanner;

class Sol{
    static void avg(int a,int b,int c,int d,int e)
    {
        int avg=(a+b+c+d+e)/5;

        System.out.println("Average is "+avg);
    }
    static void percent(int a,int b,int c,int d,int e)
    {
        float percent=(a+b+c+d+e)*100/500F;

        System.out.println("Percentage is "+percent+"%");
    }
}
public class Avg_Percent_Marks {
    public static void main(String[] Args)
    {
        Scanner S=new Scanner(System.in);

        System.out.print("Enter marks in Subject 1:");
        int a=S.nextInt();
        System.out.print("Enter marks in Subject 2:");
        int b=S.nextInt();
        System.out.print("Enter marks in Subject 3:");
        int c=S.nextInt();
        System.out.print("Enter marks in Subject 4:");
        int d=S.nextInt();
        System.out.print("Enter marks in Subject 5:");
        int e=S.nextInt();

        Sol.avg(a,b,c,d,e);
        Sol.percent(a,b,c,d,e);
    }
}
