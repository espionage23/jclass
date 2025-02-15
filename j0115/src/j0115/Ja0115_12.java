package j0115;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 국어, 영어, 수학 3명 학생의 성적을 입력하시오.

		String[] title = {"이름","국어","영어","수학","합계","평균"};

		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		// 성적을 입력받아 출력하시오.

		// 성적 입력
		for(int i=0; i<score.length; i++) {
			// 이름 입력
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();

			int total = 0;
			for(int j=0; j<score[i].length-1; j++) {
				System.out.printf("[%s]점수 >> :", title[j+1]);
				score[i][j] = scan.nextInt();
				total += score[i][j];
				if(j==2) {
					score[i][j+1] = total;
					avg[i] = total/3.0;
				}
			}
			System.out.println();
		}

		// 성적 출력
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", title[0], title[1], title[2], title[3],title[4],title[5]);
		System.out.println("-------------------------");
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t");
		}




		//로또번호 입력을 3개 받아 출력하시오.
//		int[] input = new int[3];
//		for(int i=0; i<input.length; i++) {
//			System.out.printf("로또번호 입력 (%d번째)>>",i+1);
//			input[i] = scan.nextInt();
//		}
//		System.out.println(Arrays.toString(input));


	}

}
