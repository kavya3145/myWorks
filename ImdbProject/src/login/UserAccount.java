package login;

public class UserAccount {

public UserAccount() {
	
	}



private String userName;
private String password;
private String email;

public UserAccount(String userName, String email,String password) {

	this.userName = userName;
	this.email=email;
	this.password = password;
}

@Override
public String toString() {
	return "UserAccount [userName=" + userName + ", password=" + password + ", email=" + email + "]";
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}
