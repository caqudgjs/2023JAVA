package ch7;

public class Car {
	
	double speed = 1;
	double position = 0;
	HankookTire hTire;
	KumhoTire kTire;
	
	
	
	public Car(HankookTire hTire) {
		this.hTire = hTire;
	}
	
	public Car(KumhoTire kTire) {
		this.kTire = kTire;
	}
	
	public void run() {
		if(hTire ! = null)
			kTire.roll();
		if(KTire ! = null)
			kTire.roll();
		
		kTire.roll();
		hTire.roll();
	}
	
	Car(double speed, double position) {
		this.speed = speed;
		this.position = position;
		
	}
	
	public void SetTire(HankookTire hTire)
	{
		this.hTire = Htire;
	}
	
	public void SetTire(KumhoTire kTire)
	{
		this.hTire = ktire;
	}
	
	public void SetSpeed(double speed) {
		this.speed = speed;
	}
		
	public void Move() {
		position += speed;
	}

}
 