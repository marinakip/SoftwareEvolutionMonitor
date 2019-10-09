import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import java.awt.Insets;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;


public class SoftwareEvolutionMonitor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoftwareEvolutionMonitor window = new SoftwareEvolutionMonitor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SoftwareEvolutionMonitor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().setLayout(null);
		
		JLabel lblSoftwareEvolutionMonitor = new JLabel("SOFTWARE EVOLUTION MONITOR");
		lblSoftwareEvolutionMonitor.setBounds(93, 30, 278, 20);
		lblSoftwareEvolutionMonitor.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblSoftwareEvolutionMonitor);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(359, 267, 102, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("This program monitors the evolution of software systems based on Lehman's laws");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 205, 451, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblToProceedClick = new JLabel("To proceed click NEXT.");
		lblToProceedClick.setHorizontalAlignment(SwingConstants.CENTER);
		lblToProceedClick.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblToProceedClick.setBounds(162, 230, 143, 14);
		frame.getContentPane().add(lblToProceedClick);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\MARINA\\Desktop\\softwareEvolution (422 x 133).jpg"));
		lblNewLabel_1.setBounds(24, 64, 422, 133);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 487, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
