package javaconectdatabase;
import java.sql.SQLException;
public class UserB {
	private UserDA uDA;
	
	public UserB() {
		// TODO Auto-generated constructor stub
		uDA = new UserDA();
	}
	
	public boolean checkLogin(String username, String password) throws ClassNotFoundException, SQLException{
		return uDA.checkUser(username, password);
	}
	
	//...
}
