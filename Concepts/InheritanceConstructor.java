/*
notes
    When constructor of parent class is created and child class extends parent class and when object of child class is
    created then the constructor of parent class is called and later of child class if present.
*/
package Concepts;

public class InheritanceConstructor {
    public static void main(String[] args) {
        Child c=new Child(10,20);
    }
}
/*
notes
    Here When we use constructor overloading then we must use super keyword it means that carry this parameter to super
    class and thereby parameterised constructor is called.
*/
class Parent{
    Parent()
    {
        System.out.println("I am constructor of Parent class");
    }
    Parent(int a)
    {
        System.out.println("I am overloaded constructor of Parent class");
    }
}
class Child extends Parent {
    Child()
    {
        super(10);
        System.out.println("I am constructor of Child class");
    }
    Child(int a,int b)
    {
        super(a);
        System.out.println("I am a overloaded constructor of Child Class");
    }
}
