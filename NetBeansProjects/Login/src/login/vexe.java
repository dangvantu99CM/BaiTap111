package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.ImageIcon;

public class vexe extends JDialog implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	int id;
	String loai;
	String note;
	//
	public vexe(int id, String loai, String chuve) {
		this.id = id;
		this.loai = loai;
		this.note = chuve;
	}
	public vexe() {
		
		setBounds(100, 100, 450, 300);
		setSize(400,200);
		setModal(true);
		setResizable(false);
		setAlwaysOnTop(true);
		setModalityType(ModalityType.APPLICATION_MODAL);
                setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMV = new JLabel("Mã vé");
		lblMV.setBounds(49, 11, 57, 53);
		contentPane.add(lblMV);
		
		JLabel lblChiCh = new JLabel("Ghi chú");
		lblChiCh.setBounds(49, 60, 57, 53);
		contentPane.add(lblChiCh);
		
		textField = new JTextField();
		textField.setBounds(116, 27, 222, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 75, 222, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("F:\\Documents\\LTHDT\\BaiTapCk\\Iconlogin\\them.png"));
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(82, 124, 72, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("F:\\Documents\\LTHDT\\BaiTapCk\\Iconlogin\\Xoa.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}		
		});
		btnNewButton_1.setBounds(222, 124, 72, 25);
		contentPane.add(btnNewButton_1);
	}
	public void actionPerformed(ActionEvent e) {

		try {
			Connection conn = null;
			conn = connection.getConnection();
			String value1 = textField.getText();
			Integer ah = Integer.valueOf(value1);
			String value3 = textField_1.getText();
			if(value1.equals("")) {
				JOptionPane.showMessageDialog(this, "failed", "Note", JOptionPane.ERROR_MESSAGE);
			} else
			{
			String sql;

			sql = "insert into vexe values(?,?,?)";

			PreparedStatement stmt = null;
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, ah);
			stmt.setString(2, value3);
			stmt.setString(3, "vethang");
			int rs = stmt.executeUpdate();	
			if(rs == 1) {
				
				JOptionPane.showMessageDialog(this, "sucess", "Note", JOptionPane.INFORMATION_MESSAGE);
				this.dispose();

			} }			
		} catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e1) {
			JOptionPane.showMessageDialog(this, "failed", "Note", JOptionPane.ERROR_MESSAGE);
		}catch (SQLException e1) {
			e1.printStackTrace();
		} catch (NumberFormatException e2) {
			JOptionPane.showMessageDialog(this, "failed", "Note", JOptionPane.ERROR_MESSAGE);
		} catch (ClassNotFoundException e3) {
			e3.printStackTrace();
		}	
	}
        public static void main(String[] args){
            vexe v = new vexe();
            v.setVisible(true);
        }
}
