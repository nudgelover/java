package inherit2;


public class App2 {

	public static void main(String[] args) {
		// Manager is a Employee
		Employee e = new Manager("100", "james", 500, 50);
		// Manager m = new Employee("100","james2",550); 성립 안됨
		System.out.println(e);

		Employee ea[] = new Employee[5];
		ea[0] = new Employee("100", "james", 500);
		ea[1] = new Employee("101", "james2", 500);
		ea[2] = new Manager("201", "james3", 500, 50);
		ea[3] = new Manager("202", "james4", 500, 50);
		ea[4] = new Sales("104", "james5", 500, "Seoul", 0.35);

		for (Employee em : ea) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
			System.out.println(em.getIncentive());
			if(em instanceof Sales) {
				Sales s = (Sales)em;
				System.out.println(s.getIncentive());
			}
		
			//이게 훨씬 간단하네...!!!
		}
		System.out.println("------------------------------------------------------------");
		TaxCal t = new TaxCal();
		double result = t.gexTax(ea[3]);
		System.out.println(result);
		//public double gexTax(Employee e)  Employee 넣었는데 manager 도 넣을 수 있네!! 와우 ㅋㅋㅋㅋ
	}

}
