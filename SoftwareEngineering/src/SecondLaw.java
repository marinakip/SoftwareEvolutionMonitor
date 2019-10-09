import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;


public class SecondLaw extends JFrame {

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
	public SecondLaw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblndLehmansLaw = new JLabel("2nd Lehman's law evaluation");
		lblndLehmansLaw.setHorizontalAlignment(SwingConstants.CENTER);
		lblndLehmansLaw.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblndLehmansLaw.setBounds(74, 11, 548, 14);
		contentPane.add(lblndLehmansLaw);
		
		JLabel lblOperationsComplexity = new JLabel("Operations complexity");
		lblOperationsComplexity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOperationsComplexity.setBounds(52, 51, 136, 14);
		contentPane.add(lblOperationsComplexity);
		
		JLabel lblDataStructureComplexity = new JLabel("Data Structure complexity");
		lblDataStructureComplexity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDataStructureComplexity.setBounds(253, 51, 159, 14);
		contentPane.add(lblDataStructureComplexity);
		
		JLabel lblMaintenanceActions = new JLabel("Maintenance actions");
		lblMaintenanceActions.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaintenanceActions.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaintenanceActions.setBounds(499, 51, 136, 14);
		contentPane.add(lblMaintenanceActions);
		
		JLabel lblIsThend = new JLabel("Is the 2nd Lehman law valid?");
		lblIsThend.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIsThend.setBounds(35, 238, 172, 14);
		contentPane.add(lblIsThend);
		
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

