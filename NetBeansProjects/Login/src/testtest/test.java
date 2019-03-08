package testtest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
 
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;

public class test extends JFrame {
	JTable tabledanggui = new JTable();
	 JTable tabledalay = new JTable();
	private JPanel contentPane;
	int dem=0;
	int dem1=0;
	int dem2=0;
	int dem3=0;
	int dem4=0;
	int dem5=0;
	int dem6=0;
	//int dem=0;
	int  dem7=0;
	JLabel lbtongsoxer,lbluotvao,lbcarv,lbbikev,lbmotov,lbcarr,lbbiker,lbmotor;
	 // connect
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
//	public ArrayList<guixe> getlist(){
//		ArrayList<guixe> guixeList = new ArrayList<>();
//		try {
//			
//			Connection conn = getConnectioṇ();
//			String query="SELECT * FROM  guixe";
//			Statement st;
//			ResultSet rs;
//			st=conn.createStatement();
//			rs=st.executeQuery(query);
//			guixe guixe;
//			//int id, int mave, String bienso, String loaixe, String giovao, String ngayvao, String ngaylay,
//			//String mabaixe, String manhanvien, float gia, String hangui
//			//int id, int mave, String bienso, String loaixe, String giovao, String ngayvao, String ngaylay,
////			String mabaixe, int manhanvien, float gia, String hangui)
//			 while(rs.next()){
//				guixe=new guixe(rs.getInt("id"),rs.getInt("mave"),rs.getString("bienso"),rs.getString("loaixe"),rs.getString("giovao"),rs.getString("ngayvao"),rs.getString("ngaylay"),rs.getString("mabaixe"),rs.getInt("manhanvien"),Float.parseFloat(rs.getString("price")),rs.getString("hangui"));
//				
//				guixeList.add(guixe);
//				
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return guixeList;
//	}
	
	//show
	public void showw() {
//		ArrayList<guixe> list = getlist();
		Connection conn = getConnectioṇ();
		String query="SELECT * FROM  guixe";
		Statement st;
		ResultSet rs;
		try {
			st=conn.createStatement();
			rs=st.executeQuery(query);
			DefaultTableModel model = (DefaultTableModel) tabledalay.getModel();
			model.setRowCount(0);
			DefaultTableModel model1=(DefaultTableModel) tabledanggui.getModel();
			model1.setRowCount(0);
			Object[] row =new Object[13];
			 while(rs.next()) {
				 if(rs.getString(6)!=null) {
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
				row[10]= rs.getString(11);
				row[11]= rs.getString(12);
				row[12]= rs.getString(13);
				//System.out.println(rs.getString(2));
				model.addRow(row);
				 
				dem++;
				lbtongsoxer.setText(String.valueOf(dem));
					if(rs.getString(4).equalsIgnoreCase("car")) {
						 dem2++;
						
					 }
					if(rs.getString(4).equalsIgnoreCase("bike")) {
						 dem3++;
						
					 }
					if(rs.getString(4).equalsIgnoreCase("motor")) {
						  dem4++;
						
					 }
				 }
				 if(rs.getString(6)==null) {
					 Object[] row1 = new Object[10];
					 row1[0] = rs.getInt(1);
						
						row1[1] =  rs.getInt(2);
						row1[2] =  rs.getString(3);
						row1[3] =  rs.getString(4);
						row1[4]=  rs.getString(5);
						//row[5]= rs.getString(6);
						row1[5]= rs.getString(8);
						row1[6]= rs.getString(9);
						row1[7]= rs.getInt(10);
						//row[9]= rs.getString(10);
						row1[8]= rs.getString(12);
						row1[9]=rs.getString(13);
						dem1++;
						model1.addRow(row1);
						lbluotvao.setText(String.valueOf(dem1));
						if(rs.getString(4).equalsIgnoreCase("car")) {
							 dem5++;
							 
						 }
						if(rs.getString(4).equalsIgnoreCase("bike")) {
							 dem6++;
							 
						 }
						if(rs.getString(4).equalsIgnoreCase("motor")) {
							 dem7++;
							
						 }
				 }
				 
			 }
			 lbcarr.setText(String.valueOf(dem2));
			 lbbiker.setText(String.valueOf(dem3));
			 lbmotor.setText(String.valueOf(dem4));
			 lbcarv.setText(String.valueOf(dem5));
			 lbbikev.setText(String.valueOf(dem6));
			 lbmotov.setText(String.valueOf(dem7));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	//}
//	public void show() {
//		Connection conn = getConnectioṇ();
//		String sql = "SELECT * FROM guixe";
//		PreparedStatement stmt = null;
//		
//		
//	}
	
	
	
	
	public static void main(String[] args) {
				test frame = new test();
				frame.setVisible(true);
			 
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSoveconlai = new JButton("soveconlai");
		btnSoveconlai.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSoveconlai.setBounds(528, 294, 100, 22);
		btnSoveconlai.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				soveconlai a = new soveconlai();
				a.setVisible(true);
				//a.setDefaultCloseOperation(EXIT_ON_CLOSE);
			}
		});
		contentPane.add(btnSoveconlai);
		
		//JButton btntimkiem = new JButton("timkiem");
//		btntimkiem.setFont(new Font("Tahoma", Font.BOLD, 12));
//		btntimkiem.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				hienbangtimkiem a = new hienbangtimkiem();
//				a.setVisible(true);
//				
//				
//			}
//		});
//		btntimkiem.setBounds(365, 294, 100, 22);
//		contentPane.add(btntimkiem);
		
//		JButton btnTtngay = new JButton("tinhtien");
//		btnTtngay.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				tinhtien1ngay tt1n = new tinhtien1ngay();
//				tt1n.setVisible(true);
//				 
//			}
//		});
//		btnTtngay.setBounds(23, 193, 100, 38);
//		contentPane.add(btnTtngay);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(154, 11,900, 250);
		contentPane.add(tabbedPane);
		
		JPanel pnDalay = new JPanel();
		tabbedPane.addTab("dalay", null, pnDalay, null);
		pnDalay.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 900, 166);
		pnDalay.add(scrollPane);
		
		 
		
		tabledalay.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "mave", "bienso", "loaixe", "giovao", " ngaylay", "giora", "ngaygui", "mabaixe", "manvien", "price", "hangui", "note"
			}
		));
		scrollPane.setViewportView(tabledalay);
		
		 JLabel lblTongsoluotra = new JLabel("tongsoluotra :");
		lblTongsoluotra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTongsoluotra.setBounds(10, 186, 98, 25);
		pnDalay.add(lblTongsoluotra);
		
		  lbtongsoxer = new JLabel(" ");
		lbtongsoxer.setBounds(107, 192, 46, 14);
		pnDalay.add(lbtongsoxer);
		
		JLabel lblCar = new JLabel("car :");
		lblCar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCar.setBounds(203, 192, 46, 14);
		pnDalay.add(lblCar);
		
		JLabel lblBike = new JLabel("bike :");
		lblBike.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBike.setBounds(351, 192, 46, 14);
		pnDalay.add(lblBike);
		
		JLabel lblMoto = new JLabel("moto :");
		lblMoto.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMoto.setBounds(487, 192, 46, 14);
		pnDalay.add(lblMoto);
		
		  lbcarr = new JLabel(" ");
		lbcarr.setBounds(240, 192, 46, 14);
		pnDalay.add(lbcarr);
		
		  lbbiker = new JLabel(" ");
		lbbiker.setBounds(390, 192, 46, 14);
		pnDalay.add(lbbiker);
		
		  lbmotor = new JLabel(" ");
		lbmotor.setBounds(533, 190, 46, 19);
		pnDalay.add(lbmotor);
		
		
		
		
		JPanel pnDanggui = new JPanel();
		tabbedPane.addTab("danggui", null, pnDanggui, null);
		pnDanggui.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 900, 167);
		pnDanggui.add(scrollPane_1);
		
		
		tabledanggui.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "mave", "bienso", "loaixe", "giovao", "ngaygui", "mabaixe", "manvien", "hangui", "note"
			}
		));
		scrollPane_1.setViewportView(tabledanggui);
		
		JLabel lblTongsoluotvao = new JLabel("tongsoluotvao :");
		lblTongsoluotvao.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTongsoluotvao.setBounds(10, 178, 121, 25);
		pnDanggui.add(lblTongsoluotvao);
		
		  lbluotvao = new JLabel(" ");
		lbluotvao.setBounds(121, 184, 46, 14);
		pnDanggui.add(lbluotvao);
		
		JLabel label = new JLabel("car :");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(186, 184, 46, 14);
		pnDanggui.add(label);
		
		JLabel lblBike_1 = new JLabel("bike :");
		lblBike_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBike_1.setBounds(292, 183, 46, 14);
		pnDanggui.add(lblBike_1);
		
		JLabel lblMoto_1 = new JLabel("moto :");
		lblMoto_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMoto_1.setBounds(435, 183, 46, 14);
		pnDanggui.add(lblMoto_1);
		
		  lbcarv = new JLabel(" ");
		lbcarv.setBounds(222, 184, 46, 14);
		pnDanggui.add(lbcarv);
		
		  lbbikev = new JLabel(" ");
		lbbikev.setBounds(331, 184, 46, 14);
		pnDanggui.add(lbbikev);
		
		  lbmotov = new JLabel(" ");
		lbmotov.setBounds(482, 184, 46, 14);
		pnDanggui.add(lbmotov);
		
		JButton btnNewButton = new JButton("tongtien");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tinhtien1ngay a = new tinhtien1ngay();
				a.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(218, 293, 89, 23);
		contentPane.add(btnNewButton);
		//show();
		showw();
	}
}
