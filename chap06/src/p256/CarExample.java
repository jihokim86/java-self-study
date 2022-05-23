package p256;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.gas=5;
		System.out.println(mycar.gas);
		
		mycar.setGas(5);
		System.out.println(mycar.gas);
		
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			mycar.run();
		}
		
		System.out.println(mycar.gas);
		if(mycar.isLeftGas()) {
			System.out.println("가스를 주입할 필요 없다");
		}else {
			System.out.println("가스를 주입해라.");
		}
	}

}
