

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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GestionEtudiants {

	private JFrame frame;
	private Image chartEtu;

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
		frame.setBounds(100, 100, 985, 564);
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
		btnNewButton.setBounds(16, 103, 114, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(317, 489, 130, 34);
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
		btnNewButton_1_1.setBounds(551, 489, 130, 34);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 973, 85);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(14, 99, 162));
		
		JLabel lblGestionDestuduants = new JLabel("Gestion des étudiants");
		lblGestionDestuduants.setForeground(Color.WHITE);
		lblGestionDestuduants.setBounds(420, 6, 222, 68);
		panel.add(lblGestionDestuduants);
		lblGestionDestuduants.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		String[] list = {"P21", "A20", "P20", "A19", "P19", "A18", "P18", "A17"};
		JComboBox comboBox = new JComboBox(list);
		comboBox.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		comboBox.setBounds(175, 97, 100, 44);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(37, 169, 913, 270);
		frame.getContentPane().add(lblNewLabel);
		try {
			chartEtu = ImageIO.read(this.getClass().getResource("/images/chart_etu.png"));
			chartEtu = chartEtu.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		lblNewLabel.setIcon(new ImageIcon(chartEtu));
	}
}
