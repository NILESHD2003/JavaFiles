/*
notes:
    -Interface is a collection of related methods without body(statements).
    -Interfaces contains all the abstract methods.
    -For use of interface we use implements keyword.
    -If we implement an interface then we need to implement all the method with @override keyword.
    -One class can implement multiple interface.
    -Properties in interface are final and cannot be modified.
    -By using Interfaces we can achieve multiple Inheritance.
    -Interface can be extende by Interface by uusing "extend" keyword.
*/
package Concepts;

public class Interfaces {
    public static void main(String[] args) {
        mathematics m=new mathematics(10,5);
        System.out.println(m.add());
        System.out.println(m.sub());
        System.out.println(m.mul());
        System.out.println(m.div());
    }
}
interface AddSub{
    int add();
    int sub();
}
interface MulDiv extends AddSub{
    int mul();
    int div();
}
class mathematics implements AddSub,MulDiv {

    int x,y;

    mathematics(int a, int b)
    {
        x=a;
        y=b;
    }
    @Override
    public int add() {
        return x+y;
    }

    @Override
    public int sub() {
        return x-y;
    }

    @Override
    public int mul() {
        return x*y;
    }

    @Override
    public int div() {
        return x/y;
    }
}