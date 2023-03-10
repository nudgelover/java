package statics;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car("K3", "KIA");
		System.out.println(c1);
		
		Car c2 = new Car("G90", Car.makerName);
		//static은 이런식으로 사용된다.
		//어떠한 클래스에서도 이렇게 . 찍어서 사용할 수 있다!
		//같은 프로젝트안해서는 패키지가 달라도 다 쓸 수 있다.
		//실제로 많이 쓰지는 않는다. 
		//우리 전에 MakeAccountNumber, MakeMessage 만들 때 사용했었다.
		System.out.println(c2);

	}

}
