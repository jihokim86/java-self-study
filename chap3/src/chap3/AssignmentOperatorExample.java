package chap3;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		
		// 대입 연산자
		
		int result = 0;
		result += 10;
		System.out.println("resutle="+result); //10
		result -= 5;
		System.out.println("resutle="+result); //5
		result *= 3;
		System.out.println("resutle="+result); //15
		result /= 5;
		System.out.println("resutle="+result); //3
		result %= 3;
		System.out.println("resutle="+result); //0
	}

}
