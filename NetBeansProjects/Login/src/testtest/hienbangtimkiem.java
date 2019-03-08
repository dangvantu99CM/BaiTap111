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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hienbangtimkiem extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNhapVexeOr;
	private JTextField txttimkiem;
	private JButton btnTim;
	int dem1=0;
	  ArrayList<Integer>a=new ArrayList<>();
	  ArrayList<String>b=new ArrayList<>();
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
	public void showw() {
		Connection conn = getConnectioṇ();
		String query="SELECT * FROM  guixe";
		Statement st;
		ResultSet rs;
		 
		try {
			st=conn.createStatement();
			rs=st.executeQuery(query);
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setRowCount(0);
			 
		//	Object[] row =new Object[10];
			while(rs.next()) {
				String bienso = rs.getString("bienso");
				 a.add(rs.getInt(2));
				 b.add(bienso);
				 
//				row[0] = rs.getInt(1);
//				
//				row[1] =  rs.getInt(2);
//				row[2] =  rs.getString(3);
//				row[3] =  rs.getString(4);
//				row[4]=  rs.getString(5);
//				row[5]= rs.getString(6);
//				row[6]= rs.getString(7);
//				row[7]= rs.getString(8);
//				row[8]= rs.getInt(9);
//				row[9]= rs.getString(11);
//				//row[10]= rs.getString(11);
//				//System.out.println(rs.getString(2));
//				model.addRow(row);
				
				 
				 }
			 System.out.println(a);
			 
				System.out.println(b + " ");
			
			
		 }
		
		  catch (SQLException e) {
				// TODO Auto-generated catch block
			
				e.printStackTrace();
			}
	}
	 
	public void showww() {
		Connection conn = getConnectioṇ();
		String query="SELECT * FROM  guixe";
		Statement st;
		ResultSet rs;
		 
		try {
			st=conn.createStatement();
			rs=st.executeQuery(query);
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setRowCount(0);
			 
			Object[] row =new Object[13];
			while(rs.next()) {
				 String bienso = rs.getString("bienso");
				if(  txttimkiem.getText().equalsIgnoreCase(bienso)) {	 
				row[0] = rs.getInt(1);
				
				row[1] =  rs.getInt(2);
				row[2] =  rs.getString(3);
				row[3] =  rs.getString(4);
				row[4]=  rs.getString(5);
				row[5]= rs.getString(6);
				row[6]= rs.getString(7);
				row[7]= rs.getString(8);
				row[8]= rs.getString(9);
				row[9]= rs.getInt(10);
				row[10]=rs.getString(11);
				row[11]=rs.getString(12);
				row[12]=rs.getString(13);
				//row[10]= rs.getString(11);
				//System.out.println(rs.getString(2));
				model.addRow(row);
				}
				if(txttimkiem.getText().equals(String.valueOf(rs.getInt(2)))) {	 
					row[0] = rs.getInt(1);
					
					row[1] =  rs.getInt(2);
					row[2] =  rs.getString(3);
					row[3] =  rs.getString(4);
					row[4]=  rs.getString(5);
					row[5]= rs.getString(6);
					row[6]= rs.getString(7);
					row[7]= rs.getString(8);
					row[8]= rs.getString(9);
					row[9]= rs.getInt(10);
					row[10]=rs.getString(11);
					row[11]=rs.getString(12);
					row[12]=rs.getString(13);
					//row[10]= rs.getString(11);
					//System.out.println(rs.getString(2));
					model.addRow(row);
					}
				 }
			 
		 }
		
		  catch (SQLException e) {
				// TODO Auto-generated catch block
			
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		 
					hienbangtimkiem frame = new hienbangtimkiem();
					frame.setVisible(true);
			 
	}
	public boolean checkk() {
		 showw();
		for (int i = 0; i < a.size(); i++) {
			 
				if((Integer.parseInt(txttimkiem.getText())==a.get(i)) ) {
					return true;
				}
			 
		}
		
		 
		return false;
	}
	public boolean checkkk() {
		 showw();
	 
			for (int j = 0; j < b.size(); j++) {
				if( txttimkiem.getText().equalsIgnoreCase(b.get(j))) {
					return true;
				}
			
		}
		
		 
		return false;
	}
	public hienbangtimkiem() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 35, 823, 283);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "mave", "bienso", "loaixe", "giovao", "ngaylay", "ngaygui", "mabaixe", " manvien", "hangui", "giora", "price", "ghichu"
			}
		));
		scrollPane.setViewportView(table);
		
		lblNhapVexeOr = new JLabel("nhap vexe or bienso");
		lblNhapVexeOr.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNhapVexeOr.setBounds(10, 11, 146, 14);
		contentPane.add(lblNhapVexeOr);
		
		txttimkiem = new JTextField();
		txttimkiem.setBounds(166, 9, 146, 20);
		contentPane.add(txttimkiem);
		txttimkiem.setColumns(10);
		 
		btnTim = new JButton("tim id");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				try {
					int n = Integer.parseInt(txttimkiem.getText());
				if(  checkk()==true) {
					showww();
					//JOptionPane.showMessageDialog(null, "ok   ");
				}
				else {
					JOptionPane.showMessageDialog(null, "khong co vui long nhap lai");
				}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "sai nut chon lua chon khac");
				}
			}
		});
		btnTim.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTim.setBounds(339, 8, 89, 23);
		contentPane.add(btnTim);
		
		JButton btnTimBs = new JButton("tim bs");
		btnTimBs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(  checkkk()==true) {
					showww();
					//JOptionPane.showMessageDialog(null, "ok   ");
				}
				else {
					JOptionPane.showMessageDialog(null, "khong co vui long nhap lai");
				}
			}
		});
		btnTimBs.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTimBs.setBounds(447, 8, 89, 23);
		contentPane.add(btnTimBs);
		//showw();
	}
}
