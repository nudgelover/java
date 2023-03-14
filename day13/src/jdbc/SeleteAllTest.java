package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeleteAllTest {

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
		String selectAllSql = "SELECT * FROM cust";
		System.out.println("접속성공!!!");

		// SQL 전송
		// p224 참고해서 finally 간단하게 바꾸기------------------------------------------------
		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(selectAllSql);) {
			// select는 여기가 틀리다!
			// 아무것도 없을 때 불러오기하면 오류가 안나고 그냥 아무것도 안불러온다.. select랑 차이가 있네..!
			try (ResultSet rset = pstmt.executeQuery()) {
				while(rset.next()) {
					String db_id = rset.getString("id");
					String db_pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					System.out.println(db_id+" "+db_pwd+" "+name+" "+age);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
}