package chap3;

public class CharOperationExample {

	public static void main(String[] args) {
		
		// char Ÿ�� ����
		char c1 = 'A'+1; //�ڹٿ��� ���ͳ� ���� ������ ���� ����!
		char c2 = 'A';
//		char c3 = c2+1; //�ǿ����ڴ� intŸ������ ��ȯ�ǰ� 1�� ������
		int c3 = c2+1;  // intŸ������ �޾���� �Ѵ�.
		char c4 = (char)(c2+1); //������ȯ�� �ϴ���!
		
		System.out.println("c1="+c1); // B
		System.out.println("c2="+c2); // A
		System.out.println("c3="+c3); // 66
		System.out.println("c4="+c4); // B
		
	}

}