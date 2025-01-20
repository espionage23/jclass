package j0120;

import java.util.Scanner;

public class Ja0120_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Stuscore[] s = new Stuscore[3];
		for(int i=0; i<3; i++) {
			System.out.println("학생 이름을 입력하세요 >> ");
			String name = scan.next();
			System.out.println("국어 점수 >>");
			int kor = scan.nextInt();
			System.out.println("영어 점수 >>");
			int eng = scan.nextInt();
			System.out.println("수학 점수 >>");
			int math = scan.nextInt();
			s[i] = new Stuscore(name, kor, eng, math);
			s[i].print();
		}

		Stuscore s1 = new Stuscore();
		System.out.println(s1.count);
		
		s1.name = "강감찬";
		s1.kor = 80;
		s1.eng = 80;
		s1.math = 80;
		s1.total = s1.kor + s1.eng + s1.math;
		s1.avg = s1.total/3.0;
		s1.print();




//		Car c1 = new Car("red","auto",5);
//		Car c2 = new Car();
//		c2 = c1;	// 얕은 복사
//		Car c3 = new Car(c1);




		// 객체선언 후 1, 홍길동, 100, 100, 100 넣어서
		// 출력 : 1, 홍길동, 100, 100, 100, 300, 100.0 을 출력

//		Stuscore sc = new Stuscore();
//		sc.no = 1;
//		sc.name = "홍길동";
//		sc.kor = 100;
//		sc.eng = 100;
//		sc.math = 100;
//		sc.total = sc.kor + sc.eng + sc.math;
//		sc.avg = sc.total/3.0;
//
//
//		Stuscore sc2 = new Stuscore(2,"유관순",99,98,97);
//		sc2.print();


//		System.out.printf("출럭 : %d, %s, %d, %d, %d, %d, %.2f \n", sc.no,sc.name,sc.kor,sc.eng,sc.math,sc.total,sc.avg);
//		System.out.printf("출럭 : %d, %s, %d, %d, %d, %d, %.2f \n", sc2.no,sc2.name,sc2.kor,sc2.eng,sc2.math,sc2.total,sc2.avg);



//		Car c = new Car();
//		c.color = "White";
//		c.gearType = "auto";
//		c.door = 4;

	}

}
