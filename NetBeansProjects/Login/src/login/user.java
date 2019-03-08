package login;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;



public class user {
	private int id;
	private String username;
	private String password;
	private String role;

		public user(int id, String username, String password, String role) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.role = role;
		}
		public user() {
			
		}
		public boolean check(String user, String pass) throws  ClassNotFoundException, SQLException{
			String sql = "SELECT id, username FROM nhanvien WHERE username = ? AND pass = ?";
			PreparedStatement statement = connection.getConnection().prepareStatement(sql);
			statement.setString(1, user);
			statement.setString(2, pass);

			ResultSet result = statement.executeQuery();
			if(result.next() == true)
			{	id = result.getInt("id");
				statement.close();
				return true;
			} else {
				statement.close();
				return false;
			}
		}

		public boolean isadmin(String user, String pass) throws  ClassNotFoundException, SQLException{
			String sql = "SELECT id, username, pass FROM nhanvien WHERE username = ? AND pass = ? AND role = ?";
			PreparedStatement statement = connection.getConnection().prepareStatement(sql);
			statement.setString(1, user);
			statement.setString(2, pass);
			statement.setString(3, "user");

			ResultSet result = statement.executeQuery();
			

			if(result.next() == true) {
				statement.close();
				return true;
			} else {statement.close();return false;}
		}

	
		public int getId() {
			return id;
		}
	
		public void setId(int id) {
			this.id = id;
		}
	
		public String getUsername() {
			return username;
		}
	
		public void setUsername(String username) {
			this.username = username;
		}
	
		public String getPassword() {
			return password;
		}
	
		public void setPassword(String password) {
			this.password = password;
		}
	
		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

}
