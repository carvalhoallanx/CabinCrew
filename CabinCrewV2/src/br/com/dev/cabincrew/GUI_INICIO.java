package br.com.dev.cabincrew;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class GUI_INICIO {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_INICIO window = new GUI_INICIO();
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
	public GUI_INICIO() {
		initialize();
	}
	
;	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(155, 155, 155));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton BtnGol = new JButton("");
		BtnGol.setIcon(new ImageIcon("C:\\Users\\Alan\\Pictures\\gol-logo.png"));
		BtnGol.setForeground(new Color(128, 128, 128));
		BtnGol.setBackground(new Color(100, 100, 100));
		
		BtnGol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1 = new JFrame();
				GUI_EMPRESAS gui = new GUI_EMPRESAS();
				gui.frame.setVisible(true);
				frame.dispose();
			}
		});
		BtnGol.setBounds(110, 11, 191, 53);
		panel.add(BtnGol);
		
		JButton BtnAzul = new JButton("");
		BtnAzul.setBackground(new Color(100, 100, 100));
		BtnAzul.setIcon(new ImageIcon("C:\\Users\\Alan\\Pictures\\azul-logo.png"));
		BtnAzul.setBounds(110, 139, 191, 53);
		panel.add(BtnAzul);
		
		JButton BtnLatam = new JButton("");
		BtnLatam.setBackground(new Color(100, 100, 100));
		BtnLatam.setIcon(new ImageIcon("C:\\Users\\Alan\\Pictures\\latam-logo.png"));
		BtnLatam.setBounds(110, 75, 191, 53);
		panel.add(BtnLatam);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
