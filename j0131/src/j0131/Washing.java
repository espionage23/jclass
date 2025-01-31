package j0131;

public class Washing extends Product {
	private String volume;
	private String type;
	private String color;

	// 기본 생성자
	Washing(){
		this("LG세탁기",700000,70000,"15Kg","드럼세탁기","Gray");
	}

	public Washing(String name, int price, int point,String volume, String type, String color) {
		super();
		setName(name);
		setPrice(price);
		setPoint(point);
		this.volume = volume;
		this.type = type;
		this.color = color;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}





}
