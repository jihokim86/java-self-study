package p253;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		Computer mycom = new Computer();
		Scanner input = new Scanner(System.in);
		
		int[] values1 = {1,2,3};
		int[] a = new int[3];
		
		for(int i = 0 ; i<a.length ;i++) {
			System.out.print("값을 입력:");
			a[i] = input.nextInt();
		}
		
		int result = mycom.sum1(values1);
		int result1 = mycom.sum1(a);
		int result2 = mycom.sum1(new int[] {3,4,6});
//		int result3 = mycom.sum1(1,2,3);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

}
