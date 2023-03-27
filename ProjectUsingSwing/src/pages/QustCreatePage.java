package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;

public class QustCreatePage extends JFrame {

	/**
	 * Launch the application.
	 */
	static QustCreatePage frame = new QustCreatePage();
	private JTextField txtTopic;
	private JTextField txtQ1;
	private JTextField txtQ2;
	private JTextField txtQ3;
	private JTextField txtQ4;
	private JTextField txtQ5;
	private JTextField txtQ6;
	
	int setNo;
	ResultSet resultSet;
	private JTable table;
	private JTable tblResponse;
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
	public QustCreatePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 729);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblHeading = new JLabel("Administrative Privilages");
		lblHeading.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setForeground(Color.WHITE);
		lblHeading.setBounds(133, 20, 754, 51);
		getContentPane().add(lblHeading);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(47, 105, 914, 478);
		getContentPane().add(tabbedPane);
		
		JPanel QustCreate = new JPanel();
		QustCreate.setToolTipText("Generate");
		tabbedPane.addTab("Generate", null, QustCreate, null);
		QustCreate.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Topic of this survey :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 24, 279, 33);
		QustCreate.add(lblNewLabel_1);
		
		txtTopic = new JTextField();
		txtTopic.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTopic.setBounds(299, 24, 579, 33);
		QustCreate.add(txtTopic);
		txtTopic.setColumns(10);
		
		txtQ1 = new JTextField();
		txtQ1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtQ1.setColumns(10);
		txtQ1.setBounds(71, 73, 807, 33);
		QustCreate.add(txtQ1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Q1 :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(10, 73, 51, 33);
		QustCreate.add(lblNewLabel_1_1);
		
		txtQ2 = new JTextField();
		txtQ2.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtQ2.setColumns(10);
		txtQ2.setBounds(71, 123, 807, 33);
		QustCreate.add(txtQ2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Q2 :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(10, 123, 51, 33);
		QustCreate.add(lblNewLabel_1_2);
		
		txtQ3 = new JTextField();
		txtQ3.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtQ3.setColumns(10);
		txtQ3.setBounds(71, 178, 807, 33);
		QustCreate.add(txtQ3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Q3 :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_3.setBounds(10, 178, 51, 33);
		QustCreate.add(lblNewLabel_1_3);
		
		txtQ4 = new JTextField();
		txtQ4.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtQ4.setColumns(10);
		txtQ4.setBounds(71, 231, 807, 33);
		QustCreate.add(txtQ4);
		
		JLabel lblNewLabel_1_4 = new JLabel("Q4 :");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_4.setBounds(10, 231, 51, 33);
		QustCreate.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Q5 :");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_5.setBounds(10, 286, 51, 33);
		QustCreate.add(lblNewLabel_1_5);
		
		txtQ5 = new JTextField();
		txtQ5.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtQ5.setColumns(10);
		txtQ5.setBounds(71, 286, 807, 33);
		QustCreate.add(txtQ5);
		
		txtQ6 = new JTextField();
		txtQ6.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtQ6.setColumns(10);
		txtQ6.setBounds(71, 341, 807, 33);
		QustCreate.add(txtQ6);
		
		JLabel lblNewLabel_1_6 = new JLabel("Q6 :");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_6.setBounds(10, 341, 51, 33);
		QustCreate.add(lblNewLabel_1_6);
		
		JButton btnNewButton = new JButton("Generate Survey");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
					Statement stmt = con.createStatement();
					
					String getId="SELECT SETNO FROM T_QUST WHERE SETNO = (SELECT MAX(SETNO) FROM T_QUST)";
					resultSet = stmt.executeQuery(getId.toString());
					if(resultSet.next())
					{
						String userId = resultSet.getString(1); 
						setNo=Integer.parseInt(userId);//to create the next Id
						setNo = setNo+1;
						//System.out.println(" id is :"+nextId);
					}
					else {
						setNo =2001;
						System.out.println(" id is :"+setNo);
					}
					
					StringBuilder qustQuery = new StringBuilder("INSERT INTO T_QUST VALUES(");
					qustQuery.append(setNo);
					qustQuery.append(",'");
					qustQuery.append(txtTopic.getText());
					qustQuery.append("','");
					qustQuery.append(txtQ1.getText());
					qustQuery.append("','");
					qustQuery.append(txtQ2.getText());
					qustQuery.append("','");
					qustQuery.append(txtQ3.getText());
					qustQuery.append("','");
					qustQuery.append(txtQ4.getText());
					qustQuery.append("','");
					qustQuery.append(txtQ5.getText());
					qustQuery.append("','");
					qustQuery.append(txtQ6.getText());
					qustQuery.append("')");
					
					System.out.println(qustQuery.toString());
					resultSet = stmt.executeQuery(qustQuery.toString());
					JOptionPane.showMessageDialog(null, "Questing Generated");
					
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(299, 384, 331, 45);
		QustCreate.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("View report", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 45, 847, 129);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Set Number", "Topic", "Q1", "Q2", "Q3", "Q4", "Q5", "Q6"
			}
		));
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(49, 258, 825, 129);
		panel_1.add(scrollPane_1);
		
		tblResponse = new JTable();
		scrollPane_1.setViewportView(tblResponse);
		tblResponse.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"REPORTID", "USERID", "SETNO", "ANS1", "ANS2", "ANS3", "ANS4", "ANS5", "ANS6"
			}
		));
		
		JLabel lblNewLabel_2 = new JLabel("Qustine :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(39, 10, 164, 34);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Get Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
				Statement stmt = con.createStatement();
				String qust = "Select * from t_qust order by setno asc";
				resultSet = stmt.executeQuery(qust);
				table.setModel(DbUtils.resultSetToTableModel(resultSet));
				String resp = "Select * from t_report order by setno asc";
				resultSet = stmt.executeQuery(resp);
				tblResponse.setModel(DbUtils.resultSetToTableModel(resultSet));
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(350, 405, 193, 36);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Response :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(39, 214, 164, 34);
		panel_1.add(lblNewLabel_2_1);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index i = new index();
				frame.dispose();
				i.setVisible(true);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogout.setBounds(861, 633, 100, 33);
		getContentPane().add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\My_Folder\\Software\\eclipse\\ProjectUsingSwing\\resources\\img\\blue.jpg"));
		lblNewLabel.setBounds(0, 0, 1000, 695);
		getContentPane().add(lblNewLabel);
	}
}
