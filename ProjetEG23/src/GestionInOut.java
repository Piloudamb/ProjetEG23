

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
import javax.swing.SwingConstants;

public class GestionInOut {

	private JFrame frame;
	private Image chart_entreSortie;

	/**
	 * Launch the application.
	 */
	public static void ouvrirGestionInOut() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionInOut window = new GestionInOut();
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
	public GestionInOut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 943, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Accueil");
		btnNewButton.setToolTipText("retour accueil");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Accueil.ouvrirAccueil();
			}
		});
		btnNewButton.setBounds(16, 110, 103, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(299, 478, 133, 36);
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
		btnNewButton_1_1.setBounds(515, 478, 133, 36);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 931, 100);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(14, 99, 162));
		panel.setLayout(null);
		
		JLabel lblGestionDesEntres = new JLabel("Gestion des entr\u00E9es / sorties");
		lblGestionDesEntres.setForeground(Color.WHITE);
		lblGestionDesEntres.setBounds(372, 19, 268, 56);
		panel.add(lblGestionDesEntres);
		lblGestionDesEntres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(42, 196, 865, 249);
		frame.getContentPane().add(lblNewLabel);
		try {
			chart_entreSortie = ImageIO.read(this.getClass().getResource("/images/chart_entreSortie.png"));
			chart_entreSortie = chart_entreSortie.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		lblNewLabel.setIcon(new ImageIcon(chart_entreSortie));
		
		JLabel lblNewLabel_1 = new JLabel("Statiques d'entrée/sortie des étudiants UTT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(331, 115, 353, 31);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
