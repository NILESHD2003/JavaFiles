package Concepts;

public class MethodOverloading {
    /*
    notes
        --------------------------------------------------------------------------------------------------------------------
        I want to add first 2 then 3 and then 4 and then 5 numbers so one method cannot do this so here we can simply use
        method overloading as the required method can be called
        all the methods have the same name .
        the only have the different arguments in it.
     */
    static int sum(int a,int b)//for 2 args
    {
        int result =a+b;

        return result;
    }
    static int sum(int a,int b,int c)//for 3 args
    {
        int result =a+b+c;

        return result;
    }
    static int sum(int a,int b,int c,int d)//for 4 args
    {
        int result =a+b+c+d;

        return result;
    }
    static int sum(int a,int b,int c,int d,int e)//for 4 args
    {
        int result =a+b+c+d+e;

        return result;
    }

    public static void main(String[] args) {

        System.out.print("Addition of 1 and 2 is ");
        int x=sum(1,2);
        System.out.println(x);
        System.out.print("Addition of 1, 2 and 3 is ");
        int y=sum(1,2,3);
        System.out.println(y);
        System.out.print("Addition of 1, 2, 3 and 4 is ");
        int z=sum(1,2,3,4);
        System.out.println(z);
        System.out.print("Addition of 1, 2, 3, 4 and 5 is ");
        int w=sum(1,2,3,4,5);
        System.out.println(w);
    }
}
