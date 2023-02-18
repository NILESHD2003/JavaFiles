/*notes
    -Dynamic method dispatch helps in runtime polymorphism.
     creating object of superclass is allowed but only contents of superclass can be accessed.
     Phone nokia =new Phone();
     Creating object of subclass is allowed and the elements of both sub and superclass can be accessed.
     SmartPhone samsung = new SmartPhone();
     But Java Also allows to create object of subclass with reference to super class.
     Phone obj=new SmartPhone();//NO ERROR
     But creating object of superclass cannot be created with reference to superclass.It shows an error.
     SmartPhone obj1 = new Phone();//This is error
     obj.start();
     obj.msg();
     These two are possible because both methods are present in Phone class and start will run for smartphone
     because the method has method Overriding
     obj.game();//This is not possible as game method is not present in Phone Class
*/

package Concepts;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        System.out.println("This is dynamic method dispatch.");
        Phone obj=new SmartPhone();
        obj.msg();
        System.out.println("This is Polymorphism");
        SmartPhone obj2 =new GamingPhone();
        /*
        RUNTIME POLYMORPHISM
        It means that the obj2 can only access the methods of smartphone class that present in the GamingPhone class
        and similarly RecordGame cannot be accessed as the method is present in GamingPhone class but not in
        Smartphone class and the object belongs to smartphone class.
        */
        obj2.game();
    }
}

class Phone{
    void start()
    {
        System.out.println("Welcome to Phone");
    }

    void msg()
    {
        System.out.println("This is messaging in Phone");
    }
}

class SmartPhone extends Phone{
    @Override
    void start()
    {
        System.out.println("Welcome to SmartPhone.");
    }

    void game()
    {
        System.out.println("This is Gaming in SmartPhone");
    }
}

class GamingPhone extends SmartPhone{
    @Override
    void game() {
        System.out.println("High Performance gaming in Gaming Phone.");
    }

    void RecordGame()
    {
        System.out.println("Recording game...");
    }
}
