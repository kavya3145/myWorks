package com.kaav.dao;

import com.kaav.pojo.Login;
import com.kaav.pojo.UserAccount;

public interface UserDao {
  void register(UserAccount user);
  UserAccount validateUser(Login login);
}