package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App {

	public static void main(String[] args) {
		DAO<String, UserDTO> userDao = new UserDAO();

		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요. 방문해주셔서 감사합니다!");
		while (true) {

			System.out.println(
					"필요하신 업무를 영문 소문자로 입력해주세요!(i : 회원가입, u :정보 수정, s: 정보 조회, sa: 모든 정보 조회, d : 정보 삭제, q : 돌아가기)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("감사합니다. 다음에 또 방문해주세요.");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("회원가입을 도와드리겠습니다.");
				System.out.println("아이디를 입력해주세요.");
				String id = sc.next();
				System.out.println("비밀번호를 입력해주세요.");
				String pwd = sc.next();
				System.out.println("이름을 입력해주세요.");
				String name = sc.next();

				UserDTO user = new UserDTO(id, pwd, name);
				try {
					userDao.insert(user);
					System.out.println(user.getName() + "님 환영합니다. 가입이 완료되셨습니다.");
					System.out.println(user.toString());

				} catch (Exception e) {
					System.out.println("죄송합니다. 해당 ID는 중복된 ID입니다.");

				}
			} else if (cmd.equals("d")) {
				System.out.println("정보삭제를 도와드리겠습니다.");
				System.out.println("삭제하실 아이디를 입력해주세요.");
				String id = sc.next();
				try {
					userDao.delete(id);
					System.out.println("아이디가 정상적으로 삭제되었습니다.");
				} catch (Exception e) {
					System.out.println("죄송합니다. 해당 ID는 존재하지않는 ID입니다.");

				}
			} else if (cmd.equals("u")) {
				System.out.println("정보 변경을 도와드리겠습니다.");
				System.out.println("정보변경을 위해 먼저 ID를 입력해주세요.");
				String id = sc.next();
				System.out.println("앞으로 사용하실 비밀번호를 입력해주세요.");
				String pwd = sc.next();
				System.out.println("앞으로 사용하실 이름을 입력해주세요.");
				String name = sc.next();

				UserDTO user = new UserDTO(id, pwd, name);
				try {
					userDao.update(user);
					System.out.println("정보가 정상적으로 수정되었습니다.");
				} catch (Exception e) {
					System.out.println("죄송합니다. 해당 ID는 존재하지않는 ID입니다.");
				}

			} else if (cmd.equals("s")) {
				System.out.println("정보조회를 도와드리게습니다.");
				System.out.println("정보조회를 원하시는 ID를 입력해주세요.");
				String id = sc.next();

				UserDTO user = null;
				try {
					user = userDao.select(id);
					System.out.println(user);
				} catch (Exception e) {
					System.out.println("죄송합니다. 해당 ID는 존재하지않는 ID입니다.");

				}
			} else if (cmd.equals("sa")) {
				System.out.println("모든 회원정보를 불러오겠습니다.");
				List<UserDTO> list = null;// 여기선 받을준비니까! 생성준비가 아니라!

				list = userDao.select();
				for (UserDTO user : list) {
					System.out.println(user);
				}
			}

		}
		sc.close();
	}
}
