package Student;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		StuDeck sd = new StuDeck();

		int choice = 0;

		loop:while(true) {
			System.out.println();
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 삭제");
			System.out.println("4. 학생성적 수정");
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
				sd.input();
				break;
			case 2:
				sd.listPrint();
				break;
			case 3:
				sd.stuDel();
				break;
			case 4:
				sd.modify();
				break;
			case 5:
				sd.stuSearch();
				break;
			case 0:
				break loop;
			}// switch

		} // loop


	}

}
