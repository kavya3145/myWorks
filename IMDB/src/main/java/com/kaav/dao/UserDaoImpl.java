package com.kaav.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.kaav.pojo.Login;
import com.kaav.pojo.UserAccount;


public class UserDaoImpl implements UserDao {
  @Autowired
  DataSource datasource;
  @Autowired
  JdbcTemplate jdbcTemplate;
  public void register(UserAccount user) {
    String sql = "insert into users values(?,?,?,?,?,?,?)";
    jdbcTemplate.update(sql, new Object[] { user.getUserName(), user.getPassword(), user.getEmail(),
    });
    }
    public UserAccount validateUser (Login login) {
    String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
    + "'";
    List<UserAccount> users = jdbcTemplate.query(sql, new UserMapper());
    return users.size() > 0 ? users.get(0) : null;
    }
	
  }
  class UserMapper implements RowMapper<UserAccount> {
  public UserAccount mapRow(ResultSet rs, int arg1) throws SQLException {
    UserAccount user = new UserAccount();
    user.setUserName(rs.getString("username"));
    user.setPassword(rs.getString("password"));
    user.setEmail(rs.getString("email"));
    
    return user;
  }
}