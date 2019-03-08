package p;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import b.UserB;
import da.UserDA;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private MainFrame parent;
	private JLabel lblMessage;

	/**
	 * Create the frame.
	 */
	public LoginFrame(MainFrame parent) {
		this.parent = parent;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][]"));
		
		JLabel lblUsername = new JLabel("Username");
		contentPane.add(lblUsername, "cell 0 0,alignx trailing");
		
		txtUsername = new JTextField();
		contentPane.add(txtUsername, "cell 1 0,growx");
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		contentPane.add(lblPassword, "cell 0 1,alignx trailing");
		
		txtPassword = new JPasswordField();
		contentPane.add(txtPassword, "cell 1 1,growx");
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UserB userB = new UserB();
					if(userB.checkLogin(txtUsername.getText(), txtPassword.getText())){
						parent.enableControl();
						LoginFrame.this.setVisible(false);
					}else{
						lblMessage.setForeground(Color.RED);
						lblMessage.setText("Incorect username or password!");
					}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		lblMessage = new JLabel("Please enter your username and password");
		contentPane.add(lblMessage, "cell 1 2");
		contentPane.add(btnLogin, "flowx,cell 1 3");
		
		JButton btnCancel = new JButton("Cancel");
		contentPane.add(btnCancel, "cell 1 3");
	}

}
