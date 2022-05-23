package p238;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 .. 오버로딩
	//매개변수를 달리하는 생성자를 여러개 선언 하는것을 말함
	Car(){
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.company ="대우자동차";
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//메소드
}
