package j0113;

public class Ja0113_07 {

	public static void main(String[] args) {
		// 형변환
		// 값의 타입을 다른 타입으로 변환하는 것이다
		// boolean을 제외한 7개의 기본형은 서로 형변환이 가능하다.
		
		// int -> char | (char)65 | 'A'
		// char -> int | (int)'A' | 65
		// float -> int | (int) 1.6F | 1
		// int -> float | (float) 10 | 10.0F
		
		int n1 = 65;
		char ch1 = (char)n1; //int -> char : 강제형변환 변환하려는 타입을 붙여줌.
		System.out.println(n1);
		System.out.println(ch1);
		
		char ch2 = 'a';
		int n2 = ch2; // 변환하려는 타입 생략가능
		System.out.println(n2);
		
		float f1 = 3.14F;
		int n3 = (int)f1;
		System.out.println(n3);
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2);
		
		

	}

}
