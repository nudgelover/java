package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeleteTest {

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
		String selectSql = "SELECT * FROM cust WHERE id = ?";
		System.out.println("접속성공!!!");

		// SQL 전송
		// p224 참고해서 finally 간단하게 바꾸기------------------------------------------------
		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(selectSql);) {
			pstmt.setString(1, "id01");
			// select는 여기가 틀리다!
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next(); //이게 매우 중요! 데이터 이전!
				//String db_id = rset.getString(01); 이렇게 숫자를 넣어도 되지만...! Column 이름으로 변경해주는게 더 좋겠쮸?
				String db_id = rset.getString("id");
				String db_pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				System.out.println(db_id+""+name+""+age);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
}