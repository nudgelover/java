package com.kbstar.service;

import java.util.List;
import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

public class BankServiceImpl
		implements com.kbstar.frame.BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String, UserDTO> userDao;
	DAO<String, AccountDTO> accountDao;
	DAO<String, TransactionDTO> transactionDao;
	Notification notification;

	public BankServiceImpl() {
		userDao = new UserDAO();
		accountDao = new AccountDAO();
		transactionDao = new TransactionDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("등록오류");
		}
		notification.sendEmail(v.getEmail(), "축하합니다.");
		notification.sendSMS(v.getContact(), "축하합니다.");

	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		// user.select 자체에 id 있는지 없는지 검증하는거 있음
		if (user != null) {
			if (user.getPwd().equals(p)) {
				System.out.println("로그인 OK");
			} else {
				throw new Exception("PWD가 일치하지 않습니다.");
			}
		} else {
			throw new Exception("로그인실패");
		}

		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo = MakeAccountNumber.makeAccNum();
		AccountDTO account = new AccountDTO(accNo, balance, k);
		// 자 이제 만들어진 account를 accountdao에 넣자!!

		accountDao.insert(account);

		UserDTO user = userDao.select(k);
		notification.sendEmail(user.getEmail(), accNo + "계좌가 생성 되었습니다.");
		notification.sendSMS(user.getContact(), accNo + "계좌가 생성 되었습니다.");

	}

	@Override
	public List<AccountDTO> getAllAcount(String k) throws Exception {

		return accountDao.search(k);
	}

	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		// TODO Auto-generated method stub
		return transactionDao.search(acc);
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		System.out.println("금결원 전송...");
		// 내 잔액 조회.
		AccountDTO acc = null;
		acc = accountDao.select(sendAcc);
		if (balance > acc.getBalance()) {
			throw new Exception("잔액부족");
		}
		double newbalance = acc.getBalance() - balance;
		// 수정된 정보 다시 account에 넣어주기
		acc.setBalance(newbalance);
		accountDao.update(acc);

		// 거래 내역 추가
		TransactionDTO tr = new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "O", desc);
		transactionDao.insert(tr);
		System.out.println(tr);
		// sms, email 전송

		String uid = acc.getHolder();
		UserDTO u = userDao.select(uid);
		notification.sendEmail(u.getEmail(),
				sendAcc + "에서 " + balance + "원 이체 완료되었습니다. 잔액은 " + acc.getBalance() + "원입니다.");
		notification.sendSMS(u.getContact(),
				sendAcc + "에서 " + balance + "원 이체 완료되었습니다. 잔액은 " + acc.getBalance() + "원입니다.");
	}

}
