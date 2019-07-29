package Dep;

public class Cita extends Paciente {
	protected String fecha;
	protected String codOctor;
	protected String tipoServicio;
	Cita(){}

	public Cita(String dNI, String nombre, String apellidos, String numeroHistoria, String sexo, String fecha,
			String codOctor, String tipoServicio) {
		super(dNI, nombre, apellidos, numeroHistoria, sexo);
		this.fecha = fecha;
		this.codOctor = codOctor;
		this.tipoServicio = tipoServicio;
	}

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCodOctor() {
		return codOctor;
	}
	public void setCodOctor(String codOctor) {
		this.codOctor = codOctor;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	
	
}
