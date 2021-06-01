

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionEnseignants {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ouvrirGestionEnseigant() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionEnseignants window = new GestionEnseignants();
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
	public GestionEnseignants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 888, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGestioDesEnseignants = new JLabel("Gestion des enseignants");
		lblGestioDesEnseignants.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGestioDesEnseignants.setBounds(308, 11, 222, 68);
		frame.getContentPane().add(lblGestioDesEnseignants);
		
		JButton btnNewButton = new JButton("Accueil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Accueil.ouvrirAccueil();
			}
		});
		btnNewButton.setBounds(33, 62, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(235, 383, 114, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("D\u00E9connexion");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Identification.ouvrirIdentification();
			}
		});
		btnNewButton_1_1.setBounds(484, 383, 114, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	}

}
