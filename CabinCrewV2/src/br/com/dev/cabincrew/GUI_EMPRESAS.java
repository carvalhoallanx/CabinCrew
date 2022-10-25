package br.com.dev.cabincrew;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_EMPRESAS{

	JFrame frame;
	private JTextField Txtf_Callsing;
	private JTextField Txtf_Saida;
	private JTextField Txtf_Destino;
	private JTextField Txtf_NPassageiros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_EMPRESAS window = new GUI_EMPRESAS();
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
	public GUI_EMPRESAS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(150, 150, 150));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(14, 55, 406, 194);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CALLSING:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_1.setBounds(91, 25, 89, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SAIDA:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_2.setBounds(113, 58, 45, 17);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINO:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3.setBounds(96, 86, 62, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("N PASSAGEIROS:\r\n");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_4.setBounds(48, 111, 110, 14);
		panel.add(lblNewLabel_4);
		
		Txtf_Callsing = new JTextField();
		Txtf_Callsing.setBounds(165, 28, 134, 20);
		panel.add(Txtf_Callsing);
		Txtf_Callsing.setColumns(10);
		
		Txtf_Saida = new JTextField();
		Txtf_Saida.setBounds(165, 57, 134, 20);
		panel.add(Txtf_Saida);
		Txtf_Saida.setColumns(10);
		
		Txtf_Destino = new JTextField();
		Txtf_Destino.setBounds(165, 84, 134, 20);
		panel.add(Txtf_Destino);
		Txtf_Destino.setColumns(10);
		
		Txtf_NPassageiros = new JTextField();
		Txtf_NPassageiros.setBounds(165, 109, 134, 20);
		panel.add(Txtf_NPassageiros);
		Txtf_NPassageiros.setColumns(10);
		
		JButton btnNewButton = new JButton("INICIAR");
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfosVoo infos = new InfosVoo();
				infos.setCallsing(Txtf_Callsing.getText());
				infos.setSaida(Txtf_Saida.getText());
				infos.setDestino(Txtf_Destino.getText());
				infos.setN_Passageiros(Txtf_NPassageiros.getText());
			}
		});
		btnNewButton.setBounds(323, 158, 73, 25);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alan\\Pictures\\gol-logo.png"));
		lblNewLabel.setBounds(106, 1, 182, 53);
		frame.getContentPane().add(lblNewLabel);
	}
}
