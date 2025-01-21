package j0121;

public class Ja0121_03 {

	public static void main(String[] args) {
		// Card 52장을 생성한후 1-13, 모양 만들어서 출력

		Deck d = new Deck();

		// 전체출력
		d.print_all();

		// 섞기실행
		d.shuffle();

		System.out.println("----------------");
		// 전체출력
		d.print_all();



//		System.out.printf("[%s,%d]\n",d.c[0].shape,d.c[0].number);



//		// 출력
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<13; j++) {
//				c[i*13+j] = new Card(s[i],j+1);
//			}
//		}
//
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<13; j++) {
//				System.out.printf("[%s,%s]\n",c[i*13+j].shape,n[c[i*13+j].number]);
//			}
//		}
//
//		// 카드를 섞어서 0-4번까지 5장을 출력하시오.
//		Card temp = null;
//		int randomN = 0;
//		for(int i=0; i<300; i++) {
//			randomN = (int)(Math.random()*25);
//			temp = c[0];
//			c[0] = c[randomN];
//			c[randomN] = temp;
//		}
//
//		for(int i=0; i<5; i++) {
//			System.out.printf("[%s,%s]\n",c[i].shape,n[c[i].number]);
//		}


	}

}
