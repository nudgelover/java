package cal;

public class Cal {
	public static double div(int a, int b) throws Exception{ 
		// static을 넣으면 cal.~~ 이 사용가능!
		double result = 0.0;
		try {
		result = a / b;
		}catch(Exception e){
			throw e;
			//예외는 여기서 처리하는게 아니다!! ui로 던져라! 
		}
		return result;
	}

	public static double div(double a, double b) throws InfinityException {
		double result = 0.0;
		if(b==0.0) {
			//고객에게 Infinity라는 값을 그대로 보여줄 수는 없으니 예외처리를 하자
			//Infinity에 대한 예외는 자바에서 따로 제공해주지 않으니 우리가 만들어야한다
			//InfinityException 라는 class를 만들어서 우리가 만들어주자.
			throw new InfinityException("B00001");
			//예외를 만들어서 던지자
		}
		result = a / b;
		return result;
	}
}
