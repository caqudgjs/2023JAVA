package hos;

public class Cat implements Pet {
	private double JumpingHeight;
	private String ownerName;
	public Cat(String OwnerName, double height) {
		this.ownerName = ownerName;
		this.JumpingHeight = height;
	}
	
	public String OwnerName() {
		return ownerName;
	}
	
	public void Cry()
	{
		System.out.println("miyao miyao");
	}
	
	public double JumpingHeight() 
	{
		return JumpingHeight;
	}
	

}
