package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Dep.EmpleadoEventual;

import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class regEmpleado extends JFrame {

	public static LinkedList contenedor=new LinkedList();
	private JPanel contentPane;
	protected JTextField txt_DNI;
	private JTextField txt_Nombre;
	private JTextField txt_Apellidos;
	private JTextField txt_FechaNacimiento;
	private JTextField txt_direccion;
	private JTextField txt_Procedencia;
	private JTextField txt_Codigo;
	private JTextField txt_horasExtra;
	private JTextField txt_FechaIngreso;
	private JTextField txt_area;
	private JTextField txt_Cargo;
	private JTextField txt_Honorarios;
	private JTextField txt_horasNormales;
	private JTextField txt_FechaFinal;

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regEmpleado frame = new regEmpleado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public regEmpleado() {
		setTitle("Registrar Empleado Eventual");
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
				String Direccion=txt_direccion.getText();
				String Ciudad=txt_Procedencia.getText();
				String Codigo=txt_Codigo.getText();
				String horasExtra=txt_horasExtra.getText();
				String FechaIngreso=txt_FechaIngreso.getText();
				String Area=txt_area.getText();
				String Cargo=txt_Cargo.getText();
				String Honorarios=txt_Honorarios.getText();
				String horasNormales=txt_horasNormales.getText();
				String fechaFinal=txt_FechaFinal.getText();
				EmpleadoEventual empleado=new EmpleadoEventual(DNI,Nombre, Apellidos, FechaNaci, Direccion,
						Ciudad,Codigo, horasExtra, FechaIngreso, Area,
						Cargo, Honorarios, horasNormales, fechaFinal);
				contenedor.add(empleado);
				txt_DNI.setText("");
				txt_Nombre.setText("");
				txt_Apellidos.setText("");
				txt_FechaNacimiento.setText("");
				txt_direccion.setText("");
				txt_Procedencia.setText("");
				txt_Codigo.setText("");
				txt_horasExtra.setText("");
				txt_FechaIngreso.setText("");
				txt_area.setText("");
				txt_Cargo.setText("");
				txt_Honorarios.setText("");
				txt_horasNormales.setText("");
				txt_FechaFinal.setText("");


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
		
		txt_horasExtra = new JTextField();
		txt_horasExtra.setBounds(305, 51, 56, 22);
		contentPane.add(txt_horasExtra);
		txt_horasExtra.setColumns(10);
		
		JLabel labelFechaIngreso = new JLabel("Fecha Ingreso");
		labelFechaIngreso.setBounds(7, 13, 81, 16);
		contentPane.add(labelFechaIngreso);
		
		txt_FechaIngreso = new JTextField();
		txt_FechaIngreso.setBounds(99, 10, 116, 22);
		contentPane.add(txt_FechaIngreso);
		txt_FechaIngreso.setColumns(10);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setBounds(237, 124, 34, 16);
		contentPane.add(lblArea);
		
		txt_area = new JTextField();
		txt_area.setBounds(305, 121, 97, 22);
		contentPane.add(txt_area);
		txt_area.setColumns(10);
		
		JLabel labelCargo = new JLabel("Cargo");
		labelCargo.setBounds(237, 159, 56, 16);
		contentPane.add(labelCargo);
		
		txt_Cargo = new JTextField();
		txt_Cargo.setBounds(305, 156, 116, 22);
		contentPane.add(txt_Cargo);
		txt_Cargo.setColumns(10);
		
		txt_Honorarios = new JTextField();
		txt_Honorarios.setBounds(458, 51, 62, 22);
		contentPane.add(txt_Honorarios);
		txt_Honorarios.setColumns(10);
		
		JLabel labelHonorarios = new JLabel("Honorarios");
		labelHonorarios.setBounds(384, 54, 79, 16);
		contentPane.add(labelHonorarios);
		
		JLabel labelHorasNormales = new JLabel("Horas Normales");
		labelHorasNormales.setBounds(227, 89, 121, 16);
		contentPane.add(labelHorasNormales);
		
		txt_horasNormales = new JTextField();
		txt_horasNormales.setBounds(356, 86, 75, 22);
		contentPane.add(txt_horasNormales);
		txt_horasNormales.setColumns(10);
		
		JLabel labelFechaFinal = new JLabel("Termino de Contrato");
		labelFechaFinal.setBounds(227, 13, 122, 16);
		contentPane.add(labelFechaFinal);
		
		txt_FechaFinal = new JTextField();
		txt_FechaFinal.setBounds(356, 10, 116, 22);
		contentPane.add(txt_FechaFinal);
		txt_FechaFinal.setColumns(10);
	}

}
