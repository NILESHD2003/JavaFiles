public class ToStringMethod {

	String name;
	int id;
	
	public ToStringMethod(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+" "+name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringMethod objMethod=new ToStringMethod(14, "Nilesh");
		
		System.out.println(objMethod.toString());
	}
}
