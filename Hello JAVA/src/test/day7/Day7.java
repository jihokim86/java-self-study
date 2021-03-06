package test.day7;

public class Day7 {
	public static void main(String[] args) {
		int score=92;
		if(score>=90) {
			System.out.println("90점 이상");
			System.out.println("A등급");
		}
		if(score<90) {
			System.out.println("90점 이하");
			System.out.println("B등급");  //false이므로 블록안의 실행문은 실행안함
		
		}
		
		if(score<90)  //중괄호가 없어서 if문은 바로 아래줄만 해당됨.
			System.out.println("90점 이하");
			System.out.println("B등급");  // 이건 if문하고 상관없는 라인이여서 출려됨
			
			
		
		int score1=85;
		if(score1>90) {
			System.out.println("90점 이상");
		}else {
			System.out.println("90점 이하");
		}
		
		double num=Math.random();   // 0.0<= num <1.0 값을랜덤하게 출력
		System.out.println(num);    //실행할때마다 랜덤하게 출력됨
		int num1=(int)num;			//강제 int형으로 변환
		System.out.println(num1);	// 0출력됨!! 이유는 0~0.99999사이의 값이므로	
		
	
		int score2=(int)(Math.random()*100)+1; //1부터n개의 수
		System.out.println(score2);
		if(score2>90) {
			System.out.println("A");
		}else if(score2>80) {
			System.out.println("B");
		}else if(score2>70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		int num2=(int)(Math.random()*4)+5; //5부터 4개의 수 : 5<=num2<9(4+5)
		char grade='A';
		String name="슈슝";
		switch(num2){
			case 5:
			System.out.println("1번");
			break;
			case 6:
			System.out.println("2번");
			break;
			case 7:
			System.out.println("2번");
			break;
			case 8:
			System.out.println("2번");
			break;		
			}
		
		switch(grade) {
		case 'A':
		System.out.println(grade);
		break;
		}
		
		switch(name) {
		case "슈":
			System.out.println(name);
			break;
			default:
				System.out.println("없음");
		}
		
		
		//int i=0;
		for(int i=0;i<=10;i++) { //for(;i<=10;i++) 변수초기화가 먼저 선언된 경우
			System.out.println(i);
		}
		
		int k=0;
		int sum=0;
		for(k=1;k<=100;k++) {
			sum=sum+k; //sum += k; 동일한 코드
			System.out.println(k); //1~100까지 출력됨
		}
		System.out.printf("1부터 %d까지의 합은%d,",k-1,sum); //$1넘버를 안붙혀주면 순서대로 들감
		//k값이 101이 출려됨 왜?? 루프를 탈출하기위해서는 k=101이 되야지만 탈출하니. 값이 101저장된듯
		
		//구구단출력하기
		int n=2;
		int m=1;
		//int pdt=n*m;
		
		for(n=2;n<=9;n++) {
			for(m=1;m<=9;m++) {
				int pdt=n*m;
				System.out.println(n+"X"+m+"="+(n*m)); //괄호안해주면 "="과 먼저 결합함
				System.out.println(n+"X"+m+"="+pdt); //pdt는 for문 안에 있어야함
			}
				
			}
		
		//1부터10까지 출력 while
		int u=0;
		while(u<=10) {
			u++;
			System.out.println(u);//11까지 출력됨.u=11이 되어야 루프를 탈출하니.
			if(u==10) {  //10일때 탈출 시킴. u는 10까지만 저장됨
				break;
			}
		}
		
		//아니며 아래와 같이 작성
		int u1=1;
		while(u1<=10) {
			System.out.println(u1);
			u1++; //u11은 저장되지만 출력은 10까지만 함. 이것이 맞는 것일까?
		}
		
		int p=0;
		int sum9=0;
		while(p<=100) {
			p++;
			sum9+=p;			
			if(p==100) {
				break;
			}
		}
		System.out.printf("1부터 %d까지의 합음 %d이다.\n",p,sum9);
				
		//바깥쪽 반복문 종료 시키기
		
		for(char upper='A';upper<='Z';upper++) {
		for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break;
				}
			}
		
		}
		
		// continue문
		int e=0;
		for(e=1;e<=10;e++) {
			if(e%2 !=0) {
				continue;
			}
			System.out.println(e);
			
			if(e==10) {
				break;
			}
			
		}
		System.out.println("마지막 e값은"+e);
		
	}

}
