

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JTextField;

public class GestionEnseignants {

	private JFrame frame;
	private Image find_logo;
	private JTextField txtSaisir;
	private static JLabel lblNewLabel_1;
	private static JLabel lblNewLabel_2;
	private static JLabel lblNewLabel_3;
	private static JLabel lblNewLabel_4;
	private static JLabel lblNewLabel_5;
	private static JLabel lblNewLabel_6;

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
		frame.setBounds(100, 100, 888, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Accueil");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Accueil.ouvrirAccueil();
			}
		});
		btnNewButton.setBounds(16, 96, 99, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(282, 461, 114, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("D\u00E9connexion");
		btnNewButton_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Identification.ouvrirIdentification();
			}
		});
		btnNewButton_1_1.setBounds(528, 461, 114, 39);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 876, 78);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(14, 99, 162));
		
		JLabel lblGestioDesEnseignants = new JLabel("Gestion des enseignants");
		lblGestioDesEnseignants.setForeground(Color.WHITE);
		lblGestioDesEnseignants.setBounds(324, 6, 222, 68);
		panel.add(lblGestioDesEnseignants);
		lblGestioDesEnseignants.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		// Info d'enseignant(e)
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(178, 142, 519, 259);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Nom:  Nigro");
		lblNewLabel_1.setBounds(40, 20, 273, 28);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Prénom:  Jean-Marc");
		lblNewLabel_2.setBounds(40, 60, 273, 28);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Type:  Enseignant chercheur");
		lblNewLabel_3.setBounds(40, 100, 273, 28);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Responsable de:  EG23");
		lblNewLabel_4.setBounds(40, 140, 273, 28);
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Heures-supplémentaires:  3h");
		lblNewLabel_5.setBounds(40, 180, 273, 28);
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Entré(e) en:  2010");
		lblNewLabel_6.setBounds(40, 217, 273, 28);
		panel_1.add(lblNewLabel_6);
		panel_1.setVisible(false);
		
		// Find button
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(681, 96, 33, 34);
		try {
			find_logo = ImageIO.read(this.getClass().getResource("/images/find_logo.png"));
			find_logo = find_logo.getScaledInstance(btnNewButton_2.getWidth(), btnNewButton_2.getHeight(), Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		btnNewButton_2.setIcon(new ImageIcon(find_logo));
		frame.getContentPane().add(btnNewButton_2);
		
		txtSaisir = new JTextField();
		txtSaisir.setForeground(new Color(30, 144, 255));
		txtSaisir.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtSaisir.setText("Saisir votre recherche...");
		txtSaisir.setBounds(229, 98, 440, 30);
		frame.getContentPane().add(txtSaisir);
		txtSaisir.setColumns(10);
		
		
		// Modification bouton
		JButton btnNewButton_3 = new JButton("Modifier");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modification.ouvrirModification();
			}
		});
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setBounds(733, 160, 117, 39);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Ajouter");
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_4.setBounds(733, 222, 117, 39);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Supprimer");
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_5.setBounds(733, 288, 117, 39);
		frame.getContentPane().add(btnNewButton_5);
	}
	
	public static void setLabel(JLabel label, String text) {
		label.setText(text);
	}
	
	public static JLabel getLabel_1() {
		return lblNewLabel_1;
	}
	
	public static JLabel getLabel_2() {
		return lblNewLabel_2;
	}
	
	public static JLabel getLabel_3() {
		return lblNewLabel_3;
	}
	
	public static JLabel getLabel_4() {
		return lblNewLabel_4;
	}
	
	public static JLabel getLabel_5() {
		return lblNewLabel_5;
	}
	
	public static JLabel getLabel_6() {
		return lblNewLabel_6;
	}
}
