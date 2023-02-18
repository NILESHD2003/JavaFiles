package Concepts;

public class Variables {
    int a=9;
    double b=30.30;
    public static void main(String[] args)
    {
        int c=100;
        //here we cannot directly call a and b function we first need to create object
        Variables v=new Variables();
        //so now object v is created now we can call the values.
        System.out.println(v.a);
        System.out.println(v.b);
        System.out.println(c);
        //this also can be printed in one line as follows:-
        System.out.println(v.a+" "+v.b+" "+c);
    }
}

