package j0121;

public class Ja0121_02 {

	public static void main(String[] args) {
		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		String[] s = {"Spade", "Clover", "Diamond","Heart"};
		Card[] c = new Card[52];

		for(int i=0; i<=4; i++) {
			for(int j=0; j<13; j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}

		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				System.out.printf("[%s,%s]\n",c[i*13+j].shape,n[c[i*13+j].number]);
			}
		}

//		for(int i=0; i<4; i++) {
//			for(int j=0; j<13; j++) {
//				System.out.printf("[ %s, %d ] \n",c[i*13+j].shape,c[i*13+j].number);
//			}
//		}

	}

}
