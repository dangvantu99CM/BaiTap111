package v4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Create the dialog.
	 */
	public LoginDialog(JFrame parent) {
		super(parent, "Login", true);
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[][grow]", "[][][]"));
		{
			JLabel lblUsername = new JLabel("Username:");
			contentPanel.add(lblUsername, "cell 0 0,alignx trailing");
		}
		{
			txtUsername = new JTextField();
			contentPanel.add(txtUsername, "cell 1 0,growx");
			txtUsername.setColumns(10);
		}
		{
			JLabel lblPassword = new JLabel("Password:");
			contentPanel.add(lblPassword, "cell 0 1,alignx trailing");
		}
		{
			txtPassword = new JTextField();
			contentPanel.add(txtPassword, "cell 1 1,growx");
			txtPassword.setColumns(10);
		}
		{
			JButton btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//Code Login
					System.out.println("Login");
					LoginDialog.this.setVisible(false);
				}
			});
			contentPanel.add(btnLogin, "flowx,cell 1 2");
		}
		{
			JButton btnCancel = new JButton("Cancel");
			contentPanel.add(btnCancel, "cell 1 2");
		}
	}

	public String getUsername() {
		return txtUsername.getText();
	}

	public String getPassword() {
		return txtPassword.getText();
	}

}
