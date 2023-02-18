package Programs;

import java.util.Scanner;
class Binary_Converter {
    public static void main(String[] args) {

//        Binary102.caller();
//        Hexadecimal103.caller();
        octal104.caller();
    }
}
class Binary102{

    /*Decimal --> Binary*/
    static void caller()
    {
        int num=inputB();

        int size=size(num);

        int[] tool=tool(size);

        Double bin=converter(tool,num,size);

        System.out.format("Conversion:%.0f",bin);
        System.out.print("(2)");
    }
    static int inputB()
    {
        int num;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number between 0 -100000");/*Range*/
        System.out.print("Enter the number to be converted to binary:-");
        num=scan.nextInt();
        return num;
    }

    static int size(int num)
    {
        int x=1,size=1;

        while(num>x)
        {
            x*=2;
            size++;
        }
        return (size);
    }

    static int[] tool(int size)
    {
        int[] tool = new int[size];
        int x=1;

        for (int i=0;i<size;i++)
        {
            tool[i]=x;
            x*=2;
        }
        return (tool);
    }

    static Double converter(int[] tool,int num,int size)
    {
        int x=size-1;
        double bin=0;

        for (int i=x;i>=0;i--)
        {
            if(tool[x]<=num)
            {
                num=num-tool[x];
                bin=bin*10+1;
            }
            else
            {
                bin= bin * 10;
            }
            x--;
        }

        return (bin);
    }
}
class Hexadecimal103{

    /*Decimal --> Hexadecimal*/
    static int num,temp1;

    static void caller()
    {
        input();
        int[] hex=converter();

        System.out.print("Conversion:");
        for (int element:hex)
        {
            tool(element);
        }
        System.out.print("(16)");
    }
    static void input()
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter number to be converted to hexadecimal:-");
        num= scan.nextInt();

        temp1=num;
    }

    static int[] converter()
    {
        int s=size();
        int[] arr=new int[s];

        for(int i=s-1;i>=0;i--)
        {
            arr[i]=modder();
        }

        return (arr);
    }

    static int size()
    {
        int count = 0;
        int temp=num;
        while (temp != 0)
        {
            temp = temp / 16;
            count++;
        }

        return count;
    }

    static int modder()
    {
        int rem=temp1%16;
        temp1=temp1/16;

        return (rem);
    }

    static void tool(int element)
    {
        switch (element) {
            case 10 -> System.out.print("A");
            case 11 -> System.out.print("B");
            case 12 -> System.out.print("C");
            case 13 -> System.out.print("D");
            case 14 -> System.out.print("E");
            case 15 -> System.out.print("F");
            default -> System.out.print(element);
        }
    }
}
class octal104{
    /*Decimal --> Octal*/

    static int num,temp=num,oct=0;
    static void input()
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter Number to be converted to Octadecimal:-");
        num= scan.nextInt();
    }

    static int modder()
    {
        int rem;

        rem=temp%8;
        temp=temp/8;

        return rem;
    }

    static void converter()
    {
        int x=modder();
        oct=oct*10+x;
    }

    static void caller()
    {
        input();
        converter();

        System.out.println(oct);
    }

}