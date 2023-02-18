package Concepts;
/*
        ----------------------------------------------------------------------------------------------------------------
        Documentation:-
        ----------------------------------------------------------------------------------------------------------------
        What is recursion?
        >>>Recursion is the process of repeating items in a self-similar way.
        >>>In programming languages, if a program allows you to call a function inside the same function, then it is
           called a recursive call of the function.

        It can be best used  in factorial program where the function factorial is called in itself.
        ----------------------------------------------------------------------------------------------------------------
        */
public class Recurssion {
    static int factorial(int num)
    {
        int fac=1;
        fac=fac*num;
        num=num-1;

        if (num==1)
        {
            return fac;
        }
        else
        {
            factorial(num);
        }

        return fac;
    }
    public static void main(String[] args) {
        Recurssion.factorial(4);
    }
}
