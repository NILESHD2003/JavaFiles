package Practical5;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager obj1=new Manager();
		Author obj2=new Author();
		
		obj1.personid=01;
		obj1.name="ABC";
		obj1.empNo=102;
		obj2.biography="Good Person";
		obj1.department="CSE";
		
		System.out.println("Person ID:"+obj1.personid);
		System.out.println("Name:"+obj1.name);
		System.out.println("Employee No:"+obj1.empNo);
		System.out.println("Biography:"+obj2.biography);
		System.out.println("Department:"+obj1.department);
	}
}

class Person{
	int personid;
	String name;
}

class Employee extends Person{
	int empNo;
}

class Author extends Person{
	String biography;
}

class Manager extends Employee{
	String department;
}


