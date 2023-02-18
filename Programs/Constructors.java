package Programs;
//Constructors can be  overloaded same as method overloading
public class Constructors {
    public static void main(String[] args)
    {
        int a=20,b=30;

        WithParameter obj1 =new WithParameter(a,b);

        WithoutParameter obj2 =new WithoutParameter();
    }
}
class WithParameter{
    WithParameter(int a,int b)
    {
        System.out.println("This is using constructor with parameter c="+ (a+b));
    }
}
class WithoutParameter{
    WithoutParameter()
    {
        int a=20,b=30;
        System.out.println("This is using Constructor with no parameter c="+ (a+b));
    }
}