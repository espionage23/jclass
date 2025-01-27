package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);

	ArrayList<Stu> list = new ArrayList<Stu>();
	int no=0, kor=0, eng=0, math=0, total=0, rank=0;
	String name = "";
	double avg = 0;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};


	// 1. 입력
	void input() {
		System.out.println("       [ 성적 입력 ] ");
		System.out.println("---------------------------------");
		while(true) {
			System.out.printf("%d번째 학생\n",list.size()+1);
			System.out.printf("학생 이름 (0. 종료)>>");
			name = scan.next();
			if(name.equals("0")) {
				break;
			}
			System.out.printf("국어 점수 >>");
			kor = scan.nextInt();
			System.out.printf("영어 점수 >>");
			eng = scan.nextInt();
			System.out.printf("수학 점수 >>");
			math = scan.nextInt();

			// list 저장
			list.add(new Stu(name,kor,eng,math));
			System.out.printf("%s 학생이 저장되었습니다.\n",name);
			System.out.println();
		}
	}	// 1


	// 2. 출력
	void listPrint() {
		System.out.println();
		System.out.println("			[성적 출력 ]");
		System.out.println("---------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		for(int i=0; i<list.size(); i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println();
	}//2


	// 3. 삭제
	void stuDel() {
		System.out.println();
		System.out.println("     [ 성적 삭제 ]");
		System.out.println("---------------------------------");
		System.out.printf("삭제할 학생 이름 >>");
		String search = scan.next();
		boolean found = false;
		for(int i=0; i<list.size(); i++) {
			if(search.equals(list.get(i).getName())) {
				System.out.printf("%s 학생 성적이 삭제되었습니다.",list.get(i).getName());
				list.remove(i);
				found = true;
				break;
			}
		}
		if(found == false) {
			System.out.println("검색하신 학생이 없습니다.");
		}
		System.out.println();
	}//3


	// 4. 수정
	void modify() {
		System.out.println();
		System.out.println("         [ 성적 수정 ]");
		System.out.println("---------------------------------");
		System.out.printf("수정할 학생 이름 >>");
		String search = scan.next();
		boolean found = false;
		for(int i=0; i<list.size(); i++) {
			if(search.equals(list.get(i).getName())) {
				System.out.println("수정할 과목 선택");
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				int choice = scan.nextInt();
				switch(choice) {
				case 1:
					System.out.printf("현재 국어 점수 : %d\n",list.get(i).getKor());
					System.out.printf("수정할 점수 >> ");
					list.get(i).setKor(scan.nextInt());
					break;
				case 2:
					System.out.printf("현재 영어 점수 : %d\n",list.get(i).getEng());
					System.out.printf("수정할 점수 >> ");
					list.get(i).setEng(scan.nextInt());
					break;
				case 3:
					System.out.printf("현재 수학 점수 : %d\n",list.get(i).getMath());
					System.out.printf("수정할 점수 >> ");
					list.get(i).setMath(scan.nextInt());
					break;
				}
				found = true;
				System.out.println("수정이 완료되었습니다.");
				System.out.println();
			}
		}// for
		if(found == false) {
			System.out.println("검색하신 학생이 없습니다.");
		}

	}// 4 수정


	// 5. 검색
	void stuSearch() {
		System.out.println();
		System.out.println("         [ 성적 검색 ]");
		System.out.println("---------------------------------");
		System.out.printf("수정할 학생 이름 >>");
		String search = scan.next();
		boolean found = false;
		for(int i=0; i<list.size(); i++) {
			if(search.equals(list.get(i).getName())) {
				System.out.println("---------------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
				System.out.println("---------------------------------------------------------------");
				found = true;
			}
		}
		if(found == false) {
			System.out.println("검색하신 학생이 없습니다.");
		}
	}	// 5 검색



}
