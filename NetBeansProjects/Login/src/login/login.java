package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import testtest.test;

public class login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passField;
	JButton btnLogin;
	JLabel lblWelcome;
	JLabel lblNewLabel,lblNewLabel_1;
	static user us;
        static mainframe frame;


	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(450,375);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(173, 215, 108, 35);
		btnLogin.setFont(new Font("iCiel Rukola", Font.PLAIN, 17));
		btnLogin.addActionListener(this);
		contentPane.setLayout(null);
		contentPane.add(btnLogin);
		
		lblWelcome = new JLabel("Welcome");
		lblWelcome.setBounds(184, 26, 97, 35);
		lblWelcome.setFont(new Font("Monotxt", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(lblWelcome);
		
		textField = new JTextField();
		textField.setBounds(110, 96, 244, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passField = new JPasswordField();
		passField.setBounds(110, 157, 244, 35);
		contentPane.add(passField);
		passField.setColumns(10);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\Documents\\LTHDT\\BaiTapCk\\Iconlogin\\tk.png"));
		lblNewLabel.setBounds(73, 96, 27, 35);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\Documents\\LTHDT\\BaiTapCk\\Iconlogin\\mk.png"));
		lblNewLabel_1.setBounds(73, 157, 27, 35);
		contentPane.add(lblNewLabel_1);
	}
	public void actionPerformed(ActionEvent e) {
		String value1 = textField.getText();
		String value2 = passField.getText();
		us = new user();
		
		try {
			if(us.check(value1, value2) == true) {
				us.setUsername(value1);
				if(us.isadmin(value1, value2) == true) {
					
				EventQueue.invokeLater(new Runnable() {
					
					 public void run() {
						try {
						 frame = new mainframe();
                                                 
						 frame.setVisible(true);
					} catch (Exception e) {
							e.printStackTrace();				}
					}
					});
				} else {
//					adminpage ad = new adminpage();
//					ad.setVisible(true);
                                        test t = new test();
                                        t.setVisible(true);

				}
				
	
				this.dispose();
			} else {
			System.out.println("log in failed");
			JOptionPane.showMessageDialog(this, "log in failed", "error", JOptionPane.ERROR_MESSAGE);
			}
		
	} catch (SQLException e1) {
		e1.printStackTrace();
	} catch (ClassNotFoundException e2) {
		e2.printStackTrace();
	}
		
	}
}
