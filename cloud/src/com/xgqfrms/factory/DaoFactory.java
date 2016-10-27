package com.xgqfrms.factory;

import com.xgqfrms.dao.IuserDao;
import com.xgqfrms.dao.proxy.UserDaoProxy;


public class DaoFactory { 
	public static IuserDao getIuserDaoInstance(){
		return new UserDaoProxy();
		
	}

}
