package shape;

public class App {

	public static void main(String[] args) {
		//Shape s = new Shape(10,10;)
				//Shape으로는 클래스를 생성할 수 없다는 오류가 뜸! 빨간줄 나온다!
		Shape s1 = new Triangle(10,20,100,80);
		System.out.println(s1.getXY());
		System.out.println(s1.getArea());
		System.out.println(s1.getCircumn());
		
		
		
	}

}
