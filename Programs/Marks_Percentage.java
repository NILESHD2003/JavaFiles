package Programs;

import java.util.Scanner;

public class Marks_Percentage {
    public static void main(String[] args)
    {
        int mk1,mk2,mk3,mk4,mk5,mktot;
        float mkper;

        Scanner S=new Scanner(System.in);
        System.out.print("Enter marks in Subject 1:-");
        mk1=S.nextInt();
        System.out.print("Enter marks in Subject 2:-");
        mk2=S.nextInt();
        System.out.print("Enter marks in Subject 3:-");
        mk3=S.nextInt();
        System.out.print("Enter marks in Subject 4:-");
        mk4=S.nextInt();
        System.out.print("Enter marks in Subject 5:-");
        mk5=S.nextInt();

        mktot=mk1+mk2+mk3+mk4+mk5;

        mkper=mktot/500F*100;

        System.out.print("Percentage obtained is "+mkper+"%");

    }
}
