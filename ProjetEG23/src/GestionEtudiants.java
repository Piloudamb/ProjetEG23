

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionEtudiants {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ouvrirGestionEtudiants() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionEtudiants window = new GestionEtudiants();
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
	public GestionEtudiants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 985, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Accueil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Accueil.ouvrirAccueil();
			}
		});
		btnNewButton.setBounds(10, 51, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(297, 389, 114, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("D\u00E9connexion");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Identification.ouvrirIdentification();
			}
		});
		btnNewButton_1_1.setBounds(521, 389, 114, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblGestionDestuduants = new JLabel("Gestion des \u00E9tuduants");
		lblGestionDestuduants.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGestionDestuduants.setBounds(367, 11, 222, 68);
		frame.getContentPane().add(lblGestionDestuduants);
	}

}
