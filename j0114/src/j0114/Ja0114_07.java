package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		// 반복문

		Scanner scan = new Scanner(System.in);

		// while 구구단 출력.
		int w=2;			// 초기값
		while(w<=9) {		// 조건식
			System.out.printf("[ %d 단 ]\n", w);
			int h = 1;
			while(h<=9) {
				System.out.printf(" %d X %d = %d \n",w,h,w*h);
				h++;
			}
			w++;			// 증감식
		}


//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d \n", i,j,i*j);
//			}
//		}


		//while문
//		int i =1;
//		while(i<=5) {
//			System.out.println("안녕"+i);
//			i++;
//		}
//
//		for(int j=1;j<=5;j++) {
//			System.out.println("안녕"+j);
//		}

//		// 입력받은 숫자부터 입력받은 숫자까지 출력 프로그램 구현하시오.
//		System.out.println("첫 번째 숫자를 입력하세요.");
//		int num1 = scan.nextInt();
//		System.out.println("두 번째 숫자를 입력하세요.");
//		int num2 = scan.nextInt();
//
//		int min = Math.min(num1, num2);
//		int max = Math.max(num1, num2);
//
//		for(int i=min; i<=max; i++) {
//		    System.out.printf("[ %d 단 ]\n", i);
//		    for(int j=1; j<=9; j++) {
//		        System.out.printf("%d * %d = %d\n", i, j, i*j);
//		    }
//		    System.out.println(); // 단 사이에 빈 줄 추가
//		}




//		// 구구단
//		for(int i=2; i<=9; i++) {
//		    System.out.printf("[ %d 단 ]\n", i);
//		    for(int j=1; j<=9; j++) {
//		        System.out.printf("%d * %d = %d\n", i, j, i*j);
//		    }
//		    System.out.println(); // 단 사이에 빈 줄 추가
//		}





//		for(int i=0; i<=10; i++) { // 무한반복
//			System.out.println("안녕"+i );
//			break;
//		}




//		// 입력받은 글자를 1개씩 출력하는 프로그램을 구현하시오.
//		System.out.println("영문자를 입력하시오.");
//		String input = scan.next();
//		// 모두 영문자일때만 1개씩 출력하시오.
//		// 1. 영문자인지 확인
//		int temp = 0;
//		for (int i = 0; i < input.length(); i++) {
//		    char ch = input.charAt(i);
//		    if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
//		        temp = 1;
//		        break;
//		    }
//		}
//
//		// 2. 영문자이면 출력, !경우 다시 입력 출력
//		if(temp == 0) {
//			for(int i=0; i<input.length(); i++) {
//				System.out.println(input.charAt(i));
//			}
//		}else {
//			System.out.println("입력한 글자중에 영문자가 아닌 것이 있습니다.");
//		}



//		String input = "abcdefghijk";
//		for(int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}


//		String input = "abcde";
//		System.out.println(input.length());
//		System.out.println(input.charAt(4));


//		System.out.println("글자를 입력하세요. (영문자만 입력가능)");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
//			System.out.println("출력 : " + ch);
//		}else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요.");
//		}


//		int sum = 0;
//		for(int i = 1;i<=10;i++) {
//			sum = sum + i; // or sum += i;
//		}
//
//		System.out.println(sum);


	}

}
