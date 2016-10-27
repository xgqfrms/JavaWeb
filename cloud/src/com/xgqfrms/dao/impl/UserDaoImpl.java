package com.xgqfrms.dao.impl;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.xgqfrms.dao.IuserDao;
import com.xgqfrms.vo.User;

public class UserDaoImpl implements IuserDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;

	public UserDaoImpl(Connection conn) {
		this.conn = conn;
	}

	public boolean findLogin(User user) throws Exception {
		boolean flag = false;
		try {
			String sql = "SELECT name FROM user WHERE userid=? AND password=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, user.getUserid());
			this.pstmt.setString(2, user.getPassword());
			ResultSet rs = this.pstmt.executeQuery();
			
			if (rs.next()) {
				user.setUsername(rs.getString(1)); // 取出一个用户的真实姓名
				flag = true;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			if (this.pstmt != null) {
				try {
					this.pstmt.close();
				} catch (Exception e) {
					throw e;
				}
			}
		}

		return flag;
	}
}
