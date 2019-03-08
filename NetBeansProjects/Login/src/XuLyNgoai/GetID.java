package XuLyNgoai;

import ConnectionDb.ConnectionUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DangVanTu
 */
public class GetID {

    private ArrayList<String> id;

    public GetID() {
        id = new ArrayList<String>();
        addArrayList();
    }

    public ArrayList<String> getID() {
        return id;
    }

    private void addArrayList() {
        try {

            String sql;
            sql = "SELECT id FROM luotguixe";

            PreparedStatement stmt = null;
            stmt = ConnectionUtil.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Retrieve by column name
                String getid = rs.getString(1);
                id.add(getid);
            }
            stmt.execute();
           // ConnectionUtil.getConnection().close();
        } catch (ClassNotFoundException er) {

            er.printStackTrace();
        } catch (SQLException er) {

            er.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GetID gi = new GetID();
        System.out.println("ListID: ");
        for (int i = 0; i < gi.id.size(); i++) {
            System.out.println(gi.id.get(i).toString());
        }
    }

}
