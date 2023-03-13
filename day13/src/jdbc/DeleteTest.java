package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return; 
		}
		System.out.println("Driver Loading 성공.");
		
		// Connect
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.21.125:1521:XE";
		String deleteSql = "DELETE FROM cust WHERE id = ?";
		System.out.println("접속성공!!!");

		// SQL 전송
		// p224 참고해서 finally 간단하게 바꾸기------------------------------------------------
		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(deleteSql);) {
			pstmt.setString(1, "id02");
			int result = pstmt.executeUpdate();
			System.out.println(result);
			// 우리가 작성한 쿼리문을 날리겠다..! 1이 나오면 잘된거임..!
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
}