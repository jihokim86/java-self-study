package chap3;

public class SignOperatorExample {

	public static void main(String[] args) {
		
		// 부호 연산자
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1="+result1); // -100
		System.out.println("result2="+result2); // 100
		
		short s = 100;
		//short result3 = -s; > 피연산자(s)는 연산하기 전에 int타입으로 변환된다.
		int result3= -s; // 범위에 맞게 int 타입으로 선언해야한다.
		short result4 = (short) -s; // 강제 변환을 하던
		
		System.out.println("result3="+result3); //-100
		System.out.println("result3="+result4); //-100
	}

}
