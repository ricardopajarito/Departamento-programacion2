package Dep;

public class Empleado extends Persona{

	protected String codEmpleado;
	protected String horasExtra;
	protected String fechaIngreso;
	protected String area;
	protected String cargo;
	Empleado(){}
	public Empleado(String dNI, String nombre, String apellidos, String fechaNacimiento, String direccion,
			String ciudadProcedencia, String codEmpleado, String horasExtra, String fechaIngreso, String area,
			String cargo) {
		super(dNI, nombre, apellidos, fechaNacimiento, direccion, ciudadProcedencia);
		this.codEmpleado = codEmpleado;
		this.horasExtra = horasExtra;
		this.fechaIngreso = fechaIngreso;
		this.area = area;
		this.cargo = cargo;
	}
	
	public String getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public String getHorasExtra() {
		return horasExtra;
	}
	public void setHorasExtra(String horasExtra) {
		this.horasExtra = horasExtra;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString(){
		return String.format("Empleado %s\nCodigoEmpleado: %s\n"
				+ "Horas Extra: %s\nFecha Ingreso: %s\nArea: %s,"
				+ "Cargo: %s\n"
				,super.toString(),this.getCodEmpleado(),
				this.getHorasExtra(),this.getFechaIngreso(),
				this.getArea(),this.getCargo());
	}
	@Override
	public void Registrar(){
		super.Registrar();
		this.setCodEmpleado(entrada.next());
		this.setHorasExtra(entrada.next());
		this.setFechaIngreso(entrada.next());
		this.setArea(entrada.next());
		this.setCargo(entrada.next());
	}
}
