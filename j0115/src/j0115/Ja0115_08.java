package j0115;

public class Ja0115_08 {

	public static void main(String[] args) {
		// 1-10까지 랜덤숫자를 입력받아 동일한 번호가 없도록 출력.

		int[] num = new int[10];
		int i = 0;

		loop:while(i<10) {
			int ranNum = (int)(Math.random()*10)+1;
			for(int j=0; j<i; j++) {
				if(num[j] == ranNum) {
					System.out.println("동일한 숫자 : " + ranNum);
					continue loop;
				}
			}
			num[i] = ranNum;
			i++;
		}

		System.out.println("랜덤숫자 :");
		for(int n=0; n<num.length; n++) {
			System.out.print(num[n]+" ");
		}
		System.out.println();

		// 배열을 랜덤섞기 출력하는 방법
		int[] num2 = new int[10];
		// 입력
		for(int j=0; j<10; j++) {
			num2[j] = j+1;
		}

		// 섞기
		int temp = 0;
		for(int j=0; j<300; j++) {
			int ran = (int)(Math.random()*10)+1;
			temp = num2[0];
			num2[0] = num2[ran];
			num2[ran] = temp;
		}

		System.out.println("랜덤숫자2 : ");
		for(int j=0; j<10; j++) {
			System.out.print(num2[j]+" ");
		}
		System.out.println();


	}

}
