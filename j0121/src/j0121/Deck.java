package j0121;

public class Deck {
	// 카드에  사용되는 메소드

	// 생성자
	Deck(){
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
	}

	Card[] c = new Card[52];
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
	String[] s = {"Spade", "Clover", "Diamond","Heart"};

	void print_all() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				System.out.printf("[%s,%s]\n",c[i*13+j].shape,n[c[i*13+j].number]);
			}
		}
	}

	void shuffle() {
		Card temp = null;
		int randomN = 0;
		for(int i=0; i<300; i++) {
			randomN = (int)(Math.random()*25);
			temp = c[0];
			c[0] = c[randomN];
			c[randomN] = temp;
		}
	}



}
