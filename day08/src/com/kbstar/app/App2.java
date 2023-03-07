package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;

public class App2 {

	public static void main(String[] args) {
		Service<Integer, ItemDTO> service = new ItemService();
		SearchService search = new ItemService();
		// 먼저 Service하고 연결해주고..!!!
		
		// ItemService service = new ItemService();
		// 이렇게 변경해줘야 ItemService에만 지정되어있는 search기능 불러올수 있음...
		// 아니면 interface에 아예 객체를 넣어라.
		// 기존의 interface에 넣게 되면 .. userService까지 영향이 가는게 단점...
		// 차라리 interface를 따로 만들면 되겠네..!
		

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Input Command(q,i,d,u,s)");
			String cmd = sc.next();

			if (cmd.equals("q")) {
				System.out.println("Bye...");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());

				System.out.println("Input NAME...");
				String name = sc.next();

				System.out.println("Input PRICE...");
				double price = Double.parseDouble(sc.next());

				System.out.println("Input QUANTITY...");
				int qt = Integer.parseInt(sc.next());

				ItemDTO item = new ItemDTO(id, name, price, qt);
				service.register(item);

			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				try {
					int id = Integer.parseInt(sc.next());
					service.remove(id);
				} catch (Exception e) {
					System.out.println("잘못 입력 하셨습니다.");
				}
				// exception 처음으로 사용해봤네. try, catch! 이젠, 3만약 id 값에 int 가 아니라 영문이 들어온다면 잘못입력했다는
				// 오류가 뜬다.
			} else if (cmd.equals("u")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());

				System.out.println("Input NAME...");
				String name = sc.next();

				System.out.println("Input PRICE...");
				double price = Double.parseDouble(sc.next());

				System.out.println("Input QUANTITY...");
				int qt = Integer.parseInt(sc.next());

				ItemDTO item = new ItemDTO(id, name, price, qt);
				service.modify(item);

			} else if (cmd.equals("s")) {
				search.search();

			}

		}
		sc.close();
	}
}
