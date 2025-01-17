package j0117;

public class Ja0117_06 {

	static int c = 0; 	// 1. 클래스 변수 - 프로그램이 실행되면 사용가능
	int num = 10; 			// 2. 인스턴스 변수 - 객체선언을 해야 사용가능

	public static void main(String[] args) {

		Stu.count =1;
		System.out.println(Stu.count);




		// 1-100까지의 합을 구하시오.
		// 1-100 -> 200을 넘는 시점의 i의 값은?
//		int sum = 0;
//		int sum2 = 0;
//		int k = 0;
//		int k2 = 0;
//		for(int i=1; i<=100; i++) {
//			sum += i;
//			if(sum > 200) {
//				k = i;
//				k2 = i-1;
//				sum2 = sum - i;
//				break;
//			}
//		}
//
//		// 200 바로 전단계
//		System.out.println("i의 값 : " + k2);
//		System.out.println("합계 : "+sum2);
//
//		// 200이 넘는 시점
//		System.out.println("i의 값 : " + k);
//		System.out.println("합계 : "+sum);


//		int a = 5; 			// 3. 지역 변수 - 객체선언을 해야 사용가능
//		System.out.println(a);


		// 변수의 종류
		// 1. 클래스 변수
		// 2. 인스턴스 변수
		// 3. 지역 변수

		// 선언위치
		// 클래스 영역 -> 클래스 변수, 인스턴스 변수
		// 메서드 영역 -> 지역변수

		// 생성시기
		// 클래스 - 클래스가 메모리에 올라갈 때
		// 인스턴스 - 인스턴스 생성시
		// 지역 - 변수 선언문 수행시

	}

}
