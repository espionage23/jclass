package j0122;

public class Ja0122_01 {

	public static void main(String[] args) {

		Time t1 = new Time(12,05,10);
		System.out.println(t1.getHour());
		t1.setHour(t1.getHour()+1);
		System.out.println(t1.getHour());


		// 17시 35분 30초
		Time t2 = new Time(17,35,30);
		System.out.printf("%s시 %s분 %s초",t2.getHour(),t2.getMinute(),t2.getSecond());

		// private - 같은 클래스
		// default - 같은 클래스, 같은 패키지
		// protected -  같읕 클래스, 같은 패키지, 자손 클래스
		// public - 전체
//		Car c = new Car();
//		System.out.println(c.getColor());
//		Car c2 = new Car("white", "auto", 5);
//		System.out.println(c2.getColor());
////		c2.door = -50;
////		System.out.println(c2.door);
//		c2.setDoor(-50);
//		System.out.println(c2.getDoor());

//		Shape s = new Shape();



	}

}
