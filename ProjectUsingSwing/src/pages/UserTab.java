package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class UserTab extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JPasswordField txtPwd;

	/**
	 * Launch the application.
	 */
	
	String userId;
	
	static UserTab frame = new UserTab();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public UserTab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 726);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("USER");
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUser.setBounds(84, 82, 492, 66);
		contentPane.add(lblUser);
		
		JLabel lblName = new JLabel("Name      :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(119, 194, 185, 33);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(119, 300, 185, 33);
		contentPane.add(lblPassword);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtName.setBounds(331, 194, 231, 33);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(331, 301, 231, 32);
		contentPane.add(txtPwd);
		
		JButton btnNewRegister = new JButton("New Register");
		btnNewRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPage registerPage = new RegisterPage();
				registerPage.setVisible(true);
			}
		});
		btnNewRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewRegister.setBounds(112, 376, 192, 50);
		contentPane.add(btnNewRegister);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
					
					PreparedStatement pstmt = con.prepareStatement("SELECT * FROM T_USER WHERE NAME=? AND PASSWORD = ?");
					pstmt.setString(1, txtName.getText());
					pstmt.setString(2, txtPwd.getText());
					ResultSet rs = pstmt.executeQuery();
					
					if(rs.next())
					{
						userId = rs.getString(1);             // Retrieve first column value
						System.out.println("UserId = " + userId);
						ResponsePage responsePage = new ResponsePage();
						responsePage.passId(userId);
						responsePage.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid credentials");
					}
					
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(370, 376, 192, 50);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\My_Folder\\Software\\eclipse\\ProjectUsingSwing\\resources\\img\\orange.jpg"));
		lblNewLabel.setBounds(0, 0, 1000, 694);
		contentPane.add(lblNewLabel);
		
	}
}
