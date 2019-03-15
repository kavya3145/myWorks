







































































  package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class UserDAO {
	
		
		public int insert(UserAccount ua) throws SQLException {
			String query="insert into users values(?,?,?)";
			Connection conn =ConnectionFactory.getConnection();
			PreparedStatement pStatement= conn.prepareStatement(query);
			
			pStatement.setString(1, ua.getUserName());
			pStatement.setString(2, ua.getEmail());
			pStatement.setString(3, ua.getPassword());
			int output=pStatement.executeUpdate();
			return output;
			
		}
		
	
	  public boolean read(String username,String password) throws SQLException {
	   
		  Connection con=ConnectionFactory.getConnection();
		  Statement s=con.createStatement();
		  String sql="Select username,password from users";
		  ResultSet rs=s.executeQuery(sql);
		  while(rs.next())
		  {
			  String dname=rs.getString("username");
			  String dpwd=rs.getString("password");
			  if(username.equals(dname)&&password.equals(dpwd))
			  {
				  return true;
			  }
		  }
		return false;
       
		
		
	}
	  
	  public String fetchName(String email) throws SQLException {
			String query="select USERNAME from users where EMAIL=?";
			Connection conn =ConnectionFactory.getConnection();
			PreparedStatement pStatement= conn.prepareStatement(query);
			String name=null;
			pStatement.setString(1, email);
			ResultSet rs=pStatement.executeQuery(query);
			  while(rs.next())
			  {
				  
				name=rs.getString(1);	 
				  
			  }
			return name;
			
		}
}
