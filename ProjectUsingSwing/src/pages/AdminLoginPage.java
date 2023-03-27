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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AdminLoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdminName;
	private JPasswordField txtAdminPwd;

	/**
	 * Launch the application.
	 */
	static AdminLoginPage frame = new AdminLoginPage();
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
	public AdminLoginPage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 731);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAdmin.setBounds(99, 120, 492, 66);
		contentPane.add(lblAdmin);
		
		JLabel lblName = new JLabel("Name      :");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(99, 232, 185, 33);
		contentPane.add(lblName);
		
		txtAdminName = new JTextField();
		txtAdminName.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAdminName.setColumns(10);
		txtAdminName.setBounds(346, 232, 231, 33);
		contentPane.add(txtAdminName);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(99, 338, 185, 33);
		contentPane.add(lblPassword);
		
		txtAdminPwd = new JPasswordField();
		txtAdminPwd.setBounds(346, 339, 231, 32);
		contentPane.add(txtAdminPwd);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String adminName = "admin";
					String adminPwd = "admin";
					if(adminName.equals(txtAdminName.getText())==true && adminPwd.equals(txtAdminPwd.getText())==true) {
						QustCreatePage qustCreatePage = new QustCreatePage();
						qustCreatePage.setVisible(true);
						frame.setVisible(false);
						//JOptionPane.showMessageDialog(null, "Good Admin");
					}
					else
					{
						System.out.println("wrong");
						JOptionPane.showMessageDialog(null, "Invalid credentials");
					}
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(270, 413, 192, 50);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\My_Folder\\Software\\eclipse\\ProjectUsingSwing\\resources\\img\\orange.jpg"));
		lblNewLabel.setBounds(0, 0, 1000, 699);
		contentPane.add(lblNewLabel);
	}

}
