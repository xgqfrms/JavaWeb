package com.xgqfrms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn {
	public static final String DBDRIVER ="com.mysql.jdbc.Driver";
    public static final String DBURL ="jdbc:mysql://localhost:3306/javaweb";  
    public static final String DBUSER ="xgqfrms";
    public static final String DBPWD ="xgq2015";
	private Connection conn = null;

	public DBconn() throws Exception {
		try {
			Class.forName(DBDRIVER);
			this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		} catch (Exception e) {
			throw e;
		}
	}

	public Connection getConnection() {
		return this.conn;
	}

	public void close() throws Exception {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				throw e;
			}
		}
	}
}