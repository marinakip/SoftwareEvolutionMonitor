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


public class FirstLaw extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondLaw frame = new SecondLaw();
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
	public FirstLaw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblstLehmansLaw = new JLabel("1st Lehman's law evaluation");
		lblstLehmansLaw.setHorizontalAlignment(SwingConstants.CENTER);
		lblstLehmansLaw.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblstLehmansLaw.setBounds(74, 11, 548, 14);
		contentPane.add(lblstLehmansLaw);
		
		JLabel lblOperationChanges = new JLabel("Operation changes");
		lblOperationChanges.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOperationChanges.setBounds(52, 51, 136, 14);
		contentPane.add(lblOperationChanges);
		
		JLabel lblDataStructureChanges = new JLabel("Data Structure changes");
		lblDataStructureChanges.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDataStructureChanges.setBounds(269, 51, 143, 14);
		contentPane.add(lblDataStructureChanges);
		
		JLabel lblVersionsPerYear = new JLabel("Versions per year");
		lblVersionsPerYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersionsPerYear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVersionsPerYear.setBounds(499, 51, 136, 14);
		contentPane.add(lblVersionsPerYear);
		
		JLabel lblIsThest = new JLabel("Is the 1st Lehman law valid?");
		lblIsThest.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIsThest.setBounds(35, 238, 172, 14);
		contentPane.add(lblIsThest);
		
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
