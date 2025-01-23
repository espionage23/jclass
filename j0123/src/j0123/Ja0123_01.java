package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Ja0123_01 {

	public static void main(String[] args) {
		// 학생성적프로그램
		// 번호, 이름, 국어, 영어, 수학, 합계, 평균

		Stu_Deck sd = new Stu_Deck();

		Scanner scan = new Scanner(System.in);

		int choice = 0;


		//무한반복
		loop:while(true) {
			// 화면구현
			choice = sd.main_print();

			switch(choice) {
			case 1: {
				sd.input();
				break;
			}

			case 2: {
				sd.output();
				break;
			}

			case 3: {
				sd.modify();
				break;
			}
//			case 3: {
//				System.out.println("[ 학생성적 수정 ]");
//				// 수정할 학생이름을 검색하시오.
//				System.out.println("수정할 학생의 이름을 검색하세요. >>");
//				String search = scan.next();
//
//				// name 배열
//				int searchNo = 0;
//				for(int j=0; j<name.length; j++) {
//					if(search.equals(name[j])) {
//						searchNo = j;	// 위치값
//						temp = 1;		// 검색이 있음
//					}
//				}
//
//				if(temp == 0) {
//					System.out.println("검색한 학생의 이름이 없습니다.");
//				}else {
//					System.out.printf("[ %s 학생 성적 수정 ]\n",search);
//					System.out.println("1. 국어점수 수정");
//					System.out.println("2. 영어점수 수정");
//					System.out.println("3. 수학점수 수정");
//					System.out.println("-----------------------------------");
//					System.out.println("원하는 번호를 입력하세요 >> ");
//					choice = scan.nextInt();
//					switch(choice) {
//					case 1:
//						System.out.println("[ 국어점수 수정 ]");
//						System.out.printf("현재점수 : %d\n", score[searchNo][0]);
//						System.out.println("수정 >> ");
//						score[searchNo][0] = scan.nextInt();
//						break;
//
//					case 2:
//						System.out.println("[ 영어점수 수정 ]");
//						System.out.printf("현재점수 : %d\n", score[searchNo][1]);
//						System.out.println("수정 >> ");
//						score[searchNo][1] = scan.nextInt();
//						break;
//
//					case 3:
//						System.out.println("[ 수학점수 수정 ]");
//						System.out.printf("현재점수 : %d\n", score[searchNo][2]);
//						System.out.println("수정 >> ");
//						score[searchNo][2] = scan.nextInt();
//						break;
//					}// switch
//					score[searchNo][3] = score[searchNo][0]+score[searchNo][1]+score[searchNo][2];
//					avg[searchNo] = score[searchNo][3]/3.0;
//				}
//				break;
//				}
//			case 4:
//				rankcount = 1;	//리셋
//				System.out.println("[등수처리]");
//				for(int j=0; j<count; j++) {
//					for(int k=0; k<count; k++) {
//						if(score[j][3] < score[k][3]) {
//							rankcount++;
//						}
//					}
//					rank[j] = rankcount;
//				}
//				System.out.println("등수처리가 완료되었습니다.");
//
//				break;
//
//
			default:
				System.out.println("[ 프로그램을 종료 ]");
				break loop;
			}// switch
		} // while loop

	}

}
