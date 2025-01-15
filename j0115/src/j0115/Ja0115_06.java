package j0115;

public class Ja0115_06 {

	public static void main(String[] args) {
		int[] ball = new int[45];


		// 1-45 번호저장
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}

		// 1-45 순차출력
		for(int i=0; i<ball.length; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();

		// 배열 섞기
		int temp = 0;
		for(int i=0; i<300; i++) {
			int ran = (int)(Math.random()*45)+1;	// 0-44
			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
		}

		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();


	}

}
