package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class ja0115_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 맞추기
		// 로또번호 6개와 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력하시오.

		// 1-45까지 로또번호 6개와 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력하시오.

		//1. 변수선언
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] input = new int[6];
		int[] answer = new int[6];	// 맞춘번호 6개
		int count = 0;	// 정답개수

		//2. 1-45 번호저장
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}


		//3. 배열섞기
		int temp = 0;
		for(int i=0; i<300; i++) {
			int ranNum = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}

		//4. 6개 로또번호
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = ball[i];
		}

		//5. 입력창만들기
		String[] balls = new String[45];
		for(int i=0; i<balls.length; i++) {
			balls[i] = i+1+"";
		}

		int k = 0;
		while(k<6) {
			System.out.println("	  [ 로또맞추기 ]");
			for(int i=0; i<balls.length; i++) {
				if(i%5 == 0) {
					System.out.println();
				}
				System.out.print(balls[i] + "\t");
			}
			System.out.println();
			System.out.printf("%d번째 | 번호를 입력하세요 >>\t",k+1);
			input[k] = scan.nextInt();

			// 입력한 번호 5 -> 5번 자리에 X 입력
			balls[input[k]-1] = "X";

			k++;
		}


		// 6. 맞춘번호 확인 - input,lotto
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				if(input[i] == lotto[i]) {
					answer[count] = lotto[i];
					count++;
					break;
				}
			}
		}


		// 7. 출력
		System.out.println("[ 결과 ]");
		System.out.print("로또번호 : ");
		System.out.println(Arrays.toString(lotto));
		System.out.print("입력번호 : ");
		System.out.println(Arrays.toString(input));
		System.out.print("맞춘번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println("맞춘개수 : " + count + "개");


	}

}
