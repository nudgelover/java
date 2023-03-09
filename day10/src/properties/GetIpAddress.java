package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetIpAddress {
	public static String getIpAddress() {
		//이거 static으로 바꿔주고..
		String ipAddr = "";
		Properties props = new Properties();
		String fileName = "file.txt";
		// file.txt에 연결해서 정보 찾자!

		try (FileInputStream in = new FileInputStream(fileName)) {
			props.load(in);
		} catch (IOException e) {
			System.out.println("문제 발생 !!!");
		}

		ipAddr = props.getProperty("IP_ADDR");
		return ipAddr;

	}
}
