package chap05;

public class ArrayCreatByExample {

	public static void main(String[] args) {
		// new �����ڷ� �迭 ����
		int[] arr1 = new int[3];
		for(int i=0;i<3;i++) {
			//System.out.println("arr["+i+"] : "+arr1); �޸� �ּ� ���?
			System.out.println("arr["+i+"] : "+arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0;i<3;i++) {
			System.out.println("arr["+i+"] : "+arr1[i]);
	    }
		
		double[] arr2 = new double[3];
		for(int i=0;i<3;i++) {
			System.out.println("arr["+i+"] : "+arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0;i<3;i++) {
			System.out.println("arr["+i+"] : "+arr2[i]);
	    }
		
		String[] arr3=new String[3];
		for(int i=0;i<3;i++) {
			System.out.println("arr["+i+"] : "+arr3[i]);
		}
		
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		for(int i=0;i<3;i++) {
			System.out.println("arr["+i+"] : "+arr3[i]);
	    }
  }
}