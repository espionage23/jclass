package j0122;

public class Ja0122_03 {

	public static void main(String[] args) {
		// 다형성이란?
		// 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것이 다형성이다.

		// 자손 -> 조상 업스케일 : 형변환 생략가능
		// 자손 <- 조상 다운스케일 : 형변환 생략불가

		// CaptionTv - text, caption()
		// Tv - power,channel, power(),channelUp(),channelDown()
		CaptionTv c = new CaptionTv();
		c.text = "[ 뮤직비디오 ]로제-APT";
		c.caption();
		System.out.println("자막 : "+c.text);

		Tv t2 = new Tv();  // Tv()
//		t2.text = "자막 기능이 없음."
		Tv t = new CaptionTv();
		CaptionTv c3;
		c3 = (CaptionTv)t;
		c3.text = "aaa";
		t = c3;
		System.out.println(c3.text);

		// 에러
//		c3 = (CaptionTv)t2;
//		c3.text = "bbb";

//		t.text = "" / 에러
//		CaptionTv c2 = new Tv(); // 자손의 참조 변수 = 부모 객체 안됨



	}

}
