package org.kaav.services;

import com.kaav.pojo.Login;
import com.kaav.pojo.UserAccount;

public interface UserService {

	
	public UserAccount validateUser(Login login);

}
