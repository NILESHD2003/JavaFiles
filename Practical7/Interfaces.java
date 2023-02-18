package Practical7;

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base objBase=new base();
		
		objBase.car();
		objBase.vehicle();
	}
}

interface Vehicle{
	void vehicle();
}
interface Car{
	void car();
}
class base implements Vehicle,Car{

	@Override
	public void car() {
		System.out.println("This is implemented from Interface Car");
	}

	@Override
	public void vehicle() {
		System.out.println("This is implemented from Interface Vehicle");
	}
	
}