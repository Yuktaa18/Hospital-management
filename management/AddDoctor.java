package hospital.management;
import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AddDoctor extends JFrame {
	private JPanel contentPane;
	private JTextField di;
	private JTextField dn;
	private JTextField ds;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDoctor frame = new AddDoctor();
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
	public AddDoctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(0, 0, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD DOCTOR");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(755, 67, 203, 40);
		contentPane.add(lblNewLabel);
		
		di = new JTextField();
		di.setFont(new Font("Tahoma", Font.PLAIN, 18));
		di.setBounds(889, 172, 183, 34);
		contentPane.add(di);
		di.setColumns(10);
		
		dn = new JTextField();
		dn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		dn.setBounds(886, 259, 186, 34);
		contentPane.add(dn);
		dn.setColumns(10);
		
		ds = new JTextField();
		ds.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ds.setBounds(886, 347, 186, 34);
		contentPane.add(ds);
		ds.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBounds(586, 495, 108, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
			}
			private void btnNewButtonActionPerformed(ActionEvent e)
			{
				new second1page().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOG OUT");
		btnNewButton_1.setBounds(958, 495, 133, 34);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}
			private void btnNewButton_1ActionPerformed(ActionEvent e)
			{
				new firstpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Doctor's id");
		btnNewButton_3.setForeground(new Color(0, 128, 0));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(571, 164, 261, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Doctor's name");
		btnNewButton_4.setForeground(new Color(0, 128, 0));
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(571, 251, 261, 40);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Doctor's specialization");
		btnNewButton_5.setForeground(new Color(0, 128, 0));
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(572, 339, 260, 40);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_2 = new JButton("ADD");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2ActionPerformed(e);
			}

			private void btnNewButton_2ActionPerformed(ActionEvent e) {
				Connection c;
				try {   Class.forName("com.mysql.jdbc.Driver");
		                c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
		                String sql = "insert into doctor values (?,?,?)";
		                PreparedStatement ptstmt = c.prepareStatement(sql);
		                ptstmt.setString(1, di.getText());
		                ptstmt.setString(2, dn.getText());
		                ptstmt.setString(3, ds.getText());
				        
				        ptstmt.executeUpdate();
				        JOptionPane.showMessageDialog(null, "data inserted successfully");
				        c.close();
				         
				        di.setText("");dn.setText("");ds.setText("");
				        }catch (Exception ev){
				            JOptionPane.showMessageDialog(null, ev);
				        } 
			}
		});
		btnNewButton_2.setBounds(796, 424, 96, 39);
		contentPane.add(btnNewButton_2);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 1600, 900);
		lblNewLabel_4.setLabelFor(lblNewLabel);
		lblNewLabel_4.setIcon(new ImageIcon(firstpage.class.getResource("/hospital/management/Images/hospital.jpg")));
		contentPane.add(lblNewLabel_4);
		
		
		
		
	}
}
