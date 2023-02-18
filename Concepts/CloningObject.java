public class CloningObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objclone obj =new objclone();
		
		obj.name="Nilesh";
		obj.id=14;
		
		try 
		{
			objclone obj2=(objclone) obj.clone();
			System.out.println(obj2.id+" "+obj2.name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class objclone extends CloningObject implements Cloneable{
	String name;
	int id;
}