package access;

public class Employee {
	private String id;
	protected String name;
	int salary; //아무것도 안쓰면 default

//---------------------------------------------------------------------------------

	public Employee() { 
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

	private int getAnnSalary() {
		int result = 0;
		result = this.salary*12;
		return result;
	}
	
	protected double getAnnTax() {
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
