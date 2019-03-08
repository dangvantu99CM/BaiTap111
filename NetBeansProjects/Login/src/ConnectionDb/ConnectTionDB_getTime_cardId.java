package ConnectionDb;

import ConnectionDb.ConnectionUtil;
import p.ObjectCardId_Timeout;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import p.objectVexeId;

/**
 *
 * @author DangVanTu
 */
public class ConnectTionDB_getTime_cardId {

    private ArrayList<objectVexeId> list;

    public ConnectTionDB_getTime_cardId() {
        list = new ArrayList<objectVexeId>();
        getDataByConnect();
    }

    public ArrayList<objectVexeId> getDataByConnect() {
        //ArrayList<ObjectCardId_Timeout> kq = new ArrayList<>();
        try{
        String sql;
        sql = "SELECT vexe.mave,guixe.id FROM vexe LEFT JOIN guixe ON guixe.mave = vexe.mave WHERE vexe.loaive LIKE 'vethang'";
        
        PreparedStatement stmt = null;
        stmt = ConnectionUtil.getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
           // System.out.println(rs.getTime(2));
            objectVexeId o1 = new objectVexeId(rs.getInt(1),rs.getInt(2));
           // kq.add(o1);
           list.add(o1);
        }
        stmt.execute();
        }catch (ClassNotFoundException er) {

            er.printStackTrace();
        }catch (SQLException er) {

            er.printStackTrace();
        }
        return list;

    }
    public void test(){
        for(int i = 0 ; i < list.size() ; i++){
            //if(list.get(i).getTimeout() == null){
                System.out.println(i + 1 + ". " + list.get(i).toString());
            //}
        }
    }
    public static void main(String [] args){
        ConnectTionDB_getTime_cardId c = new ConnectTionDB_getTime_cardId();
        c.test();
    }
}
