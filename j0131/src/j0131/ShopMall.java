package j0131;

import java.util.Scanner;

public class ShopMall {

	public static void main(String[] args) {

		// 상품관리 - Product - Tv, Computer, Refrigerator, Washing
		// 유저관리 - Buyer
		// 메소드관리 - Shop_Deck
		// 메인 - ShopMall


		Scanner scan = new Scanner(System.in);
		Shop_Deck sd = new Shop_Deck();
		int choice = 0;

		// 로그인 메소드 호출
		sd.login();

		loop:while(true) {
			// 화면출력
			choice = sd.mainPrint();

			switch(choice) {
			case 1:
				sd.buy(new Tv());
				break;

			case 2:
				sd.buy(new Tv("LG75TV",1500000,150000,75,"LED","Black"));
				break;

			case 3:
				sd.buy(new Computer());
				break;

			case 4:
				sd.buy(new Refrigerator());
				break;

			case 5:
				sd.buy(new Washing());
				break;

			case 6:
				break;

			case 7:
				sd.proList();
				break;

			case 8:
				sd.charge();
				break;

			case 9:
				break;

			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}//switch
		}//while



	}

}
