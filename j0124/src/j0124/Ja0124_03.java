package j0124;

public class Ja0124_03 {

	public static void main(String[] args) {

		// 멀티 쓰레드
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();

		th1.start();
		th2.start();



		// process & thread
		// 프로세스 : 실행중인 프로그램(메모리
		// 쓰레드 : 프로세스 내에서 실행되는 작업의 단위

		// 싱글 쓰레드
//		for(int i=0; i<300; i++) {
//			System.out.println("i : "+i);
//		}
//		for(int j=0; j<300; j++) {
//			System.out.println("j : "+j);
//		}


	}

}
