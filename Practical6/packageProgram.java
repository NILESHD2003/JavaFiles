package Practical6;
import Arithmetic.Operations;

public class packageProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations obj = new Operations();
		System.out.println("Addition of 20.0 and 10.0 is "+obj.add(20.0,10.0));
		System.out.println("Subtarction of 10.0 and 20.0 is "+obj.sub(20.0,10.0));
		System.out.println("Multiplication of 20.0 and 10.0 is "+obj.mul(20.0,10.0));
		System.out.println("Divion of 20.0 by 10.0 is "+obj.div(20.0,10.0));
	}

}
