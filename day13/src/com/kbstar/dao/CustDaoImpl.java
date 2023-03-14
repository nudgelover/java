package com.kbstar.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {
	public CustDaoImpl() {
		// Drive loading...
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공.");
	}

	// Connection은 공통적인 거니까 함수로 뺴주자!
	public Connection getConnection() throws Exception {

		Connection con = null;

		// Properties 사용해보자! 비밀번호나 url 주소 변경되었을 때 파일만 수정하면 되니까
		// 또, 보안상의 이유 때문에 pwd를 대놓고 적으면 문제가 되니..!
		Properties props = new Properties();
		String fileName = "db_info.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);

		String id = props.getProperty("DB_ID");
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");
		con = DriverManager.getConnection(url, id, pwd);
		return con;
	}

	@Override
	public void insert(Cust v) throws Exception {
		// cust가 들어오면 db에 넣는다.
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate();

		} catch (SQLException e1) {
			throw e1;

		}

	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);

			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("ID 없음");
			}
		} catch (SQLException e1) {
			throw e1;

		}
	}

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());
			int result = pstmt.executeUpdate();
			if (result == 0) {
				//삭제된게 없을 때 exception이 안떠서.. 직접 만들어 주었다.
				throw new Exception("ID 없음");
			}

		} catch (SQLException e1) {
			throw e1;
		}
	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next(); 
				String db_id = rset.getString("id");
				String db_pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(db_id, db_pwd, name, age);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return cust;
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<Cust>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					String db_id = rset.getString("id");
					String db_pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					Cust cust = new Cust(db_id, db_pwd, name, age);
					list.add(cust);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
