import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ouvrirAccueil() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil window = new Accueil();
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
	public Accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 914, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accueil");
		lblNewLabel.setBounds(389, 36, 68, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton_4 = new JButton("Gestion des enseignants");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GestionEnseignants.ouvrirGestionEnseigant();
			}
		});
		btnNewButton_4.setBounds(41, 153, 183, 115);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Gestion des UE");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GestionUE.ouvrirGestionUE();
			}
		});
		btnNewButton_4_1.setBounds(360, 153, 171, 115);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Gestion des \u00E9tudians");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GestionEtudiants.ouvrirGestionEtudiants();
			}
		});
		btnNewButton_4_2.setBounds(682, 153, 171, 115);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton("Entr\u00E9es / Sorties");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GestionInOut.ouvrirGestionInOut();
			}
		});
		btnNewButton_4_3.setBounds(41, 359, 183, 115);
		frame.getContentPane().add(btnNewButton_4_3);
		
		JButton btnNewButton_4_4 = new JButton("Gestion du semestre");
		btnNewButton_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GestionSemestre.ouvrirGestionSemestre();
			}
		});
		btnNewButton_4_4.setBounds(360, 359, 171, 115);
		frame.getContentPane().add(btnNewButton_4_4);
		
		JButton btnNewButton = new JButton("Quitter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(302, 515, 114, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("D\u00E9connexion");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Identification.ouvrirIdentification();
			}
		});
		btnNewButton_1.setBounds(481, 515, 114, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
