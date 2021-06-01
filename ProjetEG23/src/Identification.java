import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Identification {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Identification window = new Identification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void ouvrirIdentification() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Identification window = new Identification();
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
	public Identification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 917, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(268, 186, 401, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(268, 289, 401, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Identifiant :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(110, 177, 112, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMotDePasse.setBounds(95, 290, 137, 15);
		frame.getContentPane().add(lblMotDePasse);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Accueil.ouvrirAccueil();
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(412, 399, 105, 34);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 905, 74);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(14, 99, 162));
		
		JLabel lblNewLabel_1 = new JLabel("UTT LOGIN");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(402, 22, 105, 34);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
	}
}
