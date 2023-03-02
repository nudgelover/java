package com.kbstar.hrd;

public class Manager {

	private String id;
	private String name;
	private int salary;
	private int bonous;

	// -----------------------------------
	public Manager() {
	}

	public Manager(String id, String name, int salary, int bonous) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bonous = bonous;
	}
	// --------------------------------------

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

	public int getBonous() {
		return bonous;
	}
//----------------------------------------------
	
	public double getTax() {
		double result = 0.0;
		result = (this.salary+this.bonous)*0.17;
		return result;
	}
	
	public int getAnnSalary() {
		int result = 0;
		result = (this.salary+this.bonous)*12;
		return result;
	}
	
	public double getAnnTax() {
		double result = 0.0;
		result = getAnnSalary()*0.17;
		return result;
	}
//--------------------------------------------------

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + ", bonous=" + bonous + "]";
	}
	
	
}
