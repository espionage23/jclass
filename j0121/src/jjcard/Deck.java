package jjcard;

class Deck {
	final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM];

	void input() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++){
				c[i*13+j] = new Card(i,j+1);
			}
		}
	}// input


	//개수출력-전체52, 5
		void print(int cnt) {
			for(int i=0;i<cnt;i++) {
				System.out.println(c[i]);
			}
		}

	// 해당번호 출력
	void print(Card c) {
		System.out.println(c);
	}


	// 셔플
	void shuffle() {
		Card temp = null;
		for(int i=0; i<300; i++) {
			int randomN = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[randomN];
			c[randomN] = temp;
		}
	}


	// 카드 뽑기
	Card pick(int no) {
		return c[no];
	}

}
