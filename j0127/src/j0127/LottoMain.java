package j0127;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// 1. ball 객체
		// 2. ball_deck 객체(-ball 45개 생성, ball 숫자 입력, ball 섞기, 6개 로또번호 추출, 6개 숫자 입력, 로또번호와 입력번호 비교)
		// 3. main에서 로또 프로그램을 실행해서
		//    6개 숫자입력, 로또번호와 비교해서 몇개를 맞췄는지 확인

		Ball_deck bd = new Ball_deck();

        System.out.println("[ 로또 프로그램 ]");

        int[] lottoNumbers = bd.lotto();
        int[] userNumbers = bd.input();
        bd.match();

        System.out.println(" [ 로또번호 확인 ] ");
        System.out.printf("로또번호: %s\n", Arrays.toString(lottoNumbers));
        System.out.printf("입력번호: %s\n", Arrays.toString(userNumbers));
        System.out.printf("맞춘개수: %d\n", bd.count());
        System.out.print("맞춘번호 : ");
        for(int i=0; i<6; i++) {
            if(Arrays.binarySearch(lottoNumbers, userNumbers[i]) >= 0) {
                System.out.print(userNumbers[i] + " ");
            }
        }
        System.out.println();




	}

}
