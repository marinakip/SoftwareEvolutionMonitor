import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;


public class FourthLaw extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FourthLaw frame = new FourthLaw();
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
	public FourthLaw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblthLehmansLaw = new JLabel("4th Lehman's law evaluation");
		lblthLehmansLaw.setHorizontalAlignment(SwingConstants.CENTER);
		lblthLehmansLaw.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblthLehmansLaw.setBounds(74, 11, 548, 14);
		contentPane.add(lblthLehmansLaw);
		
		JLabel lblOperationsWorkRate = new JLabel("Operations work rate");
		lblOperationsWorkRate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOperationsWorkRate.setBounds(131, 51, 136, 14);
		contentPane.add(lblOperationsWorkRate);
		
		JLabel lblDataStructuresWorkRate = new JLabel("Data Structures work rate");
		lblDataStructuresWorkRate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDataStructuresWorkRate.setBounds(381, 51, 172, 14);
		contentPane.add(lblDataStructuresWorkRate);
		
		JLabel lblIsTheth = new JLabel("Is the 4th Lehman law valid?");
		lblIsTheth.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIsTheth.setBounds(35, 238, 172, 14);
		contentPane.add(lblIsTheth);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setBounds(224, 229, 89, 23);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(323, 229, 89, 23);
		contentPane.add(btnNo);
		
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
	}
}
