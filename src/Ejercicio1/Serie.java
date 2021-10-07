package Ejercicio1;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

public class Serie extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtIteraciones;
	private JTextField txtSerie;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Serie frame = new Serie();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Serie() {
		setTitle("Serie Fibonacci");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(321, 110, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNumero1 = new JLabel("Numero Inicial 1");
		lblNumero1.setBounds(66, 31, 105, 14);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero Inicial 2");
		lblNumero2.setBounds(66, 66, 105, 14);
		contentPane.add(lblNumero2);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(182, 28, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(181, 63, 86, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero De Iter...");
		lblNewLabel.setBounds(66, 101, 105, 14);
		contentPane.add(lblNewLabel);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(182, 98, 86, 20);
		contentPane.add(txtIteraciones);
		txtIteraciones.setColumns(10);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int varNumero1 = Integer.parseInt(txtNumero1.getText());
				int varNumero2 = Integer.parseInt(txtNumero2.getText());
				int varIteraciones = Integer.parseInt(txtIteraciones.getText());
				int i = 0;
				int suma = 0;
				String cadena = txtNumero1.getText() + " \n" + txtNumero2.getText();
				
				while(i < varIteraciones) 
				{
					suma = varNumero1 + varNumero2;
					
					varNumero1 = varNumero2;
					varNumero2 = suma;
					cadena = cadena + " \n" + suma; 
					i++;
					
				}
				txtSerie.setText(cadena);
			}
		});
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGenerar.setBounds(321, 27, 89, 23);
		contentPane.add(btnGenerar);
		
		txtSerie = new JTextField();
		txtSerie.setHorizontalAlignment(SwingConstants.LEFT);
		txtSerie.setBounds(31, 156, 368, 94);
		contentPane.add(txtSerie);
		txtSerie.setColumns(10);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSerie.setText(" ");
			}
		});
		btnLimpiar.setBounds(321, 66, 89, 23);
		contentPane.add(btnLimpiar);
	}
}
