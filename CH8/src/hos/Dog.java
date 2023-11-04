package hos;

public class Dog implements Pet{
	private double runSpeed;
	private String ownerName;
	
	
	public Dog(String ownerName, double speed) {
		this.ownerName = ownerName;
		this.runSpeed = speed;
	}
	
	public String OwnerName() {
		return ownerName;
	}
	
	public void Cry()
	{
		System.out.println("moung moung");
	}
	
	public double RunSpeed()
	{	
		return runSpeed;
	}
	
}
