package chap05;

public class EnumMethodExample {

	public static void main(String[] args) {
		// 열거 객체의 매소드
		// name()매소드
		Week today = Week.SUNDAY; // today변수에 번지수가 저장
		String name = today.name();//열거객체가 가지고 있는 문자열을 리턴하여 name에 저장
		System.out.println(name); // 
		
		//ordinal()매소드 :전체열거객체중몇번째 열거객체인지 알려줌,0번부터시작
		int ordinal = today.ordinal();
		System.out.println(ordinal); //6번째.
		
		//compareTo()메소드 : 매개값으로 주어진 열거 객체를 기준으로 전후로 몇번째 위치하는지 비교
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNSEDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf()메소드:매개값으로 주어지는 문자열과 동일한 문자열을 가지느 열거 객체를 리턴
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURADAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			}else {
				System.out.println("평일이군요");
			}
		}
		
		//values()메소드 : 열거타입의 모든 열거 객체들을 배열로 만들어 리턴
		Week[] days = Week.values();
		for(Week day : days) { //배열에서꺼낼 타입의 변수선언...String으로 하면 안되나?
			System.out.println(day);
		}
	}

}
