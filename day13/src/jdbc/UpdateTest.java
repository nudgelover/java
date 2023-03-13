package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

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
		String updateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";
		System.out.println("접속성공!!!");

		// SQL 전송
		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(updateSql);) {
			//물음표 순서대로...!
			pstmt.setString(1, "pw20");
			pstmt.setString(2, "박진영");
			pstmt.setInt(3, 40);
			pstmt.setString(4, "id05");
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
}