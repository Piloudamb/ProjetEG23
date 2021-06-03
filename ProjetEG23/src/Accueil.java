import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Accueil {

	private JFrame frame;
	
	private Image enseignants;

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
		frame.setBounds(100, 100, 914, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Gestion des enseignants
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(Accueil.class.getResource("/images/gestEnseignants.png")));
		btnNewButton_4.setToolTipText("Fen\u00EAtre gestion enseignants");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GestionEnseignants.ouvrirGestionEnseigant();
			}
		});
		btnNewButton_4.setBounds(41, 153, 193, 115);
//		try {
//			enseignants = ImageIO.read(this.getClass().getResource("/images/enseignants.png"));
//			enseignants = enseignants.getScaledInstance(btnNewButton_4.getWidth(), btnNewButton_4.getHeight(), Image.SCALE_DEFAULT);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		btnNewButton_4.setIcon(new ImageIcon(enseignants));
		frame.getContentPane().add(btnNewButton_4);
		
		
		// Gestion des UEs
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setIcon(new ImageIcon(Accueil.class.getResource("/images/gestUE.png")));
		btnNewButton_4_1.setToolTipText("Fen\u00EAtre gestion UE");
		btnNewButton_4_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GestionUE.ouvrirGestionUE();
			}
		});
		btnNewButton_4_1.setBounds(360, 153, 183, 115);
		frame.getContentPane().add(btnNewButton_4_1);
		
		
		// Gestion des etudiants
		JButton btnNewButton_4_2 = new JButton("");
		btnNewButton_4_2.setIcon(new ImageIcon(Accueil.class.getResource("/images/gestEtudiants.png")));
		btnNewButton_4_2.setToolTipText("Fen\u00EAtre gestion \u00E9tudiants");
		btnNewButton_4_2.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GestionEtudiants.ouvrirGestionEtudiants();
			}
		});
		btnNewButton_4_2.setBounds(682, 153, 183, 115);
		frame.getContentPane().add(btnNewButton_4_2);
		
		
		// Gestion des Entrees/Sorties
		JButton btnNewButton_4_3 = new JButton("");
		btnNewButton_4_3.setIcon(new ImageIcon(Accueil.class.getResource("/images/gestInOut.png")));
		btnNewButton_4_3.setToolTipText("Fen\u00EAtre gestion entr\u00E9es / sorties");
		btnNewButton_4_3.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GestionInOut.ouvrirGestionInOut();
			}
		});
		btnNewButton_4_3.setBounds(41, 359, 193, 115);
		frame.getContentPane().add(btnNewButton_4_3);
		
		
		// Gestion du semestre
		JButton btnNewButton_4_4 = new JButton("");
		btnNewButton_4_4.setIcon(new ImageIcon(Accueil.class.getResource("/images/gestSemestre.png")));
		btnNewButton_4_4.setToolTipText("Fen\u00EAtre gestion semestre");
		btnNewButton_4_4.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GestionSemestre.ouvrirGestionSemestre();
			}
		});
		btnNewButton_4_4.setBounds(360, 359, 183, 115);
		frame.getContentPane().add(btnNewButton_4_4);
		
		
		// Quitter/Deconnexion
		JButton btnNewButton = new JButton("Quitter");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(294, 515, 139, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("D\u00E9connexion");
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Identification.ouvrirIdentification();
			}
		});
		btnNewButton_1.setBounds(487, 515, 139, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 902, 94);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(14, 99, 162));
		
		JLabel lblNewLabel = new JLabel("Accueil");
		lblNewLabel.setBounds(403, 35, 68, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
}
