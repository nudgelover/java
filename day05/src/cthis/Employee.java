package cthis;

import java.util.Calendar;

public class Employee {
	private String id;
	private String name;
	private int salary;


//---------------------------------------------------------------------------------

	public Employee() {
		Calendar cal = Calendar.getInstance();
		this.id = ""+cal.get(Calendar.YEAR)+ cal.get(Calendar.MILLISECOND);// 무조건 default 만들어라!
	}
	
	public Employee(String name, int salary) {
		this();//p151 관련내용 this를 쓸 때는 반드시 맨 위에.
		this.name = name;
		this.salary = salary;
	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
// getter and setter-------조회만 할거는 getter만 하고 수정가능한거는 setter 까지!-----------------------------------------------




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}
	
// --------------------------------------------------------------------
	public double getTax() {
		double result = 0.0;
		result = this.salary * 0.17;
		return result;

	}

	public int getAnnSalary() {
		int result = 0;
		result = this.salary*12;
		return result;
	}
	
	public double getAnnTax() {
		double result = 0.0;
		result = this.getAnnSalary()*0.17;
		return result;
		
	}

//-------------------------------------------------------------------------------------
//객체의 정보를 단순하게 출력만 하기 위해 만든 함수! 다른 기능은 없음...! 현업에서는 실제로는 사용안한다. 테스트용도 함수라고 보면됨.
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
