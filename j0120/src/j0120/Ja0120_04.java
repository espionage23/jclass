package j0120;

import java.util.Arrays;

public class Ja0120_04 {

	public static void main(String[] args) {

		// 두수를 Cal3에 보내면 +,-,*의 값을 리턴해서 출력하시오.
		Cal3 c3 = new Cal3();
		int[] re = new int[3];
		int a = 10;
		int b = 3;

		c3.op(a, b, re);
		System.out.println(Arrays.toString(re));





//		// Cal2 - strPrint()에서 이름을 입력받아
//		// main 메소드에서 str 변수로 넘겨받아 출력하시오.
//
//		Cal2 c2 = new Cal2();
//		String[] input = c2.strPrint();
//		System.out.println(Arrays.toString(input));











		//-------------------------------------------
//		// 입력부분을 class로 분리
//		Input ip = new Input();
//
//		// main 메소드에서 배열을 사용하여
//		//5개를 입력받아 출력하시오.
//		int[] input = new int[5];
//
//		for(int i=0; i<input.length; i++) {
//			input[i] = ip.valInput();
//		}
//
//		for(int i=0; i<input.length; i++) {
//			System.out.println("입력값 : " + input[i]);
//		}

		//-------------------------------------------








//		int a = 10;
//		int b = 3;
//
//		Cal c = new Cal();
//		int result = c.multi(a, b);
//		System.out.println(result);
//
//		int result2 = c.add(a, b);
//		System.out.println(result2);
//
//		double result3 = c.div(a, b);
//		System.out.println(result3);

	}

}
