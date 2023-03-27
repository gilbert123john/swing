package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static index frame = new index();
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
	public index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 735);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SURVEY SERVICE SYSTEM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(255, 43, 492, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setIcon(null);
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUser.setBounds(453, 207, 183, 204);
		contentPane.add(lblUser);
		
		JButton btnAdmin = new JButton("Login");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLoginPage adminLoginPage = new AdminLoginPage();
				adminLoginPage.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdmin.setBounds(160, 412, 192, 50);
		contentPane.add(btnAdmin);
		
		JButton btnUser = new JButton("Signin");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserTab userTab = new UserTab();
				frame.dispose();
				userTab.setVisible(true);
			}
		});
		btnUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUser.setBounds(453, 412, 192, 50);
		contentPane.add(btnUser);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(850, 542, 98, 41);
		contentPane.add(btnExit);
		
		JLabel lblAdminimg = new JLabel("Admin");
		lblAdminimg.setIcon(null);
		lblAdminimg.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminimg.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAdminimg.setBounds(160, 207, 183, 204);
		contentPane.add(lblAdminimg);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\My_Folder\\Software\\eclipse\\ProjectUsingSwing\\resources\\img\\blue.jpg"));
		lblNewLabel_1.setBounds(0, 0, 995, 707);
		contentPane.add(lblNewLabel_1);
	}
}
