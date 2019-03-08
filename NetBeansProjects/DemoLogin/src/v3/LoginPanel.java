package v3;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginPanel extends JPanel {
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		setLayout(new MigLayout("", "[][grow]", "[][]"));
		
		JLabel lblUsername = new JLabel("Username:");
		add(lblUsername, "cell 0 0,alignx trailing");
		
		txtUsername = new JTextField();
		add(txtUsername, "cell 1 0,growx");
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		add(lblPassword, "cell 0 1,alignx trailing");
		
		txtPassword = new JPasswordField();
		add(txtPassword, "cell 1 1,growx");

	}

	public String getUsername(){
		return txtUsername.getText();
	}
	
	public String getPassword(){
		return String.valueOf(txtPassword.getPassword());
	}
}
