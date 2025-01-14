package j0114;

import java.util.Scanner;

public class Ja0114_05 {

	public static void main(String[] args) {

		// 나머지연산자 - %
		// 비교연산자 - > < >= <= == !=
		// 논리연산자 - && ||

		Scanner scan = new Scanner(System.in);


		// 대입연산자
		// 3개의 숫자를 입력받아, 가장 큰 수를 출력하시오.
		System.out.println("수를 입력하세요. 1");
		int score1 = scan.nextInt();
		System.out.println("수를 입력하세요. 2");
		int score2 = scan.nextInt();
		System.out.println("수를 입력하세요. 3");
		int score3 = scan.nextInt();

		int maxNum = (score1 > score2)
	             ? ((score1 > score3) ? score1 : score3)
	             : ((score2 > score3) ? score2 : score3);
		System.out.println("최대값 : "+ maxNum);

		int minNum = (score1 < score2)
				? ((score1 < score3) ? score1 : score3)
				: ((score2 < score3) ? score2 : score3);
		System.out.println("최소값 : " + minNum);

		// 양수 0까지 포함, 음수
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		String result = (score>0)?"양수":(score==0)?"0":"음수";
//		System.out.println("결과 : " + result);


//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		String result = (score>=60)?"합격":"불합격";
//		System.out.println("결과 : " + result);

//		System.out.println("숫자를 입력하세요.");
//		int x = scan.nextInt();
//		int absX = x>=0?x:-x;
//		System.out.println(absX);



//		System.out.println("영문자를 입력하세요.");
//		char input = scan.next().charAt(0);
//		if( (input>='a' && input <='z') || (input>='A' && input<='Z') ) {
//			System.out.println("영문자 입니다.");
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}



//		if(5>3) {
//			System.out.println("정답");
//		}else {
//			System.out.println("오답");
//		}


		// 올림 - ceil, 버림 - floor, 반올림 - round,

//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점 3자리 실수를 입력하세요.");
//		double input = scan.nextDouble();
//
//		// 3자리에서 반올림해서 값을 출력하시오.
//
//		System.out.println(Math.round(input*100)/100.0);

//		System.out.println(Math.round(13.5));


		// 반올림
//		double pi = 3.141592;
//		double pi2 = Math.round(pi*1000)/1000.0;
//		System.out.println(pi2);


		// 버림
//		float pi = 3.141592f;
//		float pi2 = (int)(pi * 10000)/10000F;
//		System.out.println(pi2);


	}

}
