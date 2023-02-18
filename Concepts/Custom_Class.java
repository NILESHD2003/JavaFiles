package Concepts;

import java.util.Scanner;

public class Custom_Class {
    //here we create objects that act as employee in this example which we provide data using get-set method.
    public static void main(String[] args)
    {
        Employee nilesh=new Employee();
        Employee nilesh2=new Employee();

        //setting salary for emp1
        nilesh.setID();
        nilesh.setsalary();
        //setting salary for emp2
        nilesh2.setID();
        nilesh2.setsalary();

        //now we can fetch the salary using get method
        nilesh.getID();nilesh.getSalary();

        nilesh2.getID();nilesh2.getSalary();

    }
}

class Employee {
    int salary,id;
    String name;

    public void setsalary()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Salary:");
        salary=s.nextInt();
    }

    public void setID()
    {
        System.out.print("Enter ID:");
        Scanner s=new Scanner(System.in);
        id=s.nextInt();
    }

    public void getSalary()
    {
        System.out.println("Salary is "+salary);
    }

    public void getID()
    {
        System.out.println("ID is "+id);
    }
}
