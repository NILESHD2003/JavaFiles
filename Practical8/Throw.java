package Practical8;

public class Throw {
    public static void main(String[] args) {
        TestThrow t=new TestThrow();
        t.divide();
    }
}
class TestThrow{
    static int a=12;
    static int b=0;
    void divide()
    {
        if (b==5)
        {
            throw new ArithmeticException("Cannot divide by "+b);
        }
        int res=a/b;
        System.out.println(res);
    }
}
