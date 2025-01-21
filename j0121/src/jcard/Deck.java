package jcard;


public class Deck {


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
				System.out.printf("[%s,%s]\n",c[i*13+j].shape,n[c[i*13+j].num]);
			}
		}
	}

	void shfl() {
		Card temp = null;
		for(int i=0; i<300; i++) {
			int rannum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rannum];
			c[rannum] = temp;
		}
		System.out.println("------------");
	}

}
