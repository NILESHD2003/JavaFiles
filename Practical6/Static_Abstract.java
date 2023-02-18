package Practical6;

public class Static_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static objStatic=new Static();
		
		objStatic.hello();
		Static.method();
	}
}
abstract class Hello{
	abstract void hello();
}

class Static extends Hello{
	@Override
	void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
	static void method()
	{
		System.out.println("This is a Static Method");
	}
}
