package testtest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class tinhtien1ngay extends JFrame {

	private JPanel contentPane;
	private JTextField txttongtientrongngay;
	private JTextField textField2;
	float tong=0;
	float tong1=0;
	float sum=0;
	float sum1=0;
	float sum2=0;
	private JLabel lblTongtiendathuduoc;
	private JTextField textField3;
	
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
	 
	public void tinht() {
		 
			Connection conn = getConnectioṇ();
			String query= "SELECT datediff(guixe.ngaylay,guixe.ngaygui) as ngay ,price , vexe.loaive FROM guixe, vexe WHERE guixe.mave=vexe.mave";
			Statement st=null;
			ResultSet rs=null;
			try {
				st=conn.createStatement();
				rs=st.executeQuery(query);
				 while(rs.next()) {
					 int ngay = rs.getInt("ngay");
					 float gia = rs.getFloat("price");
					 if(rs.getString(3).equals("vengay")) {
					 
					 
					 tong =tong+ gia;
//					  textField3.setText(String.valueOf(tong));
					 }
					 if(rs.getString(3).equals("vethang")) {
						 tong1=tong1+gia;
					 }
					
				 }
				 String sql="SELECT datediff(CURRENT_DATE,guixe.ngaygui) as ngay,price  ,  vexe.loaive , datediff(guixe.ngaylay,guixe.ngaygui) as ngay1 FROM guixe, vexe WHERE guixe.mave=vexe.mave";
				 rs=st.executeQuery(sql);
				 while(rs.next()) {
					 int ngay = rs.getInt("ngay");
					 float gia = rs.getFloat("price");
					 int ngay1=rs.getInt("ngay1");
					 if(rs.getString(3).equals("vengay") && ngay==0||ngay==1) {
					 sum =sum+  gia;
 						 
					 }
					 if(rs.getString(3).equals("vengay") && ngay<=30 && ngay>=0) {
						 sum1=sum1+ gia;
					 }
					 if(rs.getString(3).equals("vethang") && ngay1<=30) {
						 sum2=sum2+gia;
					 }
					 
				 }
				 txttongtientrongngay.setText(String.valueOf(sum));
				 textField2.setText(String.valueOf(sum1+sum2));
				 textField3.setText(String.valueOf(tong+tong1));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	
	
	public static void main(String[] args) {
		 
					tinhtien1ngay frame = new tinhtien1ngay();
					frame.setVisible(true);
			 
	}

	 
	public tinhtien1ngay() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTongtientrongngay = new JLabel("tongtientrongngay");
		lblTongtientrongngay.setBounds(37, 50, 111, 14);
		contentPane.add(lblTongtientrongngay);
		
		JLabel lblTongtientrongthang = new JLabel("tongtientrongthang");
		lblTongtientrongthang.setBounds(37, 98, 111, 14);
		contentPane.add(lblTongtientrongthang);
		
		txttongtientrongngay = new JTextField();
		txttongtientrongngay.setBounds(158, 47, 146, 20);
		contentPane.add(txttongtientrongngay);
		txttongtientrongngay.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(158, 95, 146, 20);
		contentPane.add(textField2);
		
		lblTongtiendathuduoc = new JLabel("tongtiendathuduoc");
		lblTongtiendathuduoc.setBounds(37, 143, 111, 14);
		contentPane.add(lblTongtiendathuduoc);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(158, 140, 146, 20);
		contentPane.add(textField3);
		tinht();
	}

}
