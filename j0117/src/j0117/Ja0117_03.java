package j0117;

public class Ja0117_03 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();

		t1.channel = 7;
		System.out.println(t1.channel);
		t2.channel = 9;
		System.out.println(t2.channel);

		t2 = t1;
		t2.channel = 100;
		t1.channel = 50;
		System.out.println(t1.channel);		// 100 얕은 복사
		System.out.println(t2.channel);		// 50



//		// 메소드 안 지역변수 - 값이 할당되지 않으면 사용할 수 없음.
//		int a;
//		int b = 10;
//		a =b;
//		System.out.println(a);
//
//		Tv t3 = new Tv();
//		System.out.println(t3.color);
//
//
//
//		// 객체생성(객체선언)
//		// 흰색, false, 7	검정,true,10
//		Tv t = new Tv();
//		t.color = "흰색";
//		t.power = false;
//		t.channel = 7;
//		System.out.println(t.color);
//		System.out.println(t.power);
//		System.out.println(t.channel);
//
//		Tv t2 = new Tv();
//		t2.color = "검정";
//		t2.power = true;
//		t2.channel = 10;
//		System.out.println(t2.color);
//		System.out.println(t2.power);
//		System.out.println(t.channel);
//
//		int[] arr = new int[5];
//		System.out.println(arr);
//		System.out.println(t);






	}

}
