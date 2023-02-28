package oop2;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.toString());

		Employee e2 = new Employee("이말숙",5000000);
		//e2.salary = 9000000; private int salary; 이기에 바꿀 수 없음. 
		System.out.println(e2.toString());
		System.out.println(e2.getAnnSalary());
		System.out.println(e2.getTax());
		
		e2.setName("이미숙");
		System.out.println(e2.toString());
		
		Employee e3 = new Employee("L3","이말년",3000000);
		System.out.println(e3.toString());
		System.out.println(e3.getAnnSalary());
		System.out.println(e3.getTax());

	}

}
