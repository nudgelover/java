package com.kbstar.service;


import java.util.List;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class UserService implements CRUDService<String, UserDTO> {
	DAO<String, UserDTO> userDao;
	Notification notification;

	public UserService() {
		userDao = new UserDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		// 비밀번호 암호화...
		// userDao.insert(v);
		// 원래는 이렇게 오류나면 바로 던지는데..try catch로 잡은 이유..여기서나는 오류는 db오류니 이걸 보여줄 필요가 없다...
		// 던지지 않고 여기서 회원가입을 실패했다는 오류를 던져주자...
		// db저장 및 이멜 sms
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("회원가입을 실패 하였습니다.(EX0004)");
		}
		notification.sendEmail(v.getEmail(), Msg.registerMsg1);
		notification.sendSMS(v.getContact(), Msg.registerMsg2);

	}

	@Override
	public void remove(String k) throws Exception {

		UserDTO user = null;
		user = userDao.select(k);
		// 먼저 아이디는 가져오고
		try {userDao.delete(k);// 삭제하고
		// 가져온 정보로 메일,sms 보내고
		}catch(Exception e) {
			throw new Exception("탈퇴 오류 입니다.");
		}
		notification.sendEmail(user.getEmail(), Msg.removeMsg1);
		notification.sendSMS(user.getContact(), Msg.removeMsg2);

	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			userDao.update(v);
		} catch (Exception e) {
			throw new Exception("수정오류입니다.");
		}

	}

	@Override
	public UserDTO get(String k) throws Exception {
		UserDTO obj = null;
		obj = userDao.select(k);
		return obj;
	}

	@Override
	public List<UserDTO> get() throws Exception {

		List<UserDTO> list = null;
		try {
			list = userDao.select();
		} catch (Exception e) {
			throw new Exception("조회오류");
		}
		return list;
		// 일부러 try catch 만들어줌 db오류 던지는거 막으려고..
	}

}
