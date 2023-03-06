package shape;

public abstract class Shape {
	// abstract ! 추상클래스! 클래스 만들 때 선택하면 됨
	protected int x;
	protected int y;

	public Shape() {
	}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Abstract Method
	// public double getArea(); 함수({}) 안붙힐 때는 이렇게 선언안됨..! abstract 붙여서!
	public abstract double getArea();

	public abstract double getCircumn();

	public String getXY() {
		return x + " , " + y;
	}

}
