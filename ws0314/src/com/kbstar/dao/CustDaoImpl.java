package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		//System.out.println("Driver Loading 성공.");
	}
	
	@Override
	public void insert(Cust v) throws Exception {
		// cust가 들어오면 db에 넣는다.
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			throw e;

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
		} catch (SQLException e) {
			throw e;

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
				// 삭제된게 없을 때 exception이 안떠서.. 직접 만들어 주었다.
				throw new Exception("ID 없음");
			}

		} catch (SQLException e) {
			throw e;
		}
	}

	@Override
	public Cust select(String k) throws Exception {
		// 리턴할 때 객체로 리턴해야하니..! 객체부터 만드는 거 잊지말자!
		Cust cust = null;

		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String id = rset.getString("id");
				String pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(id, pwd, name, age);
			} catch (SQLException e) {
				throw e;
				// "ID 없음";
				//여기서 던지면 CustCRUDServiceImpl로 가니 거기서 고객에게 보여줄 문구를 적어주자.
			}
		} catch (SQLException e) {
			throw e;
			// "DB 서버 다운";
		}

		return cust;
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					Cust cust = null;
					String id = rset.getString("id");
					String pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					cust = new Cust(id, pwd, name, age);
					list.add(cust);
				}
			} catch (SQLException e) {
				throw e;
				
				
			}
		} catch (SQLException e) {
			throw e;
		}
		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
