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


public class ErrorOpeningFile3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorOpeningFile3 frame = new ErrorOpeningFile3();
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
	public ErrorOpeningFile3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Error Opening File: The file you selected doesn't exist");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(54, 44, 370, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPleaseTryAgain = new JLabel("Please try again.");
		lblPleaseTryAgain.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPleaseTryAgain.setBounds(163, 72, 118, 14);
		contentPane.add(lblPleaseTryAgain);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ErrorOpeningFile3.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		lblNewLabel_1.setBounds(28, 21, 34, 65);
		contentPane.add(lblNewLabel_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(Color.CYAN);
		btnOk.setBounds(335, 95, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblOrIsNot = new JLabel("or is not in the appropriate form.");
		lblOrIsNot.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOrIsNot.setBounds(121, 58, 231, 14);
		contentPane.add(lblOrIsNot);
	}

}
