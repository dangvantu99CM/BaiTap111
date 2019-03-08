package testtest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class soveconlai extends JFrame {
	JTextArea txtmave = new JTextArea();
	private JPanel contentPane;
	private JTextField txtsovecontrong;
	private JTable tablemave;
	int tong = 0;
	/**
	 * Launch the application.
	 */
	
	public Connection getConnectioṇ(){
		Connection conn =null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/guixevaoday0001","root","");
 			//JOptionPane.showMessageDialog(null, "Connected");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Not Connected");
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	public void listVe(){
		 
		try {
			
			Connection conn = getConnectioṇ();
			String query="SELECT *\r\n" + 
					"FROM vexe LEFT JOIN guixe on vexe.mave=guixe.mave\r\n" + 
					"WHERE (giovao is not null and giora is not null and ngaylay is not null) or(hangui is null) GROUP by vexe.mave";
			 
			Statement st;
			ResultSet rs;
			st=conn.createStatement();
			rs=st.executeQuery(query);
			DefaultTableModel model = (DefaultTableModel) tablemave.getModel();
			model.setRowCount(0);
			Object[] row =new Object[2];
			while(rs.next()) {
				  row[0]=rs.getInt(1);
				  row[1]=rs.getString(3);
				 model.addRow(row);
				 tong=tong+1;
			}
			 
				 txtsovecontrong.setText(String.valueOf(tong));
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	}
	public static void main(String[] args) {
					soveconlai frame = new soveconlai();
					frame.setVisible(true);
				 
	}

	 
	
	public soveconlai() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSovecontrong = new JLabel("sovecontrong");
		lblSovecontrong.setBounds(21, 24, 91, 14);
		contentPane.add(lblSovecontrong);
		
		txtsovecontrong = new JTextField();
		txtsovecontrong.setBounds(122, 24, 110, 20);
		contentPane.add(txtsovecontrong);
		txtsovecontrong.setColumns(10);
		
		JLabel lblMave = new JLabel("mave");
		lblMave.setBounds(21, 78, 46, 14);
		contentPane.add(lblMave);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(110, 90, 134, 154);
		contentPane.add(scrollPane);
		
		tablemave = new JTable();
		tablemave.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"mave", "loaive"
			}
		));
		scrollPane.setViewportView(tablemave);
		listVe();
	}
}
