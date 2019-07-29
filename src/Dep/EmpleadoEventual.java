package Dep;

public class EmpleadoEventual extends Empleado{
	protected String honorariosHora;
	protected String horasNormales;//normales mas extras
	protected String fechaFinal;
	EmpleadoEventual(){}
	public EmpleadoEventual(String dNI, String nombre, String apellidos, String fechaNacimiento, String direccion,
			String ciudadProcedencia, String codEmpleado, String horasExtra, String fechaIngreso, String area,
			String cargo, String honorariosHora, String horasNormales, String fechaFinal) {
		super(dNI, nombre, apellidos, fechaNacimiento, direccion, ciudadProcedencia, codEmpleado, horasExtra,
				fechaIngreso, area, cargo);
		this.honorariosHora = honorariosHora;
		this.horasNormales = horasNormales;
		this.fechaFinal = fechaFinal;
	}

	public int obtenerHorasTotales(){
		return 0;//obtenerHorasNormales()+super.obtenerHorasExtra();
	}

	public String getHonorariosHora() {
		return honorariosHora;
	}
	public void setHonorariosHora(String honorariosHora) {
		this.honorariosHora = honorariosHora;
	}
	public String getHorasNormales() {
		return horasNormales;
	}
	public void setHorasNormales(String horasNormales) {
		this.horasNormales = horasNormales;
	}
	public String getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	@Override
	public String toString(){
		return String.format("Empleado eventual: %s\n Honorario: %s\n"
				+ "Horas Totales: %s\n Fecha Final: %s\n"
				,super.toString(),this.getHonorariosHora(),
				this.obtenerHorasTotales(),this.getFechaFinal());
	}
	@Override
	public void Registrar(){
		System.out.println("Ingrese datos del Empleado Eventual...");
		super.Registrar();
		this.setHonorariosHora(entrada.next());
		this.setHorasNormales(entrada.next());
		this.setFechaFinal(entrada.next());
	}

}
