package j0116;

import java.util.Scanner;

public class ja0116_06 {

	public static void main(String[] args) {
		// 1. 변수선언
		// 2. 화면구현
		// 3. 번호선택 switch
		// 4. 학생성적입력
		// 5. 학생성적출력
		// 6. 종료

		Scanner scan = new Scanner(System.in);

		// 1. 변수
		int count = 0;
		int[][] score = new int[10][4];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = new int[10];
		String[] name = new String[10];
		double[] avg = new double[10];
		int choice = 0;

		// 2. 화면구현
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("0. 종료");
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호를 입력하세요 >> ");
			choice = scan.nextInt();

			switch(choice) {
			case 1:
				int w = count;
				while(w<10) {
					System.out.printf("[ %d번째 ]\n", count+1);

					// 번호
					no[w] = count+1;

					// 이름
					System.out.println("이름을 입력하세요 [ 0. 이전페이지 이동 ] >>");
					name[w] = scan.next();
					// 0인지 확인
					if(name[w].equals("0")) {
						break;
					}

					// 점수
					int total = 0;
					for(int i=0; i<3; i++) {
						System.out.printf("%s점수를 입력하세요 >> ",title[i+2]);
						score[w][i] = scan.nextInt();
						total += score[w][i];
					}
					// 합계
					score[w][3] = total;
					// 평균
					avg[w] = total/3.0;

					w++;
					count++;
				}// while
				break;

			case 2:
				System.out.println("              [ 학생성적 출력 ]");
				System.out.println("-----------------------------------------------------");
				for(int i=0; i<title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("-----------------------------------------------------");
				for(int i=0; i<count; i++) {
					System.out.printf("%d\t",no[i]);
					System.out.printf("%s\t",name[i]);
					for(int j=0; j<score[i].length; j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%.2f\n",avg[i]);
				}
				System.out.println("-----------------------------------------------------");
				break;

			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			} //switch

		}// loop





	}

}
