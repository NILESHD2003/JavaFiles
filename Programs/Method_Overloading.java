package Programs;

public class Method_Overloading {
    static int sum(int a,int b)
    {
        int result =a+b;
        return result;
    }
    static int sum(int a,int b,int c)
    {
        int result =a+b+c;
        return result;
    }

    public static void main(String[] args)
    {
        System.out.print("Addition of 1 and 2 is ");
        int x=sum(1,2);
        System.out.println(x);
        System.out.print("Addition of 1, 2 and 3 is ");
        int y=sum(1,2,3);
        System.out.println(y);
    }
}

