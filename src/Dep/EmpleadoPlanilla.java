package Dep;

public class EmpleadoPlanilla extends Empleado{
	protected String salarioMensual;
	protected String porcentajeAd;
	EmpleadoPlanilla(){}
	public EmpleadoPlanilla(String dNI, String nombre, String apellidos, String fechaNacimiento, String direccion,
			String ciudadProcedencia, String codEmpleado, String horasExtra, String fechaIngreso, String area,
			String cargo, String salarioMensual, String porcentajeAd) {
		super(dNI, nombre, apellidos, fechaNacimiento, direccion, ciudadProcedencia, codEmpleado, horasExtra,
				fechaIngreso, area, cargo);
		this.salarioMensual = salarioMensual;
		this.porcentajeAd = porcentajeAd;
	}


	public String getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(String salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	public String getPorcentajeAd() {
		return porcentajeAd;
	}
	public void setPorcentajeAd(String porcentajeAd) {
		this.porcentajeAd = porcentajeAd;
	}
	@Override
	public String toString(){
		return String.format("Empleado Planilla %s\nSalario Mensual: %s\n"
				+ "Porcentaje adicional por hora extra: %s\n"
				,super.toString(),this.getSalarioMensual(),
				this.getPorcentajeAd());
	}
	@Override
	public void Registrar(){
		System.out.println("Ingrese datos del Empleado Planilla...");
		super.Registrar();
		this.setSalarioMensual(entrada.next());
		this.setPorcentajeAd(entrada.next());
	}
}
