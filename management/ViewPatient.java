
package hospital.management;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class ViewPatient extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPatient frame = new ViewPatient();
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
	public ViewPatient() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}

			private void btnNewButton_1ActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new second2page().setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton = new JButton("view\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
			        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
			        
			        String sql = "select * from patient";
			        PreparedStatement ptstmt = conn.prepareStatement(sql);
			        ResultSet rs=ptstmt.executeQuery();
					DefaultTableModel tm = (DefaultTableModel)table.getModel();
					tm.setRowCount(0);
					while(rs.next()) {
						Object o[]= {rs.getInt("Patient's id"),rs.getString("Patient's name"),rs.getString("Disease")};
						tm.addRow(o);
					}
			       
			        }catch (Exception ev){
			            JOptionPane.showMessageDialog(null, ev);
			        } 
			}
		});
		
		JButton btnNewButton_2 = new JButton("logout");
		btnNewButton_2.setForeground(new Color(0, 0, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2ActionPerformed(e);
			}

			private void btnNewButton_2ActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new firstpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(935, 524, 118, 35);
		contentPane.add(btnNewButton_2);
		btnNewButton.setBounds(727, 507, 129, 52);
		contentPane.add(btnNewButton);
		btnNewButton_1.setBounds(515, 524, 101, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("View patient's details");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(662, 128, 289, 52);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(503, 244, 586, 230);
		contentPane.add(scrollPane_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_3.setViewportView(scrollPane_2);
		
		table = new JTable();
		table.setBackground(SystemColor.activeCaption);
		table.setFont(new Font("Times New Roman", Font.BOLD, 16));
		scrollPane_2.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Id", "Patient's_name", "Patient's_disease"
			}
		));
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ViewPatient.class.getResource("/hospital/management/Images/hospital.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1600, 900);
		contentPane.add(lblNewLabel_1);

		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(586, 213, 467, 191);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_1);
		
		
	}
}

