package p238;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성 시 생성자 선택
		
		Car car1 = new Car(); // 1번 생성자 선택
		car1.model = "트럭";
		car1.company = "기아자동차2";
		System.out.println("car1.compay:"+car1.company); 
		System.out.println("car1.model:"+car1.model);
		// 외부 클래스에 접근하고 할때. 객체를 생성하고 도트연산자를 통해 전급해야한다. car1.company
		System.out.println("-------------------------------");
		
		Car car2 = new Car("자가용");
		
		System.out.println("car2.compay:"+car2.company); 
		System.out.println("car2.model:"+car2.model);
		System.out.println("-------------------------------");
		
		Car car3 = new Car("자가용", "흰색");
		car3.company = "기아자동차";
		car3.model = "트럭";
		car2.color = "노랑"; // car2생성자를 통해 필드의 color값을 변경했는데?? 왜 출력은 안변할까?
		//외부클래스의 필드 값이 변경되는것이 아니고, car3객체에 필드값이 변경된다.
		// 외부클래스의 변수이름만 가져다 사용할뿐이다 라고 생각하는것이 좋을듯하다.
		//car3.color= "빨강"; //빨강으로 나오는데..
		System.out.println("car3.company:"+car3.company);
		System.out.println("car3.model:"+car3.model);
		System.out.println("car3.color:"+car3.color); //?? 왜 노랑색이 아닐까?
		System.out.println("-------------------------------");
	}

}
