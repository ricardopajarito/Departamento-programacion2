package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dep.Paciente;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class regPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField txt_DNI;
	private JTextField txt_Nombre;
	private JTextField txt_Apellidos;
	private JTextField txt_FechaNacimiento;
	private JTextField txt_direccion;
	private JTextField txt_Procedencia;
	private JTextField txt_Historia;
	private JTextField txt_gSanguineo;
	private JTextField txt_medicamentos;
	private ButtonGroup botones=new ButtonGroup();

	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regPaciente frame = new regPaciente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 */
	public regPaciente() {
		setTitle("Registrar Paciente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_DNI = new JTextField();
		txt_DNI.setBounds(99, 51, 116, 22);
		contentPane.add(txt_DNI);
		txt_DNI.setColumns(10);
		
		JLabel label_Dni = new JLabel("DNI");
		label_Dni.setBounds(7, 54, 56, 16);
		contentPane.add(label_Dni);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(99, 86, 116, 22);
		contentPane.add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(7, 89, 56, 16);
		contentPane.add(lblNombre);
		
		txt_Apellidos = new JTextField();
		txt_Apellidos.setBounds(99, 121, 116, 22);
		contentPane.add(txt_Apellidos);
		txt_Apellidos.setColumns(10);
		
		JLabel label_Apellidos = new JLabel("Apellidos");
		label_Apellidos.setBounds(7, 124, 56, 16);
		contentPane.add(label_Apellidos);
		
		txt_FechaNacimiento = new JTextField();
		txt_FechaNacimiento.setText("");
		txt_FechaNacimiento.setBounds(99, 156, 116, 22);
		contentPane.add(txt_FechaNacimiento);
		txt_FechaNacimiento.setColumns(10);
		
		JLabel label_Cumple = new JLabel("Cumple");
		label_Cumple.setBounds(7, 159, 56, 16);
		contentPane.add(label_Cumple);
		
		txt_direccion = new JTextField();
		txt_direccion.setBounds(99, 191, 116, 22);
		contentPane.add(txt_direccion);
		txt_direccion.setColumns(10);
		
		JLabel label_Direccion = new JLabel("Direccion");
		label_Direccion.setBounds(7, 194, 56, 16);
		contentPane.add(label_Direccion);
		
		txt_Procedencia = new JTextField();
		txt_Procedencia.setBounds(99, 226, 116, 22);
		contentPane.add(txt_Procedencia);
		txt_Procedencia.setColumns(10);
		
		JLabel label_Ciudad = new JLabel("Ciudad");
		label_Ciudad.setBounds(7, 229, 56, 16);
		contentPane.add(label_Ciudad);
		
		txt_Historia = new JTextField();
		txt_Historia.setBounds(99, 261, 116, 22);
		contentPane.add(txt_Historia);
		txt_Historia.setColumns(10);
		
		JLabel label_Historia = new JLabel("N\u00B0Historia");
		label_Historia.setBounds(7, 264, 75, 16);
		contentPane.add(label_Historia);
		
		final JRadioButton botonFemenino = new JRadioButton("Femenino");
		botonFemenino.setBounds(397, 47, 127, 25);
		contentPane.add(botonFemenino);
		
		final JRadioButton botonMasculino = new JRadioButton("Masculino");
		botonMasculino.setBounds(397, 101, 127, 25);
		contentPane.add(botonMasculino);
		
		botones.add(botonMasculino);
		botones.add(botonFemenino);
		
		JLabel labelSexo = new JLabel("Sexo");
		labelSexo.setBounds(327, 75, 56, 16);
		contentPane.add(labelSexo);
		
		JLabel labelGrupoSanguineo = new JLabel("Grupo Sanguineo");
		labelGrupoSanguineo.setBounds(267, 138, 116, 16);
		contentPane.add(labelGrupoSanguineo);
		
		txt_gSanguineo = new JTextField();
		txt_gSanguineo.setBounds(384, 135, 116, 22);
		contentPane.add(txt_gSanguineo);
		txt_gSanguineo.setColumns(10);
		
		txt_medicamentos = new JTextField();
		txt_medicamentos.setBounds(267, 203, 219, 22);
		contentPane.add(txt_medicamentos);
		txt_medicamentos.setColumns(10);
		
		JLabel labelMedicamentos = new JLabel("Al\u00E9rgico a medicamentos \u00BFCu\u00E1les?");
		labelMedicamentos.setBounds(284, 176, 207, 16);
		contentPane.add(labelMedicamentos);
		
		JButton botonRegistrar = new JButton("Registrar");
		botonRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sexo;
				if(botonMasculino.isSelected()){
					sexo="Masculino";
				}else {
					if(botonFemenino.isSelected()){
					sexo="Femenino";
					}
					else{
						sexo="No definido";
					}
				}
				String DNI=txt_DNI.getText();
				String Nombre=txt_Nombre.getText();
				String Apellidos=txt_Apellidos.getText();
				String Fecha=txt_FechaNacimiento.getText();
				String Direccion=txt_direccion.getText();
				String Ciudad=txt_Procedencia.getText();
				String Historia=txt_Historia.getText();
				String Grupo=txt_gSanguineo.getText();
				String Medicamentos=txt_medicamentos.getText();
				Paciente paciente=new Paciente(DNI,Nombre, Apellidos, Fecha, Direccion,
						Ciudad,Historia,sexo, Grupo, Medicamentos);

			}
		});
		botonRegistrar.setBounds(267, 238, 97, 25);
		contentPane.add(botonRegistrar);
		
		final Primera regresar=new Primera();
		JButton btnRegresarAlMen = new JButton("Regresar al men\u00FA principal");
		btnRegresarAlMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				regresar.setVisible(true);
				dispose();
			}
		});
		btnRegresarAlMen.setBounds(267, 315, 237, 25);
		contentPane.add(btnRegresarAlMen);
	}
}
