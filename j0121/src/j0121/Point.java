package j0121;

public class Point {


	Point(){ this(0,0); } // -> 이 this는 다른 생성자를 뜻함

	Point(int x, int y){
		this.x = x;	// > 이 this는 인스턴스 변수를 가리킴.
		this.y = y;
	}

	int x;	// 인스턴스 변수 - 객체선언 후 참조변수.변수명
	int y;

}
