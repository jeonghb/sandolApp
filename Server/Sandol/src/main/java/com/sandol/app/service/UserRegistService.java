package com.sandol.app.service;

import com.sandol.app.vo.UserRegistVO;

public interface UserRegistService {
	
	public String getUserCheck(UserRegistVO userRegistVO);
	
	public String getUserInfo(String id);
	
	public boolean setUserRegist(UserRegistVO userRegistVO);
	
	public UserRegistVO LogIn(UserRegistVO userRegistVO);
}
