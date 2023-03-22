package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 951, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Survey Service System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(191, 40, 542, 76);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbAdmin = new JLabel("AdminImg");
		lbAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lbAdmin.setForeground(Color.LIGHT_GRAY);
		lbAdmin.setBackground(new Color(255, 255, 255));
		lbAdmin.setBounds(245, 171, 167, 182);
		frame.getContentPane().add(lbAdmin);
		
		JLabel lbCust = new JLabel("CustImg");
		lbCust.setHorizontalAlignment(SwingConstants.CENTER);
		lbCust.setForeground(Color.LIGHT_GRAY);
		lbCust.setBackground(Color.WHITE);
		lbCust.setBounds(495, 171, 167, 182);
		frame.getContentPane().add(lbCust);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminLogin al = new adminLogin();
				al.setVisible(true);
				frame.dispose();
			}
		});
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdmin.setBounds(245, 363, 174, 49);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnCust = new JButton("CUSTOMER");
		btnCust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CustPage custPage = new CustPage();
//				custPage.setVisible(true);
				frame.dispose();
			}
		});
		btnCust.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCust.setBounds(495, 363, 174, 49);
		frame.getContentPane().add(btnCust);
		
		JButton btnExt = new JButton("EXIT");
		btnExt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExt.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExt.setBounds(780, 445, 114, 31);
		frame.getContentPane().add(btnExt);
	}
}
