package j0124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int no = 0, kor=0, eng=0, math=0, total=0, rank=0;
	int count = 0;
	String name = "";
	double avg = 0;

	// 입력
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		//입력
		while(true) {
			System.out.printf("[ %d 번째 ]\n",list.size()+1);
			//이름
			System.out.println("이름을 입력하세요.(0.이전페이지 이동) ");
			name = scan.next();
			//0인지 확인
			if(name.equals("0")) {
				break;
			}
			//국어,영어,수학
			System.out.printf("국어 점수를 입력하세요.\n");
			kor = scan.nextInt();
			System.out.printf("영어 점수를 입력하세요.\n");
			eng = scan.nextInt();
			System.out.printf("수학 점수를 입력하세요.\n");
			math = scan.nextInt();

			//list저장
			list.add(new Stu(name,kor,eng,math));
			System.out.printf("%s 학생이 저장되었습니다. \n",name);
		}//while
	}//input

	// 수정
	void stuModi() {
		System.out.println();
		System.out.println("                         [학생성적 수정] ");
		System.out.println("---------------------------------------------------------------");
		System.out.print("삭제할 학생의 이름 >> ");
		String search = scan.next();

	}

	// 삭제
	void stuDel() {
		System.out.println();
		System.out.println("                         [학생성적 삭제] ");
		System.out.println("---------------------------------------------------------------");
		System.out.print("삭제할 학생의 이름 >> ");
		String search = scan.next();
		 boolean found = false;
		    for(int i = 0; i < list.size(); i++) {
		        if(search.equals(list.get(i).getName())) {
		            System.out.printf("%s 학생의 성적이 삭제되었습니다.\n", list.get(i).getName());
		            list.remove(i);
		            found = true;
		            break;
		        }
		    }

		    if(!found) {
		        System.out.println("일치하는 이름이 없습니다.");
		    }

		    System.out.println();
		}


	// list 출력
	void listPrint() {
		System.out.println();
		System.out.println("                         [학생성적 출력] ");
		System.out.println("---------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		for(int i=0; i<list.size(); i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println();
	}

	void fileRead() throws Exception {
		// 파일 읽어오기
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br = new BufferedReader(fr);

		while(true) {
			String line = br.readLine();	// 1줄
			if(line == null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
            kor = Integer.parseInt(str[2]);
            eng = Integer.parseInt(str[3]);
            math = Integer.parseInt(str[4]);
            total = Integer.parseInt(str[5]);
            avg = Double.parseDouble(str[6]);
            rank = Integer.parseInt(str[7]);
            list.add(new Stu(no, name, kor, eng, math, total, avg, rank));
		}
		br.close();
		fr.close();
		System.out.println();
		System.out.println("파일을 불러왔습니다.");
		System.out.println();
	}

}
