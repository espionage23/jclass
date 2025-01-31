package j0131;

public class Refrigerator extends Product {
	private String volume;
	private int door;
	private String color;

	// 기본 생성자
	Refrigerator(){
		this("LG냉장고",1200000,120000,"900L",4,"White");
	}

	public Refrigerator(String name, int price, int point, String volume, int door, String color) {
		super();
		setName(name);
		setPrice(price);
		setPoint(point);
		this.volume = volume;
		this.door = door;
		this.color = color;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



}
