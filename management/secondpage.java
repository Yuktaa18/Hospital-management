//Secondpage
package hospital.management;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class secondpage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondpage frame = new secondpage();
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
	public secondpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(0, 0, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     Welcome to City Hospital");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 28));
		lblNewLabel.setBounds(521, 115, 525, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Doctor");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(698, 206, 174, 37);
		contentPane.add(btnNewButton);
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
		
		JButton btnNewButton_1 = new JButton("Patient");
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
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(698, 287, 174, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Staff");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2ActionPerformed(e);
			}

			private void btnNewButton_2ActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new second3page().setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBounds(698, 379, 174, 44);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.setBounds(971, 470, 137, 44);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_4ActionPerformed(e);
			}

			private void btnNewButton_4ActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new firstpage().setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_3 = new JButton("back");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_3ActionPerformed(e);
			}

			private void btnNewButton_3ActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new firstpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(444, 470, 123, 44);
		contentPane.add(btnNewButton_3);
		
			

		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 1600, 900);
		lblNewLabel_3.setLabelFor(lblNewLabel);
		lblNewLabel_3.setIcon(new ImageIcon(firstpage.class.getResource("/hospital/management/Images/hospital.jpg")));
		contentPane.add(lblNewLabel_3);
	}

}

