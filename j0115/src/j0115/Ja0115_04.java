package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_04 {

	public static void main(String[] args) {
		// 1-100까지 랜덤숫자를 생성
		// 10번의 도전으로 정답을 맞추면 종료되도록
		// 랜덤숫자보다 큰수, 작은수 입니다 출력되도록.
		// 입력한 숫자를 모두 출력

		// 랜덤숫자 : 55
		// 입력숫자 : 1,2,3,4,5

		Scanner scan = new Scanner(System.in);

		int rannum = (int)(Math.random()*100)+1;
		int[] score = new int[10];
		int count = 0;

		for(int i=0; i<10; i++) {
			System.out.printf("%d번째 숫자를 입력 >> \n", i+1);
			int input = scan.nextInt();
			score[i] = input;
			if(rannum == input) {
				System.out.println("정답입니다.");
				break;
			}else if(rannum > input) {
				System.out.println("수가 작습니다.");
				count += 1;
			}else {
				System.out.println("수가 큽니다.");
				count += 1;
			}
		}

		System.out.println("랜덤숫자 : " + rannum);
		System.out.printf("도전횟수 : %d \n", count);
		System.out.print("입력숫자 : ");
		for(int i=0; i<count; i++) {
			if(i == (count-1)) {
				System.out.print(score[i]);
			}else {
				System.out.print(score[i]+",");
			}
		}


	}

}
