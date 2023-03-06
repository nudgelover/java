package shape;

public class Rectangle extends Shape {

	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// 넓이
		return width*height;
	}

	@Override
	public double getCircumn() {
		// 둘레
		return (width+height)*2 ;
	}
// 이 자동으로 세팅된 Override 지우면 위에 오류뜸. 오류난거 누르고 클릭하면 다시 생성된다.

}
