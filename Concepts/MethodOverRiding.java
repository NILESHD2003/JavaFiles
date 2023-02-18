/*
notes
    Writing the method with samein in inherited class is method overloading.
    it must have same parameters and return type.
*/
package Concepts;

public class MethodOverRiding {
    public static void main(String[] args)
    {
        parent p=new parent();
        child c=new child();
        p.hello();//This will call main method
        c.hello();//This wall call overridden method
    }
}
class parent {
    void hello()
    {
        System.out.println("Hello World");
    }
}

class child extends parent{
    @Override//This is used so that if in future we change the parameters of the overriding method then we will get the error
    //so to understand the error we use @overridden .
    void hello()
    {
        System.out.println("Hello Nilesh");
    }
}
