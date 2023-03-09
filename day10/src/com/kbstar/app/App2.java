package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;

import bank.MakeMessage;

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

				ItemDTO item = null;
				try {
					item = new ItemDTO(id, name, price, qt);
				} catch (Exception e1) {
					System.out.println(MakeMessage.makeMessage(e1.getMessage()));
				}
				try {
					service.register(item);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
			
				}

			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				try {
					int id = Integer.parseInt(sc.next());
					service.remove(id);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}
			} else if (cmd.equals("u")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());

				System.out.println("Input NAME...");
				String name = sc.next();

				System.out.println("Input PRICE...");
				double price = Double.parseDouble(sc.next());

				System.out.println("Input QUANTITY...");
				int qt = Integer.parseInt(sc.next());

				ItemDTO item = null;
				
				try {
					item = new ItemDTO(id, name, price, qt);
				} catch (Exception e1) {
					System.out.println(MakeMessage.makeMessage(e1.getMessage()));
				}
				try {
					service.modify(item);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}

			} else if (cmd.equals("s")) {
				search.search();

			}

		}
		sc.close();
	}
}
