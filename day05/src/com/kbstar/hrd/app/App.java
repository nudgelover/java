package com.kbstar.hrd.app;

import com.kbstar.hrd.Employee;
import com.kbstar.hrd.Manager;

public class App {

	public static void main(String[] args) {
//		Employee e = new Employee("100", "이말숙", 500); // 오버로드함수
//		System.out.println(e); // to.string 함수 호출안해도 자동으로 호출된다! java의 기능!
//		System.out.println(e.getSalary());
//		System.out.println(e.getTax());
//		System.out.println(e.getAnnSalary());
//		System.out.println(e.getAnnTax());

		Employee emps[] = new Employee[3];
		emps[0] = new Employee("201", "홍말자", 400);
		emps[1] = new Employee("202", "정말자", 450);
		emps[2] = new Employee("203", "장말자", 480);
		
		for(Employee em:emps) {
			System.out.println(em);	
			System.out.println(em.getSalary());
			System.out.println(em.getTax());
			System.out.println(em.getAnnSalary());
			System.out.println(em.getAnnTax());
		}
		
		Manager mngs[] = new Manager[3];
		mngs[0] = new Manager("301","정수아",500,50);
		mngs[1] = new Manager("302","이수아",510,55);
		mngs[2] = new Manager("303","고수아",520,65);

		for(Manager mg:mngs) {
			System.out.println(mg);	
			System.out.println(mg.getSalary());
			System.out.println(mg.getTax());
			System.out.println(mg.getAnnSalary());
			System.out.println(mg.getAnnTax());
			
		}
	}

}
