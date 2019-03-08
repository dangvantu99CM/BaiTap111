
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo3 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private JPanel panel;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo3 frame = new Demo3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Demo3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		scrollPane.setViewportView(table);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnAdd = new JButton("Add");
		panel.add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sr = table.getSelectedRow();
				String sid = (String) model.getValueAt(sr, 0);
				int id = Integer.parseInt(sid);
			}
		});
		panel.add(btnEdit);
		
		btnDelete = new JButton("Delete");
		panel.add(btnDelete);
		try {
			updateModel();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void updateModel() throws ClassNotFoundException, SQLException {
		//Create model
//		model = new DefaultTableModel();
//		model.addColumn("ID");
//		model.addColumn("Name");
//		model.addColumn("Class");
//		model.addColumn("Hometown");
		
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

		// 3. Thuc thi truy van
		System.out.println("3. Executing a query...");
		String sql;

		//sql = "SELECT id, name, class, hometown FROM istudents WHERE hometown = ?";
                sql = "INSERT INTO istudents(id,name,class,hometown) values(?,?,?,?)";
		PreparedStatement stmt = null;
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, "10");
                stmt.setString(2,"Ngoc");
                stmt.setString(3,"12A");
                stmt.setString(4,"Nam Dinh");

//		System.out.println("RESULT:");
//		ResultSet rs = stmt.executeQuery();
//		while (rs.next()) {
//			// Retrieve by column name
//			int id = rs.getInt("id");
//			String name = rs.getString("name");
//			String classname = rs.getString("class");
//			String home = rs.getString("hometown");
//			// add to model
//			String[] values = new String[4];
//			values[0] = String.valueOf(id);
//			values[1] = name;
//			values[2] = classname;
//			values[3] = home;
//			model.addRow(values);
//		}
//		table.setModel(model);
	}

}
