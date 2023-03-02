package board;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();

		while (true) {
			System.out.println("Input cmd(r,u,d,g,q)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("BYE..");
				break;
				
			} else if (cmd.equals("r")) {
				System.out.println("Input contents");
				String content = sc.next();
				service.register(content);

			} else if (cmd.equals("u")) {
				System.out.println("Input number & contents...");
				int num = sc.nextInt();
				String content = sc.next();
				service.modify(num, content);
				
				
			} else if (cmd.equals("d")) {
				System.out.println("Input number");
				int num = sc.nextInt();
				service.remove(num);
				
				
			} else if (cmd.equals("g")) {
				System.out.println("Input number");
				int num = sc.nextInt();
				String result = service.get(num);
				System.out.println(result);

			}

		}
		sc.close();

	}

}
