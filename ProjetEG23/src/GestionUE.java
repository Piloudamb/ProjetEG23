

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionUE {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ouvrirGestionUE() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionUE window = new GestionUE();
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
	public GestionUE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1031, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Accueil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Accueil.ouvrirAccueil();
			}
		});
		btnNewButton.setBounds(23, 48, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblGestionDesUe = new JLabel("Gestion des UE");
		lblGestionDesUe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGestionDesUe.setBounds(416, 21, 146, 68);
		frame.getContentPane().add(lblGestionDesUe);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(291, 397, 114, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("D\u00E9connexion");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Identification.ouvrirIdentification();
			}
		});
		btnNewButton_1_1.setBounds(536, 397, 114, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	}

}
