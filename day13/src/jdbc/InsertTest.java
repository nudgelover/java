package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		// Driver Loading------------------------------------------------------
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return; // 이거 안써주면 오류나도 밑에 성공이라는 코드가 뜬다!! 예외처리 잘해주자
		}
		System.out.println("Driver Loading 성공.");
		// Connect---------------------------------------------------------------------------
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.21.125:1521:XE"; // 여기 ip주소는 윈도우 명령프롬프티 입력해서 ipconfig 치면 나옴
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, id, pwd);
		} catch (SQLException e) {
			System.out.println("접속 실패!!!");
			e.printStackTrace();
			return;
		}
		System.out.println("접속성공!!!");

		// Statement 생성 - SQL

		// SQL 전송
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, "id11");
			pstmt.setString(2, "pwd11");
			pstmt.setString(3, "김넛지");
			pstmt.setInt(4, 01);
			int result = pstmt.executeUpdate();
			System.out.println(result);
			// 우리가 작성한 쿼리문을 날리겠다..!

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// Close
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("close 실패!!!");
				e.printStackTrace();
			}
			System.out.println("close 성공!!");
		}
		// 결과받기

	}

}