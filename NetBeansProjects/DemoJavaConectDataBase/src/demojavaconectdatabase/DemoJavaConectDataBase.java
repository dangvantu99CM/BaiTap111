package demojavaconectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJavaConectDataBase {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            // Khoi tao Driver
            System.out.println("1. Register JDBC Driver...");
            Class.forName("com.mysql.jdbc.Driver");

            // Tao connection
            String db_url = "jdbc:mysql://localhost/sinhvien01";
            String db_user = "SinhVien";
            String db_pass = "12345678";

            System.out.println("2. Connecting to DB...");
            Connection conn = null;
            conn = DriverManager.getConnection(db_url, db_user, db_pass);
            // conn = DriverManager.getConnection(db_url);

            // 3. Thuc thi truy van
            System.out.println("3. Executing a query...");
            String sql;
            sql = "SELECT id, name, class, hometown FROM istudents";

            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            System.out.println("RESULT:");

            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String classname = rs.getString("class");
                String home = rs.getString("hometown");
                // Display values
                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.print(", Class: " + classname);
                System.out.println(", Hometown: " + home);
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
