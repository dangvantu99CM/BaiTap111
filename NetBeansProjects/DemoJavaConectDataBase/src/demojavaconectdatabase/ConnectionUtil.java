
package demojavaconectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private static Connection con = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (con == null) {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sinhvien01";
			String user = "SinhVien";
			String password = "12345678";
			con = DriverManager.getConnection(url, user, password);
		}
		return con;
	}
}
