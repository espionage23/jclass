package j0113;

public class Ja0113_05 {

	public static void main(String[] args) {
		
		// boolean - true, false
		// char - ''표시, 아스키코드 값: 65='A', 97='a', 48='0'
		// 정수형 - byte, short 거의 사용안함. 기본형 int - 값을 입력
		// 정수형 - long : 접미사 L 붙여야 함.
		// 실수형 - float, double	float - 접미사 F, double - D 생략가능
		
		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = '\u0041'; //16*4 + 1*1 = 64+1 = 65 
		System.out.println(ch2);
		
		char ch3 = 97;	// 97=a 아스키코드
		System.out.println(ch3);
		
		char ch4 = '\t';
		System.out.print(ch4);
		
		char ch5 = 'a';
		System.out.print(ch5);
		
		char ch6 = 'b';
		System.out.print(ch6);
		
		char ch7 = 'c';
		System.out.print(ch7);
		
		boolean p = true;
		boolean p2 = false;
		
		long l = 10000000000L;
		
		float f = 3.14F;
		float f2 = 100F; //실제적으로 100.0으로 출력,  정수를 넣을때 F를 생략가능하나 어지간해서 접미사를 넣는게 좋다.
		// 3.14e3f -> 3140.0F	1e1 -> 10.0D
		
		double d = 3.14D;
		
		
	
		

	}

}
