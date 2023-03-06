package inherit2;

public class TaxCal {
	
	public double gexTax(Employee e) {
		double result = 0.0;
		result = e.getAnnSalary()*0.17;
		return result;
		
		//	public double gexTax(Employee e)  이렇게 Employee를 넣으면 하위클래스에도 다 ~ 적용된다. 즉 매니저도 tax 계산할 수 있다.
	}

}
