package hospital.management;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class EditStaff extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditStaff frame = new EditStaff();
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
	public EditStaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(0, 0, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit Staff");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 33));
		lblNewLabel.setBounds(713, 90, 206, 51);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Staff's id");
		btnNewButton_3.setForeground(new Color(165, 42, 42));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_3.setBounds(565, 181, 176, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Staff's name");
		btnNewButton_4.setForeground(new Color(165, 42, 42));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_4.setBounds(565, 281, 176, 40);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Work");
		btnNewButton_5.setForeground(new Color(165, 42, 42));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_5.setBounds(565, 381, 176, 40);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
			}
			private void btnNewButtonActionPerformed(ActionEvent ev) {
				try {
				new second3page().setVisible(true);
				dispose();
		        }catch (Exception evt){
		            JOptionPane.showMessageDialog(null, evt);
		        } 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(535, 528, 115, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOG OUT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}
			private void btnNewButton_1ActionPerformed(ActionEvent ev) {
				try {
				new firstpage().setVisible(true);
				dispose();
		        }catch (Exception evt){
		            JOptionPane.showMessageDialog(null, evt);
		        }
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(944, 528, 106, 40);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(847, 181, 185, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(847, 281, 185, 40);
		contentPane.add(textField_1);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(847, 381, 185, 40);
		contentPane.add(textField_2);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2ActionPerformed(e);
			}
			private void btnNewButton_2ActionPerformed(ActionEvent ev) {
				try {
				Class.forName("com.mysql.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                String sql = "UPDATE `staff` SET `Staff's name`='"+textField_1.getText()+"',`Staff's work`='"+textField_2.getText()+"' WHERE `Staff's id`='"+textField.getText()+"'";
                PreparedStatement ptstmt = c.prepareStatement(sql);
       
		        ptstmt.executeUpdate();
		        JOptionPane.showMessageDialog(null, "data updated successfully");
		        c.close();
		         
		        textField.setText("");textField_1.setText("");textField_2.setText("");
		        }catch (Exception evt){
		            JOptionPane.showMessageDialog(null, evt);
		        } 
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(730, 452, 122, 40);
		contentPane.add(btnNewButton_2);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 1600, 900);
		lblNewLabel_4.setLabelFor(lblNewLabel);
		lblNewLabel_4.setIcon(new ImageIcon(firstpage.class.getResource("/hospital/management/Images/hospital.jpg")));
		contentPane.add(lblNewLabel_4);
		
		
	}
}
