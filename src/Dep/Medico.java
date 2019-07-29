package Dep;

public class Medico extends EmpleadoPlanilla {
	protected String Especialidad;
	protected String servicio;
	protected String numeroConsultorio;
	Medico(){}
	
	public Medico(String dNI, String nombre, String apellidos, String fechaNacimiento, String direccion,
			String ciudadProcedencia, String codEmpleado, String horasExtra, String fechaIngreso, String area,
			String cargo, String salarioMensual, String porcentajeAd, String especialidad, String servicio,
			String numeroConsultorio) {
		super(dNI, nombre, apellidos, fechaNacimiento, direccion, ciudadProcedencia, codEmpleado, horasExtra,
				fechaIngreso, area, cargo, salarioMensual, porcentajeAd);
		Especialidad = especialidad;
		this.servicio = servicio;
		this.numeroConsultorio = numeroConsultorio;
	}


	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(String numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	@Override
	public String toString(){
		return String.format("Medico %s\nEspecialidad: %s\n"
				+ "Servicio: %s\nNumero Consultorio: %s\n"
				,super.toString(),this.getEspecialidad(),
				this.getServicio(),this.getNumeroConsultorio());
	}
	@Override
	public void Registrar(){
		System.out.println("Medico");
		this.setEspecialidad(entrada.next());
		super.Registrar();
		this.setServicio(entrada.next());
		this.setNumeroConsultorio(entrada.next());
	}
	
	

}
