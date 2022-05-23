package p256;

public class Car {
	//필드
	int gas;
	//생성자
	Car(){
		
	}
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:"+gas+")");
				gas = gas- 1;
			}else {
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				return;
			}
		}
	}
	
	boolean isLeftGas() {
		if(gas ==0) {
			System.out.println("가스없음");
			return false;
		}else {
			System.out.println("가스있음");
			return true;
		}
	}
}
