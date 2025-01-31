package j0131;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop_Deck {
	Scanner scan = new Scanner(System.in);
	// user 아이디
	Buyer user1;

	ArrayList<Product> list = new ArrayList<Product>();	// 상품구매리스트


	// 화면 출력메소드
	int mainPrint() {
		System.out.println("    [ 쇼핑몰 프로그램 ]");
		System.out.println("-----------------------------");
		System.out.println("1. 50인치 LED TV");
		System.out.println("2. 75인치 LED TV");
		System.out.println("3. 노트북");
		System.out.println("4. 냉장고");
		System.out.println("5. 세탁기");
		System.out.println("6. 배송지 및 상품색상");
		System.out.println("7. 구매한 리스트 보기");
		System.out.println("8. 현금 충전");
		System.out.println("9. 상품등록 - 관리자");
		System.out.println("0. 프로그램 종료");
		System.out.println("-----------------------------");
		System.out.print("원하는 번호 >>");
		int choice = scan.nextInt();
		return choice;
	}


	// 구매메소드
	void buy(Product p) {
		p.getPrice();		// 제품금액
		p.getPoint();		// 제품포인트
		user1.setMoney(user1.getMoney()-p.getPrice());	// user의 보유금액 - 제품금액
		user1.setMyPoint(user1.getMyPoint()+p.getPoint()); // 포인트 추가
		list.add(p);
		System.out.println();
		System.out.println("[ 구매상품 목록 ]");
		System.out.println("상품 : "+p.getName());
		System.out.printf("상품금액 : %,d원\n", p.getPrice());
		System.out.printf("현재잔액 : %,d원\n", user1.getMoney());
		System.out.println("------------------------------");
		System.out.println("상품을 구매하였습니다.");
		System.out.println();
	}


	// 로그인 메소드
	void login() {
		while(true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("로그인을 하셔야 프로그램 이용 가능");
			System.out.println("< 로그인 >");
			System.out.print("ID : ");
			String id = scan.next();
			System.out.print("PW : ");
			String pw = scan.next();
			if(id.equals("admin") && pw.equals("1111")) {
				// db 접근
				user1 = new Buyer("admin","1111","관리자","서울",100000000,10000000);
				System.out.printf("		[ %s 회원정보 ] \n ",user1.getUserName());
				System.out.println("----------------------------------------------");
				System.out.println(id+"님 로그인 되었습니다.");
				System.out.printf("현재 보유잔액 : %,d원 \n",user1.getMoney());

				break;
			}else {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
			}
		}// while
	}

	// 상품 구매리스트
	public void proList() {
		int sum = 0;
		System.out.println();
		System.out.println("      [ 상품 구매리스트 ]");
		System.out.println("------------------------------");
		if(list.isEmpty()) {
			System.out.println("구매한 리스트가 없습니다.");
		}else {
			System.out.printf("상품리스트 개수 : %d \n",list.size());
			for(int i=0; i<list.size(); i++) {
				System.out.printf("%s, ",list.get(i).getName());
				sum += list.get(i).getPrice();
			}
			System.out.println();
		}
		System.out.printf("총 구매 금액 : %,d원 \n",sum);
		System.out.println();

	}


	public void charge() {
		System.out.println("      [ 현금 충전 ]");
		System.out.printf("현재 잔액 : %,d원\n", user1.getMoney());
		System.out.println("충전할 금액 >> ");
		int m = scan.nextInt();
		user1.setMoney(user1.getMoney()+m);
		System.out.printf("충전 금액 : %,d원\n",m);
		System.out.printf("충전 후 잔액 : %,d원\n",user1.getMoney());
		System.out.println("충전이 완료되었습니다.");
		System.out.println();

	}

}
