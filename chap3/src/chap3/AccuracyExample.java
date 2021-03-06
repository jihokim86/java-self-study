package chap3;

public class AccuracyExample {

	public static void main(String[] args) {
		
		// 정확하게 계산할 때에는 부동소수점 타입을 사용하지 않는다.
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면");
		System.out.println(result +"조각이 남는다."); //0.299999999999
		
		// float, double 타입은 0.1을 정확하게 표현할수 없어 근사치로 처리
		
		int temp = apple*10 - number;
		double result1 = (double)temp/10;
		
		System.out.println(result1); //0.3
	}

}
