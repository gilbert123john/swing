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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtPhone;
	private JTextField txtPwd;

	int nextId;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	static RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1014, 736);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewRespondentRegister = new JLabel("New Respondent Register");
		lblNewRespondentRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewRespondentRegister.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewRespondentRegister.setBounds(95, 109, 492, 66);
		contentPane.add(lblNewRespondentRegister);
		
		JLabel lblName = new JLabel("Name        :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(95, 221, 185, 33);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtName.setColumns(10);
		txtName.setBounds(342, 221, 231, 33);
		contentPane.add(txtName);
		
		JLabel lblName_1 = new JLabel("Age           :");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName_1.setBounds(95, 278, 185, 33);
		contentPane.add(lblName_1);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAge.setColumns(10);
		txtAge.setBounds(342, 278, 231, 33);
		contentPane.add(txtAge);
		
		JLabel lblName_2 = new JLabel("Phone no  :");
		lblName_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName_2.setBounds(95, 409, 185, 33);
		contentPane.add(lblName_2);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPhone.setColumns(10);
		txtPhone.setBounds(342, 409, 231, 33);
		contentPane.add(txtPhone);
		
		JLabel lblName_2_1 = new JLabel("Password  :");
		lblName_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName_2_1.setBounds(95, 471, 185, 33);
		contentPane.add(lblName_2_1);
		
		txtPwd = new JTextField();
		txtPwd.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPwd.setColumns(10);
		txtPwd.setBounds(342, 471, 231, 33);
		contentPane.add(txtPwd);
		
		
		
		JLabel lblName_2_2 = new JLabel("Gender     :");
		lblName_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName_2_2.setBounds(95, 339, 185, 33);
		contentPane.add(lblName_2_2);
		
		JComboBox gender = new JComboBox();
		gender.setFont(new Font("Tahoma", Font.BOLD, 15));
		gender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "TG"}));
		gender.setBounds(342, 339, 231, 33);
		contentPane.add(gender);
		
		
		JButton btnReg = new JButton("Register");
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
					Statement stmt = con.createStatement();
					
					String getId="SELECT USERID FROM T_USER WHERE USERID = (SELECT MAX(USERID) FROM T_USER)";
					ResultSet rs = stmt.executeQuery(getId.toString());
					if(rs.next())
					{
						String userId = rs.getString(1); 
						nextId=Integer.parseInt(userId);//to create the next Id
						nextId = nextId+1;
						//System.out.println(" id is :"+nextId);
					}
					else {
						nextId =1001;
						System.out.println(" id is :"+nextId);
					}
					
					String gen;
					int i = gender.getSelectedIndex();
					if(i==0) {
						gen = "M";
					}
					else if(i==1) {
						gen = "F";
					}
					else if(i==2) {
						gen = "T";
					}
					else
						gen=null;
					
					
					StringBuilder registerQuery = new StringBuilder("INSERT INTO T_USER VALUES(");
					registerQuery.append(nextId);
					registerQuery.append(",'");
					registerQuery.append(txtName.getText());
					registerQuery.append("',");
					registerQuery.append(Integer.parseInt(txtAge.getText()));
					registerQuery.append(",'");
					registerQuery.append(gen);
					registerQuery.append("','");
					registerQuery.append(txtPhone.getText());
					registerQuery.append("','");
					registerQuery.append(txtPwd.getText());
					registerQuery.append("')");
					
					//System.out.println(registerQuery.toString());
					stmt.executeUpdate(registerQuery.toString());
					JOptionPane.showMessageDialog(null, "You have Registered sucessfully your unique id is "+nextId);
				}
				catch(NumberFormatException ne) {
					System.out.println(ne);
					JOptionPane.showMessageDialog(null, "Age/Phone Number should be Number");
				}
				catch(SQLException sql) {
					System.out.println(sql);
					JOptionPane.showMessageDialog(null, "Password should be 8 charactor");
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
				
			}
		});
		btnReg.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReg.setBounds(245, 567, 185, 33);
		contentPane.add(btnReg);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserTab userTab = new UserTab();
				frame.dispose();
				userTab.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(869, 567, 100, 33);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\My_Folder\\Software\\eclipse\\ProjectUsingSwing\\resources\\img\\perple.jpg"));
		lblNewLabel.setBounds(0, 0, 1000, 700);
		contentPane.add(lblNewLabel);
		
	}
}
