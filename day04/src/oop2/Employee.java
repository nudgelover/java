package oop2;

//import java.util.Random;

public class Employee {

	private String id;
	private String name;
	private int salary;

//우클릭 source 클릭 - getter setter해서 접근권한 설정
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
//--------------------------------------------------------------------

	public Employee() {
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;
	}

	public Employee(String id, String name, int salary) {
		this.id = id; // 여긴 this 생략 불가능
		this.name = name;
		if (salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
	}

	public Employee(String name, int salary) {
		this("100000", name, salary); // 이렇게 써야 위에 if 절을 쓰지 않아도 자동 반영된다!
//		Random r = new Random();
//		this.id = r.nextInt(100) + 1 + "";
//		this.name = name;
//		this.salary = salary;

	} // 이름과 월급을 넣으면 ID가 생성되는 CONSTRUCTURE

	public int getAnnSalary() {
		return this.salary * 12; // 여긴 this 생략가능
	}

	public double getTax() {
		return this.salary * 0.175;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
