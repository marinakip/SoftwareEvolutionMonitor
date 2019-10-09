import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;


public class ErrorOpenFile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorOpenFile frame = new ErrorOpenFile();
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
	public ErrorOpenFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Error Opening File: You haven't selected software history.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(54, 44, 370, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPleaseTryAgain = new JLabel("Please try again.");
		lblPleaseTryAgain.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPleaseTryAgain.setBounds(168, 62, 118, 14);
		contentPane.add(lblPleaseTryAgain);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ErrorOpenFile.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		lblNewLabel_1.setBounds(28, 21, 34, 65);
		contentPane.add(lblNewLabel_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(Color.CYAN);
		btnOk.setBounds(335, 95, 89, 23);
		contentPane.add(btnOk);
	}

}
