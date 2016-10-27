package com.xgqfrms.dao.proxy;


import com.xgqfrms.dao.IuserDao;
import com.xgqfrms.dao.impl.UserDaoImpl;
import com.xgqfrms.util.DBconn;
import com.xgqfrms.vo.User;

public class UserDaoProxy implements IuserDao {
	private DBconn dbc = null;
	private IuserDao dao = null;

	public UserDaoProxy() {
		try {
			this.dbc = new DBconn();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.dao = new UserDaoImpl(this.dbc.getConnection());
	}

	public boolean findLogin(User user) throws Exception {
		boolean flag = false;
		try {
			flag = this.dao.findLogin(user);
		} catch (Exception e) {
			throw e;
		} finally{
			this.dbc.close();
		}
		return flag;
	}

}
