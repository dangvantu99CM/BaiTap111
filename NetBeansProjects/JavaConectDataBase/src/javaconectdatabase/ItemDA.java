package da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import e.Item;

public class ItemDA {
	private Connection con;
	
	public ItemDA() {
		// TODO Auto-generated constructor stub
		try {
			con = ConnectionUtil.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Item> getAll() throws SQLException{
		List<Item> items = new ArrayList<Item>();
		
		String sql = "SELECT * FROM item";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			Item item = new Item(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4));
			items.add(item);
		}
		
		return items;
	}
	
	public boolean deleteItem(int id) throws SQLException{
		String sql = "DELETE FROM item WHERE id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		
		
		int result = stmt.executeUpdate();
			
		return result>0;
	}
	
	//....
}
