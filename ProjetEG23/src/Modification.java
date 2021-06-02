import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Modification {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void ouvrirModification() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modification window = new Modification();
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
	public Modification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 856, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField(GestionEnseignants.getLabel_2().getText());
		textField.setBounds(513, 52, 218, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(GestionEnseignants.getLabel_3().getText());
		textField_1.setBounds(153, 123, 218, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(GestionEnseignants.getLabel_6().getText());
		textField_2.setBounds(513, 194, 218, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(GestionEnseignants.getLabel_1().getText());
		textField_3.setBounds(153, 52, 218, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField(GestionEnseignants.getLabel_5().getText());
		textField_4.setBounds(153, 194, 218, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField(GestionEnseignants.getLabel_4().getText());
		textField_5.setBounds(513, 123, 218, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_3.getText();
				String prenom = textField.getText();
				String type = textField_1.getText();
				String responsable = textField_5.getText();
				String heureSupp = textField_4.getText();
				String entre = textField_2.getText();
				GestionEnseignants.setLabel(GestionEnseignants.getLabel_1(), name);
				GestionEnseignants.setLabel(GestionEnseignants.getLabel_2(), prenom);
				GestionEnseignants.setLabel(GestionEnseignants.getLabel_3(), type);
				GestionEnseignants.setLabel(GestionEnseignants.getLabel_4(), responsable);
				GestionEnseignants.setLabel(GestionEnseignants.getLabel_5(), heureSupp);
				GestionEnseignants.setLabel(GestionEnseignants.getLabel_6(), entre);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(307, 359, 104, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(446, 359, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Nom:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel.setBounds(99, 54, 42, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Type:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_1.setBounds(99, 125, 42, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prénom:");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_2.setBounds(450, 54, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Respo de:");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_3.setBounds(440, 125, 75, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Entré(e) en:");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_4.setBounds(426, 196, 83, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Heures supplémentaires:");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_5.setBounds(52, 196, 89, 16);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
