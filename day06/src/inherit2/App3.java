package inherit2;

public class App3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Manager();
		Employee e3 = new Sales();
		
		Object obj = new Employee();
		//자바에서 모든 클래스는 extends Object가 생략되어있음.  자바의 특징이라 보면 된다.
		Object obj2 = new Manager();
		Object obj3 = new TaxCal();
		
		
		
	}

}
