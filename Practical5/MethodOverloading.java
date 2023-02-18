package Practical5;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes objShapes=new Shapes();
		System.out.println("Area of Rectange is "+objShapes.area(10,5));
		System.out.println("Area of Square is "+objShapes.area(5));
		System.out.println("Area of Circle is "+objShapes.area(10.0));
	}
}
class Shapes{
	
	double area(int s)
	{	
		double ar;
		
		ar=s*s;
		
		return ar;
	}
	double area(int l,int b)
	{
		double ar;
		
		ar=l*b;
		
		return ar;
	}
	double area(double r)
	{
		double ar;
		
		ar=r*r*3.1415;
		
		return ar;
	}
}
