package com.kbstar.app;

import com.kbstar.dao.AccountOracleDAO;
import com.kbstar.dao.UserOracleDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App {

	public static void main(String[] args) {
		
		DAO dao = new UserOracleDAO();
		UserDTO user = new UserDTO("id01", "pw01", "james");
		dao.insert(user);
		
		DAO dao2 = new AccountOracleDAO();
		AccountDTO account = new AccountDTO("100","자유저축",1000);
		dao2.insert(account);


	}

}
