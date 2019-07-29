package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dep.Cita;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class regCita extends JFrame {

	public static LinkedList contenedorCita=new LinkedList();
	private JPanel contentPane;
	private JTextField txt_DNI;
	private JTextField txt_Nombre;
	private JTextField txt_Apellidos;
	private JTextField txt_Historia;
	private JTextField txt_Fecha;
	private JTextField txt_Codigo;
	private JTextField txt_Servicio;
	private ButtonGroup botones=new ButtonGroup();
	public regCita() {
		setTitle("Cita M\u00E9dica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonRegresar = new JButton("Regresar al men\u00FA");
		botonRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Primera regresar=new Primera();
				regresar.setVisible(true);
				dispose();
			}
		});
		botonRegresar.setBounds(343, 315, 153, 25);
		contentPane.add(botonRegresar);
		
		JLabel labelDNI = new JLabel("DNI");
		labelDNI.setBounds(28, 35, 56, 16);
		contentPane.add(labelDNI);
		
		txt_DNI = new JTextField();
		txt_DNI.setBounds(101, 32, 116, 22);
		contentPane.add(txt_DNI);
		txt_DNI.setColumns(10);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(28, 84, 56, 16);
		contentPane.add(labelNombre);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(101, 81, 116, 22);
		contentPane.add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		JLabel labelApellidos = new JLabel("Apellidos");
		labelApellidos.setBounds(28, 135, 56, 16);
		contentPane.add(labelApellidos);
		
		txt_Apellidos = new JTextField();
		txt_Apellidos.setBounds(101, 132, 116, 22);
		contentPane.add(txt_Apellidos);
		txt_Apellidos.setColumns(10);
		
		JLabel labelSexo = new JLabel("sexo");
		labelSexo.setBounds(28, 183, 56, 16);
		contentPane.add(labelSexo);
		
		final JRadioButton botonMasculino = new JRadioButton("Masculino");
		botonMasculino.setBounds(101, 163, 127, 25);
		contentPane.add(botonMasculino);
		
		final JRadioButton botonFemenino = new JRadioButton("Femenino");
		botonFemenino.setBounds(101, 193, 127, 25);
		contentPane.add(botonFemenino);
		
		botones.add(botonMasculino);
		botones.add(botonFemenino);
		
		JLabel labelHistoria = new JLabel("N\u00B0 Historia Clinica");
		labelHistoria.setBounds(250, 35, 102, 16);
		contentPane.add(labelHistoria);
		
		txt_Historia = new JTextField();
		txt_Historia.setBounds(364, 32, 116, 22);
		contentPane.add(txt_Historia);
		txt_Historia.setColumns(10);
		
		JLabel labelFecha = new JLabel("Fecha");
		labelFecha.setBounds(250, 84, 56, 16);
		contentPane.add(labelFecha);
		
		txt_Fecha = new JTextField();
		txt_Fecha.setBounds(364, 81, 116, 22);
		contentPane.add(txt_Fecha);
		txt_Fecha.setColumns(10);
		
		JLabel labelCodigo = new JLabel("Codigo M\u00E9dico");
		labelCodigo.setBounds(250, 135, 116, 16);
		contentPane.add(labelCodigo);
		
		txt_Codigo = new JTextField();
		txt_Codigo.setBounds(364, 132, 116, 22);
		contentPane.add(txt_Codigo);
		txt_Codigo.setColumns(10);
		
		JLabel labelServicio = new JLabel("Tipo de Servicio");
		labelServicio.setBounds(250, 183, 116, 16);
		contentPane.add(labelServicio);
		
		txt_Servicio = new JTextField();
		txt_Servicio.setBounds(364, 180, 116, 22);
		contentPane.add(txt_Servicio);
		txt_Servicio.setColumns(10);
		
		JButton botonRegistrar = new JButton("Registrar");
		botonRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sexo;
				if(botonMasculino.isSelected()){
					sexo="Masculino";
				}else{
					if(botonFemenino.isSelected()){
						sexo="Femenino";
					}else{
						sexo="No definido";
					}
				}
				String DNI=txt_DNI.getText();
				String Nombre=txt_Nombre.getText();
				String Apellidos=txt_Apellidos.getText();
				String Historia=txt_Historia.getText();
				String Fecha=txt_Fecha.getText();
				String Codigo=txt_Codigo.getText();
				String Servicio=txt_Servicio.getText();
				Cita citas=new Cita(DNI,Nombre, Apellidos, Historia, sexo, Fecha,
						Codigo, Servicio);
				contenedorCita.add(citas);
				txt_DNI.setText("");
				txt_Nombre.setText("");
				txt_Apellidos.setText("");
				txt_Historia.setText("");
				txt_Fecha.setText("");
				txt_Codigo.setText("");
				txt_Servicio.setText("");


			}
		});
		botonRegistrar.setBounds(250, 230, 97, 25);
		contentPane.add(botonRegistrar);
	}

}
