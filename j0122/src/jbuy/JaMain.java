package jbuy;

import java.util.Scanner;

public class JaMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 로그인 구현
		// 보유한 금액, 보너스 포인트가 설정

		Buyer b = new Buyer();	// b 10,000,000


		loop:while(true) {
			System.out.println("[ 전자제품 쇼핑몰 ] ");
			System.out.println("1. Tv");
			System.out.println("2. Computer");
			System.out.println("3. Audio");
			System.out.println("9. 구매정보");
			System.out.println("0. 쇼핑 종료");
			System.out.println("구매를 원하는 번호를 입력하세요.");
			int choice = scan.nextInt();

			switch(choice) {
			case 1:
//				Tv t = new Tv();
				b.buy(new Tv());
				b.myInfo();
				break;

			case 2:
				b.buy(new Computer());
				b.myInfo();
				break;

			case 3:
				b.buy(new Audio());
				b.myInfo();
				break;

			case 9:
				b.cartInfo();
				break;

			case 0:
				break loop;
			}

		} // while





	}

}
