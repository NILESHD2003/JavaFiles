/*
notes:
    keyword abstract.
    -Abstract means something that is just planned and does not mean to be executed.
    -Abstract Methods:-A method that is declared without declaration.
    -If any class contains any Abstract method then the whole class is abstract class.
    -Abstract method provide the standard class so that it can be modified in other classes that inherits the abstract
    class i.e. It means that it sets some standard on which other classes will be created in simple words we can say
    that it gives shape for child classes.
    -We cannot create objects for abstract classes.
    -It is compulsory to use all the methods present in the ABSTRACT class in the child class i.e.
    The class that is inheriting abstract class.
    -Abstract class can contains both abstract as well as normal methods.
*/
package Concepts;

public class AbstractClassMethods {
    public static void main(String[] args) {
        EngGreet e=new EngGreet();
        e.greet();
        e.Welcome();

        SpanishGreet s=new SpanishGreet();
        s.greet();

//        Greet g=new Greet()/*Object cannot be created---ERROR*/

    }
}

abstract class Greet{
    abstract void greet();
}//Shape->class with one method

class EngGreet extends Greet{
    @Override
    void greet()
    {
        System.out.println("HELLO Nilesh");
    }
    void Welcome()
    {
        System.out.println("Welcome");
    }
}

class SpanishGreet extends Greet{
    @Override
    void greet()
    {
        System.out.println("HOLA Nilesh");
    }
}
