package Stu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck{
	Scanner scan = new Scanner(System.in);

	int choice=0, no=0, kor=0, eng=0, math=0, total=0, rank=0;
	String name = "";
	double avg=0;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};

	ArrayList<Stu> list = new ArrayList<Stu>();

	//1. 입력
	void input() {
		System.out.println("   [ 학생성적입력 ]");
		System.out.println("-------------------------");
		while(true) {
			System.out.printf("%d번째 학생\n",list.size()+1);
			System.out.print("이름을 입력하세요 (0. 이전) >>");
			name = scan.next();
			if(name.equals("0")) {
				System.out.println();
				break;
			}
			System.out.print("국어 점수 >>");
			kor = scan.nextInt();
			System.out.print("영어 점수 >>");
			eng = scan.nextInt();
			System.out.print("수학 점수 >>");
			math = scan.nextInt();

			// list 저장
			list.add(new Stu(name,kor,eng,math));
			System.out.println("학생이 저장되었습니다.");
			System.out.println();
		}// while
	}//input

	// 2. 출력
	public void output() {
		System.out.println(" 			   [ 학생성적출력 ]");
		System.out.println("---------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		for(int i=0; i<list.size(); i++	) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println();
	}

	// 3. 수정
	public void modify() {
		System.out.println("   [ 학생성적수정 ]");
		System.out.println("-------------------------");
		System.out.print("수정할 학생 >>");
		String search = scan.next();
		boolean found = false;

		for(int i=0; i<list.size(); i++) {
			if(search.equals(list.get(i).getName())) {
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				System.out.print("수정할 과목 >> ");
				choice = scan.nextInt();
				switch(choice) {
				case 1:
					System.out.printf("현재 국어점수 : %d\n",list.get(i).getKor());
					System.out.print("수정할 점수 >>");
					list.get(i).setKor(scan.nextInt());
					break;
				case 2:
					System.out.printf("현재 영어점수 : %d\n",list.get(i).getEng());
					System.out.print("수정할 점수 >>");
					list.get(i).setEng(scan.nextInt());
					break;
				case 3:
					System.out.printf("현재 수학점수 : %d\n",list.get(i).getMath());
					System.out.print("수정할 점수 >>");
					list.get(i).setMath(scan.nextInt());
					break;
				}
				found = true;
				list.get(i).setTotal(list.get(i).getKor() + list.get(i).getEng() + list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal()/3.0);
				System.out.println("수정이 완료되었습니다.");
				System.out.println();
			}
		}
		if(found == false) {
			System.out.println("검색하신 학생이 없습니다.");
			System.out.println();
		}

	}// modify

	public void stuDel() {
		System.out.println("[ 학생성적삭제 ]");
		System.out.println("-------------------------");
		System.out.print("삭제할 학생 >>");
		String search = scan.next();
		boolean found = false;

		for(int i=0; i<list.size(); i++) {
			if(search.equals(list.get(i).getName())) {
				System.out.printf("%s 학생 성적을 삭제했습니다.\n",list.get(i).getName());
				list.remove(i);
				found = true;
				break;
			}
		}
		if(found == false) {
			System.out.println("검색하신 학생이 없습니다.");
		}
		System.out.println();
	}// stuDel

	// 5. 검색
	public void stuSearch() {
		System.out.println("   [ 학생검색 ]");
		System.out.println("-------------------------");
		System.out.print("검색할 학생 >>");
		String search = scan.next();
		boolean found = false;

		for(int i=0; i<list.size(); i++) {
			if(search.equals(list.get(i).getName())) {
				System.out.println("---------------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
				System.out.println("---------------------------------------------------------------");
				found = true;
				break;
			}
		}
		if(found == false) {
			System.out.println("검색하신 학생이 없습니다.");
		}
		System.out.println();
	}//stuSearch


	// 6. 등수정렬
	public void sortByRank() {
		// 총점 기준 내림차순 정렬
		Collections.sort(list, new Comparator<Stu>() {
			@Override
			public int compare(Stu s1, Stu s2) {
				return s2.getTotal() - s1.getTotal(); // 내림차순 정렬
			}
		});

		// 정렬 후 등수와 번호 재할당
		for (int i = 0; i < list.size(); i++) {
			Stu student = list.get(i);
			student.setRank(i + 1);
			student.setNo(i + 1);
		}

		System.out.println("학생들을 등수순으로 정렬했습니다.");
		System.out.println();
	}// 등수정렬



	// 7. 이름정렬
	public void sortByName() {
        Collections.sort(list, new Comparator<Stu>() {
            @Override
            public int compare(Stu s1, Stu s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("학생들을 이름순으로 정렬했습니다.");
        System.out.println();
    }// 이름정렬

	// 8. 등수처리
	public void calculateRank() {
		// 먼저 모든 학생의 등수를 1로 초기화
		for (Stu s : list) {
			s.setRank(1);
		}

		// 각 학생의 총점을 다른 모든 학생과 비교
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getTotal() < list.get(j).getTotal()) {
					// i번째 학생의 총점이 j번째 학생보다 낮으면 등수 1 증가
					list.get(i).setRank(list.get(i).getRank() + 1);
				}
			}
		}
		System.out.println("등수처리가 완료되었습니다.");
		System.out.println();
	}// 등수처리


	// 9. 파일저장
	public void saveToFile() {
	    String fileName = "c:/save/stu3.txt";
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
	        writer.write(String.join("\t", title));
	        writer.newLine();

	        for (Stu student : list) {
	            writer.write(String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d",
	                student.getNo(), student.getName(), student.getKor(), student.getEng(),
	                student.getMath(), student.getTotal(), student.getAvg(), student.getRank()));
	            writer.newLine();
	        }
	        System.out.println("학생 정보가 " + fileName + "에 저장되었습니다.");
	        System.out.println("저장된 학생 수: " + list.size());
	    } catch (IOException e) {
	        System.out.println("파일 저장 중 오류가 발생했습니다: " + e.getMessage());
	        e.printStackTrace();
	    }
	    System.out.println();
	}





}
