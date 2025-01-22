package jbuy;

import java.util.ArrayList;

public class Buyer {

//	int count = 0;
	int total = 0;
	int money = 10000000;	// 보유 헌금
	int bonusPoint = 0;		// 보유 포인트
//	Product[] cart = new Product[10];	// 배열선언
	ArrayList list = new ArrayList();



	// 생성자
	Buyer(){}
	Buyer(int money, int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}

	// 나의 정보 메소드
	void myInfo() {
		System.out.printf("[ 보유 금액 :%,d ]\n",money);
		System.out.printf("[ 보유 포인트 :%,d ]\n",bonusPoint);

	}

	// 구매 메소드
	void buy(Product p) {
		list.add(p);

		money -= p.price;
		bonusPoint += p.bonusPoint;
		total += p.price;
	}

	void cartInfo() {
		System.out.print("구매목록 : ");
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%s ",((Product)list.get(i)).name);
		}
		System.out.println();
		System.out.printf("구매개수 : %d개 \n",list.size());
		System.out.printf("총구매 금액 : %,d원 \n",total);
	}


//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	void buy(Audio aa) {
//		money -= aa.price;
//		bonusPoint += aa.bonusPoint;
//	}


}
