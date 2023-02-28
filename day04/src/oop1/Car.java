package oop1;

public class Car {
	// 속성
	public String name;
	public String color;
	public int size;

	// 생성자(constructor)
	public Car() { // new Car 호출 시 이게 호출됨
		name = "k1";
		color = "red";
		size = 1000;
		// 앞에 this 생략. 원래 this.name
	}

	public Car(String name, String color, int size) {
		// 이름은 같지만 들어가는 내용이 달라지면서 오버로드. argument 생성.
		this.name = name;
		this.color = color;
		this.size = size;
	}

	// 행위(operation)
	public void go() {
		System.out.printf("%s,%s Go Car...\n", this.name, this.color);
	}

	public void stop() {
		System.out.printf("%s,%s Stop Car...\n", this.name, this.color);
	}
}
