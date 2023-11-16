package ExceptionTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideZero d = new DivideZero();
		try {

			d.method();
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		Class c = Class.forName("java.lang.String");
		
		System.out.println("i'm alive.");
	}
	
	
	
}

//NullPointException 