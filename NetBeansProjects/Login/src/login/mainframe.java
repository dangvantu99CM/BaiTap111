package login;
import GuiXeDeveloper.AddData01;
import GuiXeDeveloper.layxe;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import testtest.hienbangtimkiem;

public class mainframe extends JFrame {

	private JPanel contentPane;
	private JMenuBar mnb;
	private JTable table, table1;
	private DefaultTableModel model, model1;
	JScrollPane scrollPane;
	JPanel panel_2;
	JLabel lblAhihi,lblXeMy,lblXep,lblOT;
	JLabel lblVitri,lblBai;
	
	public mainframe() {
		setSize(900,600);
		setLocation(250,50);
		setResizable(false);
		mnb = new JMenuBar();
		JMenu logout = new JMenu("Logout");
		JMenuItem lgout = new JMenuItem("Log out");
		logout.add(lgout);
			lgout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					login lg = new login();
					lg.setVisible(true);
					lg.setSize(450,375);
					lg.setResizable(false);
				dispose();
				}			
			});
		
			JMenu feature = new JMenu("Chức năng");
		JMenuItem add = new JMenuItem("Thêm xe");
                add.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        AddData01 ad = new AddData01();
                        dispose();
                    }
                });
		JMenuItem delete = new JMenuItem("Lấy xe");
                delete.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layxe l = new layxe();
                        l.setVisible(true);
                        dispose();
                    }
                });
		JMenuItem search = new JMenuItem("Tìm xe");
                search.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        hienbangtimkiem s = new hienbangtimkiem();
                        s.setVisible(true);
                        dispose();
                    }
                });
		feature.add(add);
		feature.add(delete);
		feature.add(search);
		//
		JMenu vexe = new JMenu("Vé");
		JMenuItem themve = new JMenuItem("Thêm vé tháng");
		themve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vexe ve = new vexe();
				ve.setVisible(true);
			}		
		});
		vexe.add(themve);
		//
		mnb.add(logout);
		mnb.add(feature);
		mnb.add(vexe);
		this.setJMenuBar(mnb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 74, 549);
		panel.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Button button = new Button("Bãi A1");
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					slot("A1");
					update("A1");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			
		});
		panel.add(button);
		
		Button button_1 = new Button("Bãi A2");
		button_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					slot("A2");
					update("A2");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			
		});
		panel.add(button_1);
		
		Button button_3 = new Button("Bãi B1");
		button_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					slot("B1");
					update("B1");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			
		});
		panel.add(button_3);
		
		Button button_4 = new Button("Bãi C1");
		button_4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					slot("C1");
					update("C1");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			
		});
		panel.add(button_4);
		
		Button button_2 = new Button("Bãi C2");
		button_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					slot("C2");
					update("C2");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			
		});
		panel.add(button_2);
		
		Button button_5 = new Button("Tổng");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					slot();
					updateModel();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}		
		});
		panel.add(button_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(4, 4, 4, 4));
		panel_1.setBounds(75, 0, 809, 475);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		table = new JTable();
		table1 = new JTable();
		table.setFillsViewportHeight(true);
		table1.setFillsViewportHeight(true);
		scrollPane = new JScrollPane();
		panel_1.add(scrollPane,BorderLayout.CENTER);
		panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 204, 204));
		panel_2.setBounds(80, 475, 799, 74);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lblAhihi = new JLabel();
		lblAhihi.setFont(new Font("iCiel Bambola", Font.BOLD, 14));
		lblAhihi.setBounds(10, 0, 97, 74);
		
		panel_2.add(lblAhihi);
		
		lblXeMy = new JLabel();
		lblXeMy.setBounds(117, 3, 213, 30);
		panel_2.add(lblXeMy);
		
		lblXep = new JLabel();
		lblXep.setBounds(117, 22, 213, 30);
		panel_2.add(lblXep);
		
		lblOT = new JLabel();
		lblOT.setBounds(117, 34, 213, 40);
		panel_2.add(lblOT);
		
		lblVitri = new JLabel();
		lblVitri.setBounds(470, 11, 207, 22);
		panel_2.add(lblVitri);
		
		lblBai = new JLabel();
		lblBai.setBounds(470, 38, 207, 25);
		panel_2.add(lblBai);
		try {
			updateModel();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateModel() throws ClassNotFoundException, SQLException {

		scrollPane.setViewportView(table);
		model = new DefaultTableModel() {
			 public boolean isCellEditable(int row, int column) {
			       return false;
			    }
		};
		model.addColumn("ID");
		model.addColumn("Loại xe");
		model.addColumn("Biển số");
		model.addColumn("Giờ vào");
		model.addColumn("Ngày gửi");
		model.addColumn("Bãi Xe");
		model.addColumn("Ghi Chú");
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = connection.getConnection();

		String sql;

		sql = "SELECT id, loaixe, bienso, giovao, ngaygui,mabaixe, Note FROM guixe WHERE ngaylay is null";

		PreparedStatement stmt = null;
		stmt = conn.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String loai = rs.getString("loaixe");
			String bienso = rs.getString("bienso");
			String giovao = rs.getString("giovao");
			String ngaygui = rs.getString("ngaygui");
			String mabai = rs.getString("mabaixe");
			String note = rs.getString("Note");

			String[] values = new String[7];
			values[0] = String.valueOf(id);
			values[1] = loai;
			values[2] = bienso;
			values[3] = giovao;
			values[4] = ngaygui;
			values[5] = mabai;
			values[6] = note;

			model.addRow(values);
		}
		stmt.close();
		table.setModel(model);
	}

	
	private void update(String a) throws ClassNotFoundException, SQLException {
		scrollPane.setViewportView(table1);
		model1 = new DefaultTableModel() {
			 public boolean isCellEditable(int row, int column) {
			       return false;
			    }
		};
		model1.addColumn("ID");
		model1.addColumn("Loại Xe");
		model1.addColumn("Biển số");
		model1.addColumn("Giờ vào");
		model1.addColumn("Ngày gửi");
		model1.addColumn("Bãi Xe");
		model1.addColumn("Ghi Chú");
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = connection.getConnection();

		String sql;

		sql = "SELECT id, loaixe, bienso, giovao, ngaygui,mabaixe,Note FROM guixe WHERE ngaylay is null and mabaixe = ?";

		PreparedStatement stmt = null;
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, a);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String loai = rs.getString("loaixe");
			String bienso = rs.getString("bienso");
			String giovao = rs.getString("giovao");
			String ngaygui = rs.getString("ngaygui");
			String mabai = rs.getString("mabaixe");
			String note = rs.getString("Note");
			String[] values = new String[7];
			values[0] = String.valueOf(id);
			values[1] = loai;
			values[2] = bienso;
			values[3] = giovao;
			values[4] = ngaygui;
			values[5] = mabai;
			values[6] = note;
			model1.addRow(values);
		}
		table1.setModel(model1);
		stmt.close();
	}
	private void slot(String a) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = connection.getConnection();
		String sql;
		sql = "SELECT motorslot,bikeslot,otoslot,ma,vitri from baixe WHERE ma = ?";
		int [] slot = new int[3];
		String bai1 = null, bai0 = null;
		PreparedStatement stmt = null;
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, a);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			slot[0] = rs.getInt("motorslot");
			slot[1] = rs.getInt("bikeslot");
			slot[2] = rs.getInt("otoslot");
			bai0 = rs.getString("ma");
			bai1 = rs.getString("vitri");
		}
		lblAhihi.setText("Số chỗ trống");
		lblXeMy.setText("Xe Máy:    " + String.valueOf(slot[0]));
		lblXep.setText( "Xe Đạp:    " + String.valueOf(slot[1]));
		lblOT.setText(  "Ô tô:        " + String.valueOf(slot[2]));
		lblBai.setText(  "Bãi xe:    "+bai0);
		lblVitri.setText("Vị trí:    "+bai1);
		stmt.close();
	}
	private void slot() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = connection.getConnection();
		String sql;
		sql = "SELECT SUM(motorslot) as motor,SUM(bikeslot) as bike,SUM(otoslot) as oto  FROM baixe";
		int [] slot = new int[3];
		PreparedStatement stmt = null;
		stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			slot[0] = rs.getInt("motor");
			slot[1] = rs.getInt("bike");
			slot[2] = rs.getInt("oto");

		}
		lblAhihi.setText("Số chỗ trống");
		lblXeMy.setText("Xe Máy:    " + String.valueOf(slot[0]));
		lblXep.setText( "Xe Đạp:    " + String.valueOf(slot[1]));
		lblOT.setText(  "Ô tô:        " + String.valueOf(slot[2]));
		stmt.close();
	}
}
