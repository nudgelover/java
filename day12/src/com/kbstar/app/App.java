package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class App {

	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> service = new BankServiceImpl();

		Scanner sc = new Scanner(System.in);
		while (true) {
			UserDTO user = null;// 선언을 밖으로 뺴놔야 로그인하고 계좌업무할때도 정보를 계속 사용할 수 있음.
			System.out.println("원하시는 업무를 숫자로 입력해주세요.");
			System.out.println("1.로그인 2.등록 3.나가기");
			String cmd = sc.next();
			if (cmd.equals("1")) {

				System.out.println("로그인화면입니다.");
				System.out.println("아이디를 입력해주세요.");
				String id = sc.next();
				System.out.println("비밀번호를 입력해주세요.");
				String pwd = sc.next();
				user = null;
				try {
					user = service.login(id, pwd);
					System.out.println(user);
					System.out.println(user.getName() + "님 안녕하세요.");
					System.out.println("---------------------------------");
					while (true) {
						System.out.println("원하시는 업무를 숫자로 선택해주세요.");
						System.out.println("1.계좌생성 2.계좌이체 3.보유계좌조회 4.고객정보조회 5.거래내역조회 6.뒤로가기");
						String cmn = sc.next();
						if (cmn.equals("6")) {
							break;
						} else if (cmn.equals("1")) {
							System.out.println("계좌 생성...");
							System.out.println("입금하실 금액을 입력해주세요.");
							double balance = Double.parseDouble(sc.next());
							// balance에 정수말고 다른거 입력되었을때 막기...
							service.makeAccount(user.getId(), balance);
							System.out.println("계좌 생성이 완료되었습니다.");
						} else if (cmn.equals("2")) {
							System.out.println("계좌이체를 도와드리겠습니다.");
							System.out.println("고객님의 출금계좌번호를 입력하세요.");
							String sendAcc = sc.next();
							System.out.println("받는 분의 계좌번호를 입력해주세요");
							String receiveAcc = sc.next();
							System.out.println("보내실 금액을 입력해주세요.");
							double money = Double.parseDouble(sc.next());
							System.out.println("해당거래의 적요를 입력해주세요.");
							String desc = sc.next();
							service.transaction(sendAcc, receiveAcc, money, desc);
							System.out.println("계좌이체가 완료되었습니다.");

						} else if (cmn.equals("3")) {
							System.out.println("보유하신 계좌정보를 불러오겠습니다.");
							List<AccountDTO> list = null;
							list = service.getAllAcount(user.getId());
							for (AccountDTO acc : list) {
								System.out.println(acc);
							}

						} else if (cmn.equals("4")) {
							System.out.println("고객님의 정보조회를 도와드리겠습니다.");
							String rid = user.getId();
							UserDTO ruser = null;
							ruser = service.getUserInfo(rid);
							System.out.println(ruser);

						} else if (cmn.equals("5")) {
							System.out.println("거래내역조회를 원하시는 계좌번호를 입력해주세요.");
							String accNo = sc.next();
							List<TransactionDTO> list = null;
							list = service.getAllTr(accNo);
							for (TransactionDTO tr : list) {
								System.out.println(tr);
							}
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());

				}

			} else if (cmd.equals("2")) {
				System.out.println("등록화면입니다.");
				System.out.println("회원가입을 도와드리겠습니다.");
				System.out.println("사용하실 아이디를 입력해주세요.");
				String id = sc.next();
				System.out.println("사용하실 비밀번호를 입력해주세요.");
				String pwd = sc.next();
				System.out.println("고객님의 성함을 입력해주세요.");
				String name = sc.next();
				System.out.println("이메일을 입력해주세요.");
				String email = sc.next();
				System.out.println("휴대폰번호를 입력해주세요.");
				String contact = sc.next();
				// UserDTO user = new UserDTO(id, pwd, name, email, contact); 선언을 위로 올리자.
				user = new UserDTO(id, pwd, name, email, contact);
				try {
					service.register(user);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					continue;
				}
				System.out.println("안녕하세요. " + user.getName() + "님, KB국민은행의 고객이 되신 것을 환영합니다.");
			} else if (cmd.equals("3")) {
				System.out.println("만남이 있으면 헤어짐이 있는 법이지요.");
				System.out.println("오늘 KB국민은행과 함께하신 시간은 만족스러우셨는지요?");
				System.out.println("문의사항, 개선사항이 필요한 부분이 있으시다면 언제든지 문의 해주십시오.");
				System.out.println("저희는 언제나 열린 소통으로 고객님의 의견을 적극 반영하겠습니다.");
				System.out.println("다음에 꼭 다시 이용해주세요. 감사합니다.:)");
				break;
			}

		}
		sc.close();
	}

}
