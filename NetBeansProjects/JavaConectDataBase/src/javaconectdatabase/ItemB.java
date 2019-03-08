package b;

import java.sql.SQLException;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import da.ItemDA;
import e.Item;

public class ItemB {
	private ItemDA da;
	
	public ItemB() {
		// TODO Auto-generated constructor stub
		da = new ItemDA();
	}
	
	public DefaultTableModel getAllItem() throws SQLException{
		List<Item> items = da.getAll();
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("Quantity");
		
		for (Item item : items) {
			String[] cells = new String[4];
			cells[0] = String.valueOf(item.getId());
			cells[1] = item.getName();
			cells[2] = String.valueOf(item.getPrice());
			cells[3] = String.valueOf(item.getQuantity());
			model.addRow(cells);
		}
		
		return model;
	}
	
	public Item add(Item item){
		return null;
	}
	
	public Item delete(int id){
		return null;
	}
	
	public Item update(int id, Item newItem){
		return null;
	}
}
