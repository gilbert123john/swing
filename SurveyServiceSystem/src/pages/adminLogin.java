package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class adminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserNane;
	/**
	 * Launch the application.
	 */
	//static adminLogin frame = new adminLogin();//need to check which frame
	private JPasswordField passwordField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminLogin frame = new adminLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public adminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 951, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(312, 55, 264, 62);
		contentPane.add(lblNewLabel);
		
		txtUserNane = new JTextField();
		txtUserNane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUserNane.setBounds(453, 179, 196, 32);
		contentPane.add(txtUserNane);
		txtUserNane.setColumns(10);
		
		JButton btnExt = new JButton("EXIT");
		btnExt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//frame.dispose();
			}
		});
		btnExt.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExt.setBounds(784, 457, 114, 31);
		contentPane.add(btnExt);
		
		JLabel lblName = new JLabel("Admin Name      :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(285, 176, 138, 32);
		contentPane.add(lblName);
		
		JLabel lblpwd = new JLabel("Password           :");
		lblpwd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblpwd.setBounds(285, 248, 138, 32);
		contentPane.add(lblpwd);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField.setBounds(453, 251, 196, 32);
		contentPane.add(passwordField);
		
		JButton btnLoginAdmin = new JButton("Login");
		btnLoginAdmin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLoginAdmin.setBounds(380, 321, 138, 32);
		contentPane.add(btnLoginAdmin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				HomePage hp = new HomePage();//Check with ann ma'am
//				hp.setVisible(true);
				//frame.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(41, 456, 138, 32);
		contentPane.add(btnBack);
	}
}
