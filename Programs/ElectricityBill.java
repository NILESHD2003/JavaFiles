package Programs;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter no.of Units:");
        int unit=s.nextInt();

        Bill(unit);
    }
    static int UnitsChecker(int unit)
    {
        if(unit<=100)
            return 1;
        else if(unit<=200)
            return 2;
        else if(unit<=500)
            return 3;
        else
            return 0;
    }
    static void Bill(int unit)
    {
        int rate = switch (UnitsChecker(unit)) {
            case 1 -> 6;
            case 2 -> 7;
            case 3 -> 8;
            case 0 -> 9;
            default -> 0;
        };

        float amt=rate*unit;

        System.out.format("Electricity Bill is %.2f",amt);
    }
}
