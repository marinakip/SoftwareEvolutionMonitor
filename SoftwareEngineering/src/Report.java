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
import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JFileChooser;
import java.nio.file.FileAlreadyExistsException;
import java.awt.FileDialog;
import java.awt.Frame;


public class Report extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateReport = new JLabel("Create Report");
		lblCreateReport.setBounds(74, 11, 548, 23);
		lblCreateReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateReport.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblCreateReport);
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setToolTipText("");
		fileChooser.setApproveButtonToolTipText("Finish");
		fileChooser.setApproveButtonText("Save");
		fileChooser.setBounds(0, 45, 687, 403);
		contentPane.add(fileChooser);
	}
}
