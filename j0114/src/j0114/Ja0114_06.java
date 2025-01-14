package j0114;

import java.util.Scanner;

public class Ja0114_06 {

	public static void main(String[] args) {
		// 조건문과 반복문
		// 1. 조건문 - if, switch
		//	- 조건문은 조건식과 실행될 하나의 문장 또는 블럭{}으로 구성
		//	- java에서 조건문은 if문과 switch문 두 가지 뿐이다.

		Scanner scan = new Scanner(System.in);

		// switch문
		// 1- 입력창 2- 검색창 3-수정창 4-삭제창 5-종료
		System.out.println("사용자 권한을 생성합니다.");
		int num = scan.nextInt();
		switch(num) {
		case 5:
			System.out.println("슈퍼바이저 권한이 부여됩니다.");
			break;
		case 4:
			System.out.println("삭제 권한이 부여됩니다.");
			break;
		case 3:
			System.out.println("수정 권한이 부여됩니다.");
			break;
		case 2:
			System.out.println("작성 권한이 부여됩니다.");
			break;
		case 1:
			System.out.println("읽기 권한이 부여됩니다.");
			break;
		}


//		System.out.println("원하는 번호를 입력하세요.");
//		int num = scan.nextInt();
//		switch(num) {
//		case 1:
//			System.out.println("입력창이 열립니다.");
//			break;
//		case 2:
//			System.out.println("검색창이 열립니다.");
//			break;
//		case 3:
//			System.out.println("수정창이 열립니다.");
//			break;
//		case 4:
//			System.out.println("삭제창이 열립니다.");
//			break;
//		default:
//			System.out.println("종료합니다.");
//			break;
//		}

		// if 점수를 입력받아, A-90, B-80, C-70, D-60, F-60 미만 학점을 출력
//		System.out.println("점수를 입력하세요.");
//		int num = scan.nextInt();
//		if(num>90) {
//			System.out.print("A");
//		}else if(num>80) {
//			System.out.print("B");
//		}else if(num>70) {
//			System.out.print("C");
//		}else if(num>=60) {
//			System.out.print("D");
//		}else {
//			System.out.print("F");
//		}
//		System.out.println("학점");


//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		if(num>0) {
//			System.out.println("양수입니다.");
//		}else if(num==0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}

	}

}
