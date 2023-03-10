package com.kbstar.frame;

public interface Notification {
	//회원가입하면 메일 문자 보내는 기능을 가진 interface!
	//지금은 문자지만 카카오로 바꾸자...! 이쪽에 연결된 것만 바꾸면되니까 이렇게 분리해놓는거..!
	public void sendEmail(String email, String msg) throws Exception;
	public void sendSMS(String contact, String msg) throws Exception;

}
