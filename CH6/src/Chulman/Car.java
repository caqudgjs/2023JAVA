package Chulman;

public class Car {
	static int numOfCars = 0;
	static double maxSpeed = 100;
	
	public int speed;
//	double positionX = 0.0;
	public Car() {
		numOfCars++;
	}
	
	public void SetSpeed(int speed) {
		if(speed > 100) speed = 100;
		this.speed = speed;
		
	}
	
	public void PushRightArrow() {
//		positionX += speed;
	}
 
}
