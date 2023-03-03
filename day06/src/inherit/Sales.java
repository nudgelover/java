package inherit;

public class Sales extends Employee {
	private String loc;
	private double rate;

	public Sales() {

	}

	public Sales(String id, String name, double salary) {
		super(id, name, salary);
//소스에서 맨밑에 두번째꺼 
	}

	public Sales(String id, String name, double salary, String loc, double rate) {
		super(id, name, salary);
		this.loc = loc;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return super.toString() + "" + loc + "" + rate;
	}

	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (this.getIncentive() * 12);
		return result;

	}

	public double getIncentive() {
		double result = 0.0;
		result = getSalary() * this.rate;
		return result;

	}

}
