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


public class ErrorEvaluationSixthLaw extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorEvaluationSixthLaw frame = new ErrorEvaluationSixthLaw();
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
	public ErrorEvaluationSixthLaw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You haven't evaluated the 6th law.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(54, 58, 370, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPleaseTryAgain = new JLabel("Would you like to evaluate it now?");
		lblPleaseTryAgain.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseTryAgain.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPleaseTryAgain.setBounds(117, 72, 240, 14);
		contentPane.add(lblPleaseTryAgain);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ErrorEvaluationSixthLaw.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		lblNewLabel_1.setBounds(28, 21, 34, 65);
		contentPane.add(lblNewLabel_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(Color.CYAN);
		btnOk.setBounds(335, 95, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblErrorCantProceed = new JLabel("Error: Can't proceed to the evaluation of the 7th law.");
		lblErrorCantProceed.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblErrorCantProceed.setBounds(86, 41, 310, 14);
		contentPane.add(lblErrorCantProceed);
	}

}
