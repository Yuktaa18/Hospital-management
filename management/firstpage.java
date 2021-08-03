//firstpage
package hospital.management;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class firstpage extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstpage frame = new firstpage();
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
	public firstpage() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1386, 783);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("CITY HOSPITAL ");
		lblNewLabel.setBounds(651, 110, 394, 76);
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setForeground(new Color(240, 255, 240));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 32));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("USERNAME");
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(543, 219, 159, 37);
		contentPane.add(btnNewButton_1);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(799, 219, 256, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Password");
		btnNewButton_2.setForeground(new Color(0, 0, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(543, 315, 159, 37);
		contentPane.add(btnNewButton_2);
		
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(799, 315, 256, 37);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(706, 438, 119, 49);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 1600, 900);
		lblNewLabel_3.setLabelFor(lblNewLabel);
		lblNewLabel_3.setIcon(new ImageIcon(firstpage.class.getResource("/hospital/management/Images/hospital.jpg")));
		contentPane.add(lblNewLabel_3);
		
		
	        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
				}
		});
    }
		private void btnNewButtonActionPerformed(ActionEvent evt) {
				String user=textField.getText();
				@SuppressWarnings("deprecation")
				String pass=passwordField.getText();
				try {
					if((user.compareTo("hospital")==0) &&(pass.compareTo("123")==0)){
						new secondpage().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(this, "Wrong username and password");
					}
				}catch(Exception e) {
					JOptionPane.showMessageDialog(this, "Wrong username and password");
				}
			}
	}
