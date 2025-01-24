package j0124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int choice = 0, temp=0, count=0;

		StuDeck stuDeck = new StuDeck();
//		// 파일 읽어오기
//		stuDeck.fileRead();





		loop:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("4. 학생성적 삭제");
			System.out.println("5. 학생성적 검색");
			System.out.println("6. 등수정렬");
			System.out.println("7. 이름정렬");
			System.out.println("8. 파일 저장");
			System.out.println("9. 파일 읽어오기");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하는 번호 >> ");
			choice = scan.nextInt();

			switch(choice) {
			case 1:
				stuDeck.input();
				break;

			case 2:
				// list 출력
				stuDeck.listPrint();
				break;

			case 3:
				break;

			case 4:
				// 학생 삭제
				stuDeck.stuDel();
				break;

			case 5:
				break;

			case 6:
				break;

			case 7:
				break;

			case 8:
				break;

			case 9:
				// 파일 읽어오기
				stuDeck.fileRead();
				break;

			case 0:
				break loop;
			}
		}



	}

}
