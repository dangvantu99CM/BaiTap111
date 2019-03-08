package p;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import b.ItemB;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnAdd;
	private DefaultTableModel model;
	private ItemB itemB;

	private void initModel() throws SQLException{
		model = itemB.getAllItem();
		table.setModel(model);
	}
	
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		itemB = new ItemB();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUser = new JMenu("User");
		menuBar.add(mnUser);
		
		JMenuItem mntmLogin = new JMenuItem("Log in");
		mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginFrame loginFrame = new LoginFrame(MainFrame.this);
				loginFrame.setVisible(true);
			}
		});
		mnUser.add(mntmLogin);
		
		JMenuItem mntmLogOut = new JMenuItem("Log out");
		mnUser.add(mntmLogOut);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		try {
			initModel();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnAdd = new JButton("Add");
		btnAdd.setEnabled(false);
		panel.add(btnAdd);
		
		btnDelete = new JButton("Delete");
		btnDelete.setEnabled(false);
		panel.add(btnDelete);
		
		btnEdit = new JButton("Edit");
		btnEdit.setEnabled(false);
		panel.add(btnEdit);
	}

	void enableControl(){
		btnAdd.setEnabled(true);
		btnDelete.setEnabled(true);
		btnEdit.setEnabled(true);
	}
}
