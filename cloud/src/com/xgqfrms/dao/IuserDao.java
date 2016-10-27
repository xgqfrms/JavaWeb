package com.xgqfrms.dao;
import com.xgqfrms.vo.User;

public interface IuserDao {

	public boolean findLogin(User user) throws Exception;

}
