import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;


public class SeventhLawValid extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeventhLawValid frame = new SeventhLawValid();
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
	public SeventhLawValid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblthLehmansLaw = new JLabel("7th Lehman's law evaluation");
		lblthLehmansLaw.setHorizontalAlignment(SwingConstants.CENTER);
		lblthLehmansLaw.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblthLehmansLaw.setBounds(74, 11, 548, 14);
		contentPane.add(lblthLehmansLaw);
		
		JLabel lblExpainWhy = new JLabel("Expain why:");
		lblExpainWhy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblExpainWhy.setBounds(35, 297, 89, 14);
		contentPane.add(lblExpainWhy);
		
		JLabel lbloptional = new JLabel("(optional)");
		lbloptional.setHorizontalAlignment(SwingConstants.CENTER);
		lbloptional.setBounds(35, 311, 69, 14);
		contentPane.add(lbloptional);
		
		textField = new JTextField();
		textField.setBounds(114, 277, 548, 108);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(499, 421, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setBackground(Color.CYAN);
		btnNext.setBounds(598, 421, 89, 23);
		contentPane.add(btnNext);
		
		JLabel lblThethLehmans = new JLabel("The 7th Lehman's law depends on the results of the 2nd and 6th law. They have been evaluated and ");
		lblThethLehmans.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblThethLehmans.setHorizontalAlignment(SwingConstants.CENTER);
		lblThethLehmans.setBounds(74, 142, 613, 23);
		contentPane.add(lblThethLehmans);
		
		JLabel lblWereFoundValid = new JLabel("were found valid. As a result, the 7th Lehman's law is VALID.");
		lblWereFoundValid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWereFoundValid.setBounds(201, 176, 568, 14);
		contentPane.add(lblWereFoundValid);
	}
}
