package j0117;

public class Ja0117_09 {

	// 메서드
	int add(int a, int b) {
		int result = a+b;
		return result;
	}

	boolean power;		// 인스턴스변수 - 객체선언 후, 참조변수명.변수명
	void power() {
		power = !power;
	}


	// 메서드
	public static void main(String[] args) {

		// 기본형 매개변수와 참조형 매개변수 강조...

//		 2개의 값을 넘겨주면
//		 메소드 3개
//		 a,b -> a,b 각각 10 더해서 두수를 더하기를 해서 리턴
//		 a,b -> a,b 각각 10 곱해서 두수를 더하기 해서 리턴
//		 a,b -> a,b 곱해서 리턴

		Cal2 c2 = new Cal2();

		int num = 1;
		int num2 = 2;

		// 입력이 -1이 들어오면 프로그램을 종료하시오.

		System.out.println("메서드 1 : " + c2.add(num,num2));
		System.out.println("메서드 2 : " + c2.mult(num,num2));
		System.out.println("메서드 3 : " + c2.abc(num,num2));



//		Cal c = new Cal();		// 객체선언
//
//		//
//		int num = 100;
//		int num2 = 20;
//
//		int result = c.add(num, num2);
//
//		System.out.println("더하기 : " + result);
//
//		int result2 = c.sub(num, num2);
//		System.out.println("빼기 : " + result2);
//
//		c.mult(num2, num2);





//		int a = 0;	// 지역변수
//		Ja0117_09 j = new Ja0117_09();
//		j.power = true;
//		System.out.println(j.power);




		// 메서드란?
		// 작업을 수행하기 위한 명령문의 집합
		// 어떤 값을 입력 받아서 처리하고 그 결과를 돌려준다.



	}

}
