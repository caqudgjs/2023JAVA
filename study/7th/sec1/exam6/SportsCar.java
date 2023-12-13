package sec1.exam6;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }
    
    @Override
    //final 메소드는 오버라이딩 불가능
    public void stop() {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
    
}
