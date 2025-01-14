package j0114;

import java.util.Scanner;

public class Ja0114_04 {

	public static void main(String[] args) {
		// 이항연산자

//		int a = 10;
//		a++;
//		int b = a;
//		System.out.println("a : " + a);		// a : 11
//		System.out.println("b : " + b);		// b : 10

		// byte, short, char 사칙연산을 하면 int로 타입이 변경됨.

//		byte a = 1;
//		byte b = 2;
//		byte c = (byte)(a+b);
////		byte d = (byte)a + (byte)b; -> 에러
//
//		char ch = 'a';
//		char ch2 = 'b';
//		int ch3 = ch+ch2;
//		System.out.println(ch3); // 아스키코드
//
//		double d1 = 3.14;
//		int num = (int)d1;
//		System.out.println(num);

//		int a = 10000000;
//		int b = 20000000;
//		// long c = a * b; // int * int = int overflow 발생
//		long c = (long) a * b; // long * long으로 연산 / 둘중에 하나만 타입을 변경해도 ok
//		System.out.println("c : " + c); // 552894464
//
//		int n1 = 2100000000;
//		int n2 = 2000000000;
//		long n3 = (long) n1 + n2;
//		System.out.println(n3); // -194967296
//
//		long l1 = 1000000 * 1000000; // -727379968
//		long l2 = 1000000 * 1000000L; // 1000000000000
//		// 접미사 꼭 넣으셈
//		System.out.println(l2);

//		char c1 = 'a';
//		char c2 = (char)(c1 + 1) ;
//		System.out.println(c2);		// b
//
//		int n1 = c1 + 1;
//		System.out.println(n1);		// 98 아스키코드 97+1
//
//		char c3 = ++c1;
//		System.out.println(c3);		// b
//
//		int n2 = 'B' - 'A';
//		System.out.println(n2);		// 아스키코드 1
//
//		int n3 = '9' - '0';
//		System.out.println(n3);		//9 문자에서 int로 변경
//
//		int n4 = '2' - '0';
//		System.out.println(n4);		// 2

//		char ch1 ='a';
//		char ch2 = (char)(ch1-32);
//		System.out.println(ch2);	// 아스키코드
//
//		char ch3 = 'A';
//		char ch4 = (char)(ch3+32);
//		System.out.println(ch4);


		
		Scanner scan = new Scanner(System.in);
		System.out.println("소문자를 입력하세요.");
		char str = scan.next().charAt(0);
		// 입력한 소문자를 대문자로 출력하시오.
		str = (char)(str-32);
		System.out.println(str);










	}

}
