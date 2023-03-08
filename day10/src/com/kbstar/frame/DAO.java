package com.kbstar.frame;

public interface DAO<K, V> {
	// Generic, 어떤 타입이 올지 모르겠을 때 선언하는 방법
	// public static final String ip = "127.0.0.1";
	// 누구나 사용은 할 수 있지만, 변경할 수 없다. 앞에부분 생략가능. 밑과같이 입력가능. 따라서 상수라보면됨 p95.
	String IP = "127.0.0.1";

	public void insert(V v) throws Exception;

	// UserDAO에서 예외 발생시켰더니 여기도 자동으로 생성하라고 뜨네.
	// 대빵 Interface부터 고쳐주자!
	public void delete(K k) throws Exception;

	public void update(V v) throws Exception;
	// public "abstract" void 생략되어 있는 거다.

	default void connect() {
		System.out.println(IP + "에 접속하였습니다");
	};

	default void close() {
		System.out.println(IP + "에 접속을 해제하였습니다");
	};
	// 이 default 함수들을 쓰지는 않지만,, 자원을 잘쓰고 close하는 거 매우 중요하다. 안그러면 시스템 뻑 죽는다..

}
