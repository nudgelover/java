package statics;

public class Car {
	private String name;
	private String maker; // 제조사
	public static String makerName = "HD";// 이 static은 객체를 생성할 때 관여하지 않음
	//static은 클래스가 소유하고 있는 별도의 변수
	//name하고 maker는 속성...!

	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

	public Car(String name, String maker) {
		this.name = name;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", maker=" + maker + "]";
	}

}
