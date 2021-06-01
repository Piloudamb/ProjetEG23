

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
import javax.swing.JTextField;

public class GestionUE {

	private JFrame frame;
	private JTextField txtSaisir;
	private Image find_logo;
	private Image chartUe;

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
		frame.setBounds(100, 100, 1031, 550);
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
		btnNewButton.setBounds(16, 96, 106, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(351, 475, 114, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("D\u00E9connexion");
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Identification.ouvrirIdentification();
			}
		});
		btnNewButton_1_1.setBounds(557, 475, 114, 35);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 1019, 78);
		panel.setBackground(new Color(14, 99, 162));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblGestionDesUe = new JLabel("Gestion des UE");
		lblGestionDesUe.setForeground(Color.WHITE);
		lblGestionDesUe.setBounds(453, 28, 134, 25);
		panel.add(lblGestionDesUe);
		lblGestionDesUe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(740, 96, 33, 34);
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
		txtSaisir.setBounds(291, 96, 440, 33);
		frame.getContentPane().add(txtSaisir);
		txtSaisir.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("EG23");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel.setBounds(317, 140, 71, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Responsable:  Jean-Marc Nigro");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_1.setBounds(421, 140, 261, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(38, 194, 963, 230);
		frame.getContentPane().add(lblNewLabel_2);
		try {
			chartUe = ImageIO.read(this.getClass().getResource("/images/chart_ue.png"));
			chartUe = chartUe.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		lblNewLabel_2.setIcon(new ImageIcon(chartUe));
	}

}
