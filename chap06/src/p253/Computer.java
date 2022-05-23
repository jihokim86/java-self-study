package p253;

public class Computer {

		//매개 변수의 개수를 모를 경우
		 int sum1(int[] values) {
			int sum=0;
			for(int i=0; i<values.length ;i++) {
				sum += values[i];
			}
			return sum;
		}
	}


