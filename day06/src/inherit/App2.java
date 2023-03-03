package inherit;

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
			// 세일즈의 getIncentive()처럼 스페셜라이즈된 함수는 불러올 수 없다
			if (em instanceof Sales) {
				Sales s = (Sales) em;
				System.out.println(s.getIncentive());
				// em instanceof Sales 해석 : 만약 em에서 꺼내온 객체가 sales 이면! 그걸 em 그대로 사용 안하고 세일즈로 바꿔서 사용하겠다!
			}
		}

	}

}
