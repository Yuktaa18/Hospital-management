package hospital.management;

import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class second1page extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					second1page frame = new second1page();
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
	public second1page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(0, 0, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    Doctor");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblNewLabel.setBounds(717, 104, 165, 45);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Doctor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
			}
			private void btnNewButtonActionPerformed(ActionEvent e)
			{
				new AddDoctor().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton.setBounds(695, 204, 256, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit Doctor's Datail");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}
			private void btnNewButton_1ActionPerformed(ActionEvent e)
			{
				new EditDoctor().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton_1.setBounds(695, 267, 256, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fire Doctor");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2ActionPerformed(e);
			}
			private void btnNewButton_2ActionPerformed(ActionEvent e)
			{
				new RemoveDoctor().setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton_2.setBounds(695, 324, 256, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Display Doctor's Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			btnNewButton_3ActionPerformed(e);
			}
			private void btnNewButton_3ActionPerformed(ActionEvent e)
			{
				new ViewDoctor().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton_3.setBounds(695, 385, 256, 37);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_4ActionPerformed(e);
			}
			private void btnNewButton_4ActionPerformed(ActionEvent e)
			{
				new firstpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(921, 472, 135, 37);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("back");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_5ActionPerformed(e);
			}
			private void btnNewButton_5ActionPerformed(ActionEvent e)
			{
				new secondpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBounds(563, 464, 111, 45);
		contentPane.add(btnNewButton_5);
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 1600, 900);
		lblNewLabel_3.setLabelFor(lblNewLabel);
		lblNewLabel_3.setIcon(new ImageIcon(firstpage.class.getResource("/hospital/management/Images/hospital.jpg")));
		contentPane.add(lblNewLabel_3);
	} 
}
