package Concepts;

public class Throws {
    public static void main(String[] args) {

        divide1 obj=new divide1();

        try
        {
            obj.div();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("EXception handled Successfully");
        }
    }
}
class divide1{
    void div() throws ArithmeticException
    {
        int a=10,b=0;
        System.out.println("Trying to Divide");
        throw new ArithmeticException("Cannot divide by "+b);
    }
}
