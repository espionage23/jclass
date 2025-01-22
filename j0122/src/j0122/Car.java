package j0122;

public class Car extends Object {

	Car(){}

	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	// 같은 클래스 내에서만 사용 가능
	String color;
	String gearType;
	int door;

	void setDoor(int door) {
		if(door>0 && door <10) {
			this.door = door;
		}
	}

	int getDoor(){
		return door;
	}


	String getColor() {
		return color;
	}

	void drive() {
		System.out.println("자동차가 출발합니다.");
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
