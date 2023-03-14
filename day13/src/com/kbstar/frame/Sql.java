package com.kbstar.frame;

public class Sql {
	//Cust DML
	public static String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
	public static String updateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";
	public static String deleteSql = "DELETE FROM cust WHERE id = ?";
	public static String selectSql = "SELECT * FROM cust WHERE id = ?";
	public static String selectAllSql = "SELECT * FROM cust";

	//Item DML
	public static String iteminsertSql = "INSERT INTO item VALUES(?,?,?,?,SYSDATE)";
	public static String itemupdateSql = "UPDATE item SET name=?, price=?, rate=? WHERE id=?";
	public static String itemdeleteSql = "DELETE FROM item WHERE id = ?";
	public static String itemselectSql = "SELECT * FROM item WHERE id = ?";
	public static String itemselectAllSql = "SELECT * FROM item";

}
