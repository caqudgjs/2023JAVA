package hos;

public class main {

	public static void main(String[] args) {
		main m = new main();
		Pet p1 = new Dog("PSH", 25);
		Pet p2 = new Cat("aaa", 3);
//		Pet p3 = new Pet("sss");
		m.ShowOwner(p1);
		m.ShowOwner(p2);
		
		m.TestCry(p1);
		m.TestCry(p2);
		
		
		m.TestRunSpeed(p1);
		
	
	}
	
	void TestRunSpeed(Pet p) {
		if(p instanceof Dog)
			Dog p= (Dog)p;
			System.out.println("RunSpeed is" + d.RunSpeed());
	}
	
	void ShowOwner(Pet p) {
		System.out.println("Owner's name is" + p.OwnerName());
	}
	void TestCry(Pet p) {
		p.Cry();
		
	}
	
	

}
