package chap3;

public class OverflowExample {

	public static void main(String[] args) {
		
		//오버플로우
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		
		System.out.println(z); // -727379968
		
		// 값의 범위가 맞지 않으면 잘못된 값이 출력된다.
		
		int i = 1000000;
		int j = 1000000;
		long k = (long)i * j; // 강제변환
		
		System.out.println(k); //1000000000000
	}

}
