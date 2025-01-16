package j0116;

import java.util.Scanner;

public class Ja0116_04 {

	public static void main(String[] args) {
		// 1. 5,5 배열 생성 - arr
		// 2. 뽑기 글자 입력
		// 3. 5,5 배열 생성 - arr2
		// 4. 25개 1차원 배열 생성
		// 5. 1차원 배열값 넣기
		// 6. 배열섞기
		// 7. 번호입력
		// 8. 당첨확인

		Scanner scan = new Scanner(System.in);

		// 1. 배열생성
		String[][] arr = new String[5][5];
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int x=0, y=0;



		// 6. 1차원 섞기
		int temp = 0;
		for(int i=0; i<300; i++) {
			int ran = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
		}


		// 2. 뽑기입력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "뽑기";
			}
		}

		// 3. arr2 생성
		String[][] arr2 = new String[5][5];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = num[5*i+j]+"";
			}
		}


		// 출력
		int no = 0;
		loop:while(no<10) {
			System.out.println("		[ 뽑기 게임] ");
			System.out.println("-------------------------------------------");
			System.out.printf("좌표  |  0\t1\t2\t3\t4\n");
			System.out.println("-------------------------------------------");
			for(int i=0; i<arr.length; i++) {
				System.out.printf("%d     |\t",i);
				for(int j=0; j<arr.length; j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("-------------------------------------------");

			// 좌표입력
			System.out.print("x축 >> ");
			x = scan.nextInt();
			System.out.print("y축 >> ");
			y = scan.nextInt();

			System.out.printf("입력 : [%d,%d]\n",x,y);

		}


	}

}
