package Programs;

import java.util.Scanner;

class salary{
    static int condition(float x)
    {
        float hra,da,gross;
        if (x<=10000)
        {
            da=80*x/100F;
            hra=60*x/100F;
        }
        else
        {
            da=90*x/100F;
            hra=50*x/100F;
        }

        gross=x+da+hra;

        System.out.println("Gross salary is "+gross);

        return 0;
    }
}

public class GrossSalary {
    public static void main(String[] args)
    {
        float base;
        Scanner Scan =new Scanner(System.in);
        System.out.print("Enter base salary:");
        base=Scan.nextFloat();

        salary.condition(base);
    }
}
