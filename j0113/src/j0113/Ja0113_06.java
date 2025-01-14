package j0113;

public class Ja0113_06 {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = 65;
		System.out.println(ch2);
		
		int ch3 = 65;
		System.out.println(ch3);
		
		//char ch4 = 'AB';
		String ch4 = "AB";
		System.out.println(ch4);

		String num = "3.14";
		System.out.println(num);
		
		String s1 = "A"+"B";
		System.out.println(s1); // 타입 : String
		
		System.out.println(""+7); // 타입 : String 7
		System.out.println(""+7+7); // 타입 : String 77
		System.out.println(7+7+""); // 타입 : String 14
		
		//char ch5 = '';	// ''사이에 내용이 없으면 에러
		char ch6 = ' '; // ' ' 사이에 빈공백문자 가능
		
		String s2 = "";
		String s3 = " ";
		
		byte b1 = 127;
		//byte b2 = 128;
		
		int n1 = 2147483647;
		//int n2 = 2147483648;
		
		// overflow 정수형 오버플로우는 정수 값이 증가하면서 허용된 가장 큰 값보다 커져 실제 저장되는 값이 의도치 않게 아주 작은 수 이거나 음수가 되는 것
		int n3 = n1 + 1; // -2147483648 ~ 2147483647
		
		System.out.println(n3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
