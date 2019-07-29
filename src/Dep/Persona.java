package Dep;
import java.util.Scanner;
public class Persona implements Registro {
	static final Scanner entrada=new Scanner(System.in);
	protected String DNI;
	protected String nombre;
	protected String apellidos;
	protected String fechaNacimiento;
	protected String direccion;
	protected String ciudadProcedencia;
	Persona(){
	}
	
	public Persona(String dNI, String nombre, String apellidos) {
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Persona(String dNI, String nombre, String apellidos, String fechaNacimiento, String direccion,
			String ciudadProcedencia) {
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.ciudadProcedencia = ciudadProcedencia;
	}

	
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudadProcedencia() {
		return ciudadProcedencia;
	}

	public void setCiudadProcedencia(String ciudadProcedencia) {
		this.ciudadProcedencia = ciudadProcedencia;
	}

	@Override
	public String toString(){
		return String.format("%s %s\nDNI: %s\nFecha Nacimiento: %s\n"
				+ "Direccion: %s\nCiudad Procedencia: %s\n",getNombre(),
				getApellidos(), getDNI(),getFechaNacimiento(),
				this.getDireccion(),this.getCiudadProcedencia());
	}
	@Override
	public void Registrar(){
		setDNI(entrada.next());
		setNombre(entrada.next());
		setApellidos(entrada.next());
		setFechaNacimiento(entrada.next());
		setDireccion(entrada.next());
		setCiudadProcedencia(entrada.next());
	}
}
