package inherit2;

public class Manager extends Employee {
	//extends~  상속 ctrl 누르고 Employee 누르면 해당 페이지로 넘어갈 수 있음.
	private double bonus;

	//Constructor는 상속이 안되기에.. 만들어주자
	public Manager() {
		super();
	}


	public Manager(String id, String name, double salary) {
		super(id, name, salary);
	}
	

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	
	
	//함수의 재정의 (overriding) - 함수를 그대로 쓸 수 도 있지만, 필요하다면 상위에 있는 함수를 재정의 할 수 도 있다.
	//해당 상황에서는 bonus 값 때문에 재정의 
	

	@Override
	public double getAnnSalary() {
		double result = 0.0;
		//result = (this.salary +this.bonus)*12;  salary 접근 안됨. 현재 private이라서 protected로 바꿔줘거나...!
		//result = (this.getSalary() +this.bonus)*12;  getter 줘서 이렇게 바꿔주자
		result = super.getAnnSalary()+(this.bonus*12); // 근데 이게 가장 합리적이겠지?
		return result;
	
	}

	@Override
	public String toString() {
	return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}





	

}
