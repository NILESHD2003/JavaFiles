package Programs;

import java.util.Scanner;
class AO{
    int add(int x,int y)
    {
        int a=x+y;

        return a;
    }

    int sub(int x,int y)
    {
        int s=x-y;

        return s;
    }

    int mult(int x,int y)
    {
        int m=x*y;

        return m;
    }

    int div(int x,int y)
    {
        int d=x/y;

        return d;
    }

}
public class Airthematic_operations_method {

    public static void main(String[] args)
    {
        int add,sub,mul,div;

        Scanner Scan=new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1=Scan.nextInt();
        System.out.print("Enter Num2: ");
        int num2=Scan.nextInt();

        AO a=new AO();

        add=a.add(num1,num2);
        sub=a.sub(num1,num2);
        mul=a.mult(num1,num2);
        div=a.div(num1,num2);

        System.out.println("Addition is "+add);
        System.out.println("Subtraction is "+sub);
        System.out.println("Multiplication is "+mul);
        System.out.println("Division is "+div);

    }

}
