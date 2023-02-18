/*
------------------------------------------------------------------------------------------------------------------------
notes
    There are 4 types of Access Modifiers:-
    1.Default->It is also referred as Package-private modifier that means it is private class for other packages but
    public class for its package(means package in which it is present)
    2.Private->It needs getters and setters to use data it cannot be directly used.It is used for keeping
    data private.That means data cannot be changed without using getters and setters.
    3.Protected->Can be used in same package.
    4.Public->Can be used anywhere with the reference.
    ---------------------------------------
    Table:
    ---------------------------------------------------------
    Modifier        Class     Package     Subclass     World
    ---------------------------------------------------------
    Public          Yes       Yes         Yes          Yes
    Protected       Yes       Yes         Yes          No
    Default         Yes       Yes         No           No
    Private         Yes       No          No           No
    ---------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------
*/

package Concepts;

import java.util.Scanner;

public class Access_Modifiers {
    public static void main(String[] args) {
        //Private
        Scanner s=new Scanner(System.in);
        System.out.print("Enter name:");
        String name=s.nextLine();
        modifiers p=new modifiers();
        p.setName(name);
        System.out.println(p.getName());

        System.out.println(p.x+""+p.y+"");
    }
}

class modifiers {
    int x=10;
    protected int y=20;
    private int z=30;
    private String name;

    public void setName(String n)
    {
        name=n;
    }

    public String getName()
    {
        return name;
    }
}
