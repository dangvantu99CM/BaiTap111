package XuLyNgoai;

import ConnectionDb.ConnectionUtil;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DangVanTu
 */
public class GetCard_Id {

    private ArrayList<String> id;

    public GetCard_Id() {
        id = new ArrayList<String>();
        addArrayList();
    }

    public ArrayList<String> getID() {
        return id;
    }

    private void addArrayList() {
        try {

            String sql;
            sql = "SELECT mave FROM vexe";

            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Retrieve by column name
                String getid = String.valueOf(rs.getString(1));
                id.add(getid);
            }
            stmt.execute();
            stmt.close();
//            ConnectionUtil.getConnection().close();
        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GetCard_Id gi = new GetCard_Id();
        System.out.println("ListID: ");
        for (int i = 0; i < gi.id.size(); i++) {
            System.out.println(gi.id.get(i).toString());
        }
    }

}
