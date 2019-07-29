package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Primera extends JFrame {

	private JPanel contentPane;
	public Primera() {
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelRegistrar = new JLabel("Registrar");
		labelRegistrar.setFont(new Font("ZeroGirl", Font.PLAIN, 22));
		labelRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		labelRegistrar.setToolTipText("");
		labelRegistrar.setBounds(30, 66, 136, 46);
		contentPane.add(labelRegistrar);
		
		JButton botonEmpleado = new JButton("Empleado Eventual");
		botonEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				regEmpleado ventana1=new regEmpleado();
				ventana1.setVisible(true);
				dispose();
			}
		});
		botonEmpleado.setBounds(223, 29, 141, 25);
		contentPane.add(botonEmpleado);
		
		JButton botonMedico = new JButton("M\u00E9dico");
		botonMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				regMedico med=new regMedico();
				med.setVisible(true);
				dispose();
			}
		});
		botonMedico.setBounds(223, 68, 141, 25);
		contentPane.add(botonMedico);
		
		JButton botonPaciente = new JButton("Paciente");
		botonPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				regPaciente paciente=new regPaciente();
				paciente.setVisible(true);
				dispose();
			}
		});
		botonPaciente.setBounds(223, 106, 141, 25);
		contentPane.add(botonPaciente);
		
		JButton botonCita = new JButton("Cita M\u00E9dica");
		botonCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				regCita cita=new regCita();
				cita.setVisible(true);
				dispose();
			}
		});
		botonCita.setBounds(223, 144, 141, 25);
		contentPane.add(botonCita);
		
		JLabel labelImprimir = new JLabel("Imprimir");
		labelImprimir.setFont(new Font("ZeroGirl", Font.PLAIN, 22));
		labelImprimir.setHorizontalAlignment(SwingConstants.CENTER);
		labelImprimir.setToolTipText("");
		labelImprimir.setBounds(30, 260, 136, 16);
		contentPane.add(labelImprimir);
		
		JButton botonListarMedicos = new JButton("Datos de M\u00E9dicos");
		botonListarMedicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListasMedicos med=new ListasMedicos();
				med.setVisible(true);
				dispose();
			}
		});
		botonListarMedicos.setBounds(223, 234, 141, 25);
		contentPane.add(botonListarMedicos);
		
		JButton botonListarCitas = new JButton("Citas");
		botonListarCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaCitas citas=new ListaCitas();
				citas.setVisible(true);
				dispose();
			}
		});
		botonListarCitas.setBounds(223, 285, 141, 25);
		contentPane.add(botonListarCitas);
		
		JButton botonSalida = new JButton("Salir");
		botonSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		botonSalida.setBounds(423, 315, 97, 25);
		contentPane.add(botonSalida);
	}

}
