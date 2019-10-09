import java.awt.BorderLayout;
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
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class EighthLaw extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EighthLaw frame = new EighthLaw();
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
	public EighthLaw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblthLehmansLaw = new JLabel("8th Lehman's law evaluation");
		lblthLehmansLaw.setHorizontalAlignment(SwingConstants.CENTER);
		lblthLehmansLaw.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblthLehmansLaw.setBounds(74, 11, 548, 14);
		contentPane.add(lblthLehmansLaw);
		
		JLabel lblOperationsNumber = new JLabel("Number of operations estimations");
		lblOperationsNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOperationsNumber.setBounds(244, 47, 210, 14);
		contentPane.add(lblOperationsNumber);
		
		JLabel lblIsTheth = new JLabel("Is the 8th Lehman law valid?");
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
		btnBack.setBounds(400, 421, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNext.setBackground(Color.WHITE);
		btnNext.setBounds(499, 421, 89, 23);
		contentPane.add(btnNext);
		
		JButton btnNewButton = new JButton("FINISH");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(598, 421, 89, 23);
		contentPane.add(btnNewButton);
	}
}
