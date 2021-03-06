package chap05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// 열거타입과 열거 상수
		Week today = null ; //열거타입 변수 today선언
		//Week today = Week.SUNDAY 열거상수 한개만 저장 가능
		// -> today에 저장되는 값은 열거상수인 SUNDAY의 번지저장
		Calendar cal = Calendar.getInstance();
		
		//Calendar.getInstance()매소스가 리턴하는 Calendar객체를 얻는다.
		//int year = now.get(Calendar.YEAR);//년
		int week = cal.get(Calendar.DAY_OF_WEEK);//일~토요일(1~7)까지 숫자를 리턴
		//int month = now.get(Calendar.MONTH)+1;//달
		//int day = now.get(Calendar.Day_OF_MONTH);//일
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESAY;
			break;
		case 4:
			today = Week.WEDNSEDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURADAY;
			break;

		default:
			break;
		}
		System.out.println("오늘 요일:"+today);
		
		if(today ==Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다");
		}else {
			System.out.println("열심히 티비를 봅니다.");
		}
	  }
	}


