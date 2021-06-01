

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionSemestre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ouvrirGestionSemestre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionSemestre window = new GestionSemestre();
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
	public GestionSemestre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 980, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Accueil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Accueil.ouvrirAccueil();
			}
		});
		btnNewButton.setBounds(10, 69, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblGestionDuSemestre = new JLabel("Gestion du semestre");
		lblGestionDuSemestre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGestionDuSemestre.setBounds(366, 11, 193, 68);
		frame.getContentPane().add(lblGestionDuSemestre);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(288, 364, 114, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("D\u00E9connexion");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Identification.ouvrirIdentification();
			}
		});
		btnNewButton_1_1.setBounds(512, 364, 114, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	}

}
