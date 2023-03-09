package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		// file.txt에 연결해서 정보 찾자!

		try (FileInputStream in = new FileInputStream(fileName)) {
			props.load(in);
		} catch (IOException e) {
			System.out.println("문제 발생 !!!");
			return;
			// 문제 발생 시 밑에 함수 실행시키지 말아라.
		}

		String ip = props.getProperty("IP_ADDR");
		int port = Integer.parseInt(props.getProperty("PORT"));
		System.out.printf("%s 서버로 %d 포트로 접속...", ip,port);
		

	}

}
