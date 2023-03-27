package pages;

import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ResponsePage extends JFrame {

	private JPanel contentPane;
	ResultSet resultSet;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResponsePage frame = new ResponsePage();
					
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
	String userId;
	int setNo;
	private JTextField txtAns1;
	private JTextField txtAns2;
	private JTextField txtAns3;
	private JTextField txtAns4;
	private JTextField txtAns5;
	private JTextField txtAns6;
	JButton btnNewButton = new JButton("Submit");
	
	public ResponsePage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1010, 731);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please Feel Free To mark your Answer");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 25, 700, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblQ1 = new JLabel("");
		lblQ1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblQ1.setBounds(82, 132, 707, 33);
		contentPane.add(lblQ1);
		
		txtAns1 = new JTextField();
		txtAns1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtAns1.setBounds(50, 164, 622, 33);
		contentPane.add(txtAns1);
		txtAns1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("1.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(48, 132, 34, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTopic = new JLabel("");
		lblTopic.setHorizontalAlignment(SwingConstants.CENTER);
		lblTopic.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTopic.setBounds(142, 68, 700, 33);
		contentPane.add(lblTopic);
		
		JLabel lblQ2 = new JLabel("");
		lblQ2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblQ2.setBounds(82, 207, 707, 33);
		contentPane.add(lblQ2);
		
		JLabel lblNewLabel_1_1 = new JLabel("2.");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(48, 207, 34, 33);
		contentPane.add(lblNewLabel_1_1);
		
		txtAns2 = new JTextField();
		txtAns2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtAns2.setColumns(10);
		txtAns2.setBounds(50, 239, 622, 33);
		contentPane.add(txtAns2);
		
		JLabel lblQ3 = new JLabel("");
		lblQ3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblQ3.setBounds(84, 282, 707, 33);
		contentPane.add(lblQ3);
		
		JLabel lblNewLabel_1_2 = new JLabel("3.");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(50, 282, 34, 33);
		contentPane.add(lblNewLabel_1_2);
		
		txtAns3 = new JTextField();
		txtAns3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtAns3.setColumns(10);
		txtAns3.setBounds(52, 314, 620, 33);
		contentPane.add(txtAns3);
		
		JLabel lblQ4 = new JLabel("");
		lblQ4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblQ4.setBounds(84, 357, 707, 33);
		contentPane.add(lblQ4);
		
		JLabel lblNewLabel_1_3 = new JLabel("4.");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_3.setBounds(50, 357, 34, 33);
		contentPane.add(lblNewLabel_1_3);
		
		txtAns4 = new JTextField();
		txtAns4.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtAns4.setColumns(10);
		txtAns4.setBounds(52, 389, 620, 33);
		contentPane.add(txtAns4);
		
		JLabel lblQ5 = new JLabel("");
		lblQ5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblQ5.setBounds(84, 432, 707, 33);
		contentPane.add(lblQ5);
		
		JLabel lblNewLabel_1_4 = new JLabel("5.");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_4.setBounds(50, 432, 34, 33);
		contentPane.add(lblNewLabel_1_4);
		
		txtAns5 = new JTextField();
		txtAns5.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtAns5.setColumns(10);
		txtAns5.setBounds(52, 464, 620, 33);
		contentPane.add(txtAns5);
		
		JLabel lblQ6 = new JLabel("");
		lblQ6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblQ6.setBounds(84, 507, 707, 33);
		contentPane.add(lblQ6);
		
		JLabel lblNewLabel_1_5 = new JLabel("6.");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_5.setBounds(50, 507, 34, 33);
		contentPane.add(lblNewLabel_1_5);
		
		txtAns6 = new JTextField();
		txtAns6.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtAns6.setColumns(10);
		txtAns6.setBounds(52, 539, 620, 33);
		contentPane.add(txtAns6);
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(420, 623, 191, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblBgImg = new JLabel("");
		lblBgImg.setIcon(new ImageIcon("D:\\My_Folder\\Software\\eclipse\\ProjectUsingSwing\\resources\\img\\blue.jpg"));
		lblBgImg.setBounds(0, 0, 1000, 700);
		contentPane.add(lblBgImg);
		
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
		Statement stmt = con.createStatement();
		
		String getId="SELECT * FROM T_QUST WHERE SETNO = (SELECT MAX(SETNO) FROM T_QUST)";
		resultSet = stmt.executeQuery(getId.toString());
		while(resultSet.next())
		{
			String userId = resultSet.getString(1); 
			setNo=Integer.parseInt(userId);//to create the next Id
			//System.out.println(" id is :"+setNo);
			lblTopic.setText(resultSet.getString(2));
			lblQ1.setText(resultSet.getString(3));
			lblQ2.setText(resultSet.getString(4));
			lblQ3.setText(resultSet.getString(5));
			lblQ4.setText(resultSet.getString(6));
			lblQ5.setText(resultSet.getString(7));
			lblQ6.setText(resultSet.getString(8));
			
		}
	}catch(Exception ex) {
		System.out.println(ex);
	}
	}
	public void passId(String id) {
		userId = id;
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int repId=0;
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
					Statement stmt = con.createStatement();
					
					String getId="SELECT REPORTID FROM T_REPORT WHERE REPORTID = (SELECT MAX(REPORTID) FROM T_REPORT)";
					resultSet = stmt.executeQuery(getId.toString());
					if(resultSet.next())
					{
						repId = Integer.parseInt(resultSet.getString(1));
						repId = repId+1;
					}
					else {
						repId = 3001;
					}
					StringBuilder ansQuery = new StringBuilder("INSERT INTO T_REPORT VALUES(");
					ansQuery.append(repId);
					ansQuery.append(",");
					ansQuery.append(Integer.parseInt(userId));
					ansQuery.append(",");
					ansQuery.append(setNo);
					ansQuery.append(",'");
					ansQuery.append(txtAns1.getText());
					ansQuery.append("','");
					ansQuery.append(txtAns2.getText());
					ansQuery.append("','");
					ansQuery.append(txtAns3.getText());
					ansQuery.append("','");
					ansQuery.append(txtAns4.getText());
					ansQuery.append("','");
					ansQuery.append(txtAns5.getText());
					ansQuery.append("','");
					ansQuery.append(txtAns6.getText());
					ansQuery.append("')");
					//System.out.println(ansQuery.toString());
					resultSet = stmt.executeQuery(ansQuery.toString());
					JOptionPane.showMessageDialog(null, "Thank you for your valuble Time");
					UserTab userTab = new UserTab();
					userTab.setVisible(true);
					
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
	}
	

}
