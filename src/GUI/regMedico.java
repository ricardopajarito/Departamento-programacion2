package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Dep.EmpleadoEventual;
import Dep.Medico;

import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class regMedico extends JFrame {

	public static LinkedList contenedor=new LinkedList();
	private JPanel contentPane;
	private JTextField txt_DNI;
	private JTextField txt_Nombre;
	private JTextField txt_Apellidos;
	private JTextField txt_FechaNacimiento;
	private JTextField txt_Direccion;
	private JTextField txt_Procedencia;
	private JTextField txt_Codigo;
	private JTextField txt_HorasExtra;
	private JTextField txt_FechaIngreso;
	private JTextField txt_Area;
	private JTextField txt_Cargo;
	private JTextField txt_Mensual;
	private JTextField txt_perAdd;
	private JTextField txt_Especialidad;
	private JTextField txt_Servicio;
	private JTextField txt_Consultorio;


	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regMedico frame = new regMedico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 */
	public regMedico() {
		setTitle("Registrar Médico");
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
		
		txt_Direccion = new JTextField();
		txt_Direccion.setBounds(99, 191, 116, 22);
		contentPane.add(txt_Direccion);
		txt_Direccion.setColumns(10);
		
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
		
		txt_Codigo = new JTextField();
		txt_Codigo.setBounds(140, 261, 75, 22);
		contentPane.add(txt_Codigo);
		txt_Codigo.setColumns(10);
		
		JLabel lblCodigoEmpleado = new JLabel("Codigo Empleado");
		lblCodigoEmpleado.setBounds(7, 264, 99, 22);
		contentPane.add(lblCodigoEmpleado);
		
		JButton botonRegistrar = new JButton("Registrar");
		botonRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String DNI=txt_DNI.getText();
				String Nombre=txt_Nombre.getText();
				String Apellidos=txt_Apellidos.getText();
				String FechaNaci=txt_FechaNacimiento.getText();
				String Direccion=txt_Direccion.getText();
				String Ciudad=txt_Procedencia.getText();
				String Codigo=txt_Codigo.getText();
				String horasExtra=txt_HorasExtra.getText();
				String FechaIngreso=txt_FechaIngreso.getText();
				String Area=txt_Area.getText();
				String Cargo=txt_Cargo.getText();
				String Salario=txt_Mensual.getText();
				String Porcentaje=txt_perAdd.getText();
				String Especialidad=txt_Especialidad.getText();
				String Servicio=txt_Servicio.getText();
				String Consultorio=txt_Consultorio.getText();
				Medico medicos=new Medico(DNI,Nombre, Apellidos, FechaNaci, Direccion,
						Ciudad,Codigo, horasExtra, FechaIngreso, Area,
						Cargo, Salario, Porcentaje, Especialidad,Servicio,Consultorio);
				contenedor.add(medicos);
				txt_DNI.setText("");
				txt_Nombre.setText("");
				txt_Apellidos.setText("");
				txt_FechaNacimiento.setText("");
				txt_Direccion.setText("");
				txt_Procedencia.setText("");
				txt_Codigo.setText("");
				txt_HorasExtra.setText("");
				txt_FechaIngreso.setText("");
				txt_Area.setText("");
				txt_Cargo.setText("");
				txt_Mensual.setText("");
				txt_perAdd.setText("");
				txt_Especialidad.setText("");
				txt_Servicio.setText("");
				txt_Consultorio.setText("");

			}
		});
		botonRegistrar.setBounds(227, 190, 97, 25);
		contentPane.add(botonRegistrar);
		
		final Primera regresar=new Primera();
		JButton btnRegresarAlMen = new JButton("Regresar al men\u00FA principal");
		btnRegresarAlMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				regresar.setVisible(true);
				dispose();
			}
		});
		btnRegresarAlMen.setBounds(268, 295, 237, 25);
		contentPane.add(btnRegresarAlMen);
		
		JLabel labelHorasExtra = new JLabel("Horas Extra");
		labelHorasExtra.setBounds(227, 54, 66, 16);
		contentPane.add(labelHorasExtra);
		
		txt_HorasExtra = new JTextField();
		txt_HorasExtra.setBounds(305, 51, 56, 22);
		contentPane.add(txt_HorasExtra);
		txt_HorasExtra.setColumns(10);
		
		JLabel labelFechaIngreso = new JLabel("Fecha Ingreso");
		labelFechaIngreso.setBounds(7, 13, 81, 16);
		contentPane.add(labelFechaIngreso);
		
		txt_FechaIngreso = new JTextField();
		txt_FechaIngreso.setBounds(99, 10, 116, 22);
		contentPane.add(txt_FechaIngreso);
		txt_FechaIngreso.setColumns(10);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setBounds(227, 13, 34, 16);
		contentPane.add(lblArea);
		
		txt_Area = new JTextField();
		txt_Area.setBounds(267, 10, 81, 22);
		contentPane.add(txt_Area);
		txt_Area.setColumns(10);
		
		JLabel labelCargo = new JLabel("Cargo");
		labelCargo.setBounds(358, 13, 56, 16);
		contentPane.add(labelCargo);
		
		txt_Cargo = new JTextField();
		txt_Cargo.setBounds(408, 10, 116, 22);
		contentPane.add(txt_Cargo);
		txt_Cargo.setColumns(10);
		
		JLabel labelSalarioMensual = new JLabel("Salario Mensual");
		labelSalarioMensual.setBounds(7, 299, 99, 16);
		contentPane.add(labelSalarioMensual);
		
		txt_Mensual = new JTextField();
		txt_Mensual.setBounds(99, 296, 116, 22);
		contentPane.add(txt_Mensual);
		txt_Mensual.setColumns(10);
		
		txt_perAdd = new JTextField();
		txt_perAdd.setBounds(475, 51, 49, 22);
		contentPane.add(txt_perAdd);
		txt_perAdd.setColumns(10);
		
		JLabel lblAdicional = new JLabel("% Adicional");
		lblAdicional.setBounds(384, 54, 79, 16);
		contentPane.add(lblAdicional);
		
		JLabel labelEspecialidad = new JLabel("Especialidad");
		labelEspecialidad.setBounds(227, 89, 75, 16);
		contentPane.add(labelEspecialidad);
		
		txt_Especialidad = new JTextField();
		txt_Especialidad.setBounds(315, 86, 116, 22);
		contentPane.add(txt_Especialidad);
		txt_Especialidad.setColumns(10);
		
		JLabel labelServicio = new JLabel("Servicio");
		labelServicio.setBounds(227, 124, 56, 16);
		contentPane.add(labelServicio);
		
		txt_Servicio = new JTextField();
		txt_Servicio.setBounds(283, 121, 116, 22);
		contentPane.add(txt_Servicio);
		txt_Servicio.setColumns(10);
		
		JLabel labelNConsultorio = new JLabel("N\u00B0 Consultorio");
		labelNConsultorio.setBounds(227, 159, 108, 16);
		contentPane.add(labelNConsultorio);
		
		txt_Consultorio = new JTextField();
		txt_Consultorio.setBounds(347, 156, 116, 22);
		contentPane.add(txt_Consultorio);
		txt_Consultorio.setColumns(10);
	}

}
