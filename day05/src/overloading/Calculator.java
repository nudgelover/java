package overloading;

public class Calculator {
	public int sum(int a, int b) {
//		int result = 0;
//		result = a + b;
//		return result;
		return a+b;
	}

	public int sum(int a, double b) {
		return a+(int)b;
	//오버로딩은 argument가 다른가 동일한가만 신경씀!
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	// 함수 이름 다 동일한데 !! argument가 다 틀리게 할 수 있다!이게 바로 오버로딩.

}
