

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GestionSemestre {

	private JFrame frame;
	private JTextField txtSaisir;
	private Image find_logo;

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
		frame.setBounds(100, 100, 980, 562);
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
		btnNewButton.setBounds(16, 128, 114, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(327, 481, 114, 37);
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
		btnNewButton_1_1.setBounds(536, 481, 114, 37);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 968, 115);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(14, 99, 162));
		
		JLabel lblGestionDuSemestre = new JLabel("Gestion du semestre");
		lblGestionDuSemestre.setForeground(Color.WHITE);
		lblGestionDuSemestre.setBounds(389, 20, 193, 68);
		panel.add(lblGestionDuSemestre);
		lblGestionDuSemestre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		// Recherche barre...
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(759, 128, 33, 34);
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
		txtSaisir.setBounds(317, 129, 440, 33);
		frame.getContentPane().add(txtSaisir);
		txtSaisir.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(40, 177, 902, 282);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Retard:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel.setBounds(151, 17, 103, 29);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Retard critique:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_1.setBounds(350, 17, 123, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Candidat(e) à excellence:");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_2.setBounds(562, 17, 199, 29);
		panel_1.add(lblNewLabel_2);
		
		String[] list2 = {"Marielle Charon", "Sixtine Dunoyer"};
		
		String[] list3 = {"Laura Craft", "Jenny Depp", "Michel Kyle", "Marielle Charon", "Jean Lermecier", 
				"Paul Hichamd", "Julie Tournemie", "Vincent Padd", "Alec Dupont", "Kevin Durant", 
				"Julie Tournemie", "Vincent Padd"};
		
		String[] list1 = {"Jean Dupont", "Paul Durant", "Julie Fralauld", "Vincent Toison", 
				"Jean Lermecier", "Paul Hichamd", "Julie Tournemie", "Vincent Padd", 
				"Alec Dupont", "Kevin Durant", "Marielle Charon", "Sixtine Dunoyer"};
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(81, 54, 146, 210);
		panel_1.add(panel_4);
		
		JList list_1 = new JList(list1);
		list_1.setVisibleRowCount(10);
		JScrollPane scrollPane = new JScrollPane(list_1);
		panel_4.add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(345, 54, 146, 210);
		panel_1.add(panel_2);
		
		JList list_2 = new JList(list2);
		list_2.setVisibleRowCount(10);
		JScrollPane scrollPane2 = new JScrollPane(list_2);
		panel_2.add(scrollPane2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(636, 58, 141, 203);
		panel_1.add(panel_3);
		
		JList list_3 = new JList(list3);
		list_3.setVisibleRowCount(10);
		JScrollPane scrollPane3 = new JScrollPane(list_3);
		panel_3.add(scrollPane3);
		
		
		String[] list = {"ISI1", "ISI2", "ISI3", "ISI4", "ISI5"};
		JComboBox comboBox = new JComboBox(list);
		comboBox.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		comboBox.setBounds(131, 134, 103, 27);
		frame.getContentPane().add(comboBox);
	}
}
