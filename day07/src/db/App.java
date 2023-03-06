package db;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		DAO dao = new MariaDBDAO(); // 인터페이스도 추상화와 마찬가지로 객체생성불가

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Input Command(q,i,d,u)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye...");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				
				UserDTO user = new UserDTO(id, pwd, name);
				dao.insert(user);
			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				String id = sc.next();
				dao.delete(id);
				//보통 id를 primary key로 사용. id 삭제할 시 해당 값 없애자는 코드
			} else if (cmd.equals("u")) {
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				
				UserDTO user = new UserDTO(id, pwd, name);
				dao.update(user); 

			}

		}
		sc.close();
	}

}
