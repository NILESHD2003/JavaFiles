/*
notes
    INHERITANCE-->
    Inheritance means borrowing properties from an existing class.
    ---SUBCLASS EXTENDS SUPERCLASS---
    ---CHILD CLASS EXTENDS PARENT CLASS---
    ---DERIVED EXTENDS BASE---
    we can access SUPERCLASS using the object of SUBCLASS.
    It is used so that we can follow DRY(Do Not Repeat Yourself) principle
*/
package Concepts;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        Base base=new Base();
        Derived dev=new Derived();
        //get-set for base
//        System.out.print("Enter name:");
//        String name=s.nextLine();
//        base.setName(name);
//        System.out.println(base.getName());

        //get-set for Derived
        System.out.print("Enter name:");
        String name=s.nextLine();
        dev.setName(name);
        System.out.println(dev.getName());
        System.out.print("Enter Phone Number:");
        int num=s.nextInt();
        dev.setPh(num);
        System.out.println(dev.getPh());
    }
}

//here base only contains name.
class Base{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
}

//here derived only contains ph but by inheriting it now contains name also.
// word EXTENDS is used to declare inheritance.
class Derived extends Base{

    private int ph;
    public int getPh() {
        return ph;
    }

    public void setPh(int num) {
        this.ph = num;
    }
}
