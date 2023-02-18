package Concepts;

public class varArgs {
    /*
    --------------------------------------------------------------------------------------------------------------------
    This is done by using Method overloading
    --------------------------------------------------------------------------------------------------------------------
     */
//    static int sum(int a,int b)//for 2 args
//    {
//        int result =a+b;
//
//        return result;
//    }
//    static int sum(int a,int b,int c)//for 3 args
//    {
//        int result =a+b+c;
//
//        return result;
//    }
//    static int sum(int a,int b,int c,int d)//for 4 args
//    {
//        int result =a+b+c+d;
//
//        return result;
//    }
//    static int sum(int a,int b,int c,int d,int e)//for 4 args
//    {
//        int result =a+b+c+d+e;
//
//        return result;
//    }

    /*
    notes
        --------------------------------------------------------------------------------------------------------------------
        Writing such numbers of methods can be avoided and we don't know how many arguments are to be passed in the program
        so we can use varArgs.
        It will collect all the arguments passed to the program and store it into a array.
        Functions with varArgs can be called with 0 and more elements.
        so the addition can simpily done as folows:-
        --------------------------------------------------------------------------------------------------------------------
    */
    static int sum(int ...array)//This gives the programmer the convinence.
    {
        /*here all the arguments are passed to array which is int array and the triple dots(...) represnt the varArgs
        use*/
        int answer=0;
        for(int elements:array)
        {
            answer+=elements;
        }
        return answer;
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

