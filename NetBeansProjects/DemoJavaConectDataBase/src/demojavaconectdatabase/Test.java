package demojavaconectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author lenovo i3
 */
public class Test {

    public static void main(String[] args) {
        try {
            System.out.println("1. Register JDBC Driver...");
        Class.forName("com.mysql.jdbc.Driver");

        // Tao connection
        String db_url = "jdbc:mysql://localhost/sinhvien01";
        String db_user = "SinhVien";
        String db_pass = "12345678";

            System.out.println("2. Connecting to DB...");
        Connection conn = null;
        conn = DriverManager.getConnection(db_url, db_user, db_pass);

            // 3. Thuc thi truy van
            System.out.println("3. Executing a query...");
            String sql;

            //sql = "SELECT id, name, class, hometown FROM istudents WHERE hometown = ?";
            sql = "INSERT INTO istudents values(?,?,?,?,?)";
            PreparedStatement stmt = null;

            stmt = conn.prepareStatement(sql);
            stmt.setString(1,"3");
            stmt.setString(2,"dsdad");
            stmt.setString(3, "12fsdfd");
            stmt.setString(4, "ffds Dinh");
            stmt.setString(5,"abc");
            stmt.execute();
            stmt.close();
            ConnectionUtil.getConnection().close();
        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }
       

    }
}
