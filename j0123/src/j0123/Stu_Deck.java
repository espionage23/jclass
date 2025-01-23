package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	Scanner scan = new Scanner(System.in);

	ArrayList list = new ArrayList();
	int no = 0, kor = 0, eng=0, math=0, total=0, rank=0;
	String name = "";
	double avg = 0;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int count = 0, temp = 0, rankcount = 0, choice = 0;

	// 0. 상단 메뉴 메소드
	int main_print() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("5. 등수처리");
		System.out.println("0. 종료");
		System.out.println("-----------------------------------");
		System.out.println("원하는 번호를 입력하세요 >> ");
		choice = scan.nextInt();
		return choice;
	}


	// 1. 입력 메소드
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		// 입력
		while(true) {
			System.out.printf("[ %d번째 ]\n", list.size()+1);

			// 이름
			System.out.println("이름을 입력하세요. [ 0. 이전페이지 이동 ] >> ");
			name = scan.next();
			// 0인지 확인
			if(name.equals("0")) {
				break;
			}

			// 점수
			System.out.printf("국어점수를 입력하세요 >> \n");
			kor = scan.nextInt();
			System.out.printf("영어점수를 입력하세요 >> \n");
			eng = scan.nextInt();
			System.out.printf("수학점수를 입력하세요 >> \n");
			math = scan.nextInt();

			// list 저장
			list.add(new Stu(name,kor,eng,math));
			System.out.printf("%s 학생이 저장되었습니다.\n", name);
		} //while

	}


	// 2. 입력 메소드
	void output(){
		System.out.println("[ 학생성적 출력 ]");
		// 출력
		System.out.println("                 [ 학생성적 ] ");
		System.out.println("-------------------------------------------------------------");
		for(int j=0; j<title.length; j++) {
			System.out.printf("%s\t",title[j]);
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		for(int j=0; j<list.size(); j++) {
			Stu s = (Stu)list.get(j);	// Object 타입이라 형변환이 필요함
			System.out.printf("%s\t",s.getNo());
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMath());
			System.out.printf("%d\t",s.getTotal());
			System.out.printf("%.2f\t",s.getAvg());
			System.out.printf("%d\n",s.getRank());
		}
		System.out.println("-------------------------------------------------------------");
	}

	// 3. 수정 modify
	void modify() {
		System.out.println("[ 학생성적 수정 ]");
		// 수정할 학생이름을 검색하시오.
		System.out.println("수정할 학생의 이름을 검색하세요. >>");
		String search = scan.next();

		// name 배열
		int searchNo = 0;
		for(int j=0; j<list.size() j++) {
			if(search.equals(name[j])) {
				searchNo = j;	// 위치값
				temp = 1;		// 검색이 있음
			}
		}

		if(temp == 0) {
			System.out.println("검색한 학생의 이름이 없습니다.");
		}else {
			System.out.printf("[ %s 학생 성적 수정 ]\n",search);
			System.out.println("1. 국어점수 수정");
			System.out.println("2. 영어점수 수정");
			System.out.println("3. 수학점수 수정");
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호를 입력하세요 >> ");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("[ 국어점수 수정 ]");
				System.out.printf("현재점수 : %d\n", score[searchNo][0]);
				System.out.println("수정 >> ");
				score[searchNo][0] = scan.nextInt();
				break;

			case 2:
				System.out.println("[ 영어점수 수정 ]");
				System.out.printf("현재점수 : %d\n", score[searchNo][1]);
				System.out.println("수정 >> ");
				score[searchNo][1] = scan.nextInt();
				break;

			case 3:
				System.out.println("[ 수학점수 수정 ]");
				System.out.printf("현재점수 : %d\n", score[searchNo][2]);
				System.out.println("수정 >> ");
				score[searchNo][2] = scan.nextInt();
				break;
			}// switch
			score[searchNo][3] = score[searchNo][0]+score[searchNo][1]+score[searchNo][2];
			avg[searchNo] = score[searchNo][3]/3.0;
		}
	}



}
