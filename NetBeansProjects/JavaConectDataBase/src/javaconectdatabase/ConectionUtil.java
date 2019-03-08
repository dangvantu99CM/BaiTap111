package 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionUtil {
	private static Connection con = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (con == null) {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/demologin";
			String user = "demologin";
			String password = "demologin";
			con = DriverManager.getConnection(url, user, password);
		}
		return con;
	}
}
