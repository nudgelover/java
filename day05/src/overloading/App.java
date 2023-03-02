package overloading;

import java.util.Date;

import access.Employee;

public class App {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		System.out.println(c.sum(10, 20));
		System.out.println(c.sum(10, 20, 30));
		System.out.println(c.sum(10, 20, 30, 40));
		
		Date d = new Date();
		java.sql.Date dd = new java.sql.Date(0);
		// 이미 위에 import java.util.Date; 했기에 상단에 java.sql.Date 임포트 불가. 직접 밑에 같이 입력해주어야함.. 
		
		
	}

}
