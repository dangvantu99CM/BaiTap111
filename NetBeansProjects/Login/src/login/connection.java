package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	private static Connection con = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (con == null) {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/guixevaoday0001";
			String user = "SinhVien";
			String password = "12345678";
			con = DriverManager.getConnection(url, user, password);
		}
		return con;
	}
}
