package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db {
	static public Connection con = null;
	static public Statement st = null;
	static public ResultSet result = null;
	
	static public void dbInit() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat","root","root");
			st = con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static public void dbUpdate(String q) {
		Cw.wn("전송할sql:"+q);
		try {
			int resultCount = st.executeUpdate(q);
			Cw.wn("처리된 행 수:"+resultCount);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
