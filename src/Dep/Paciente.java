package Dep;

public class Paciente extends Persona{
	protected String numeroHistoria;
	protected String sexo;
	protected String gSanguineo;
	protected String medicamentos;
	Paciente(){}
	



	public Paciente(String dNI, String nombre, String apellidos, String numeroHistoria, String sexo) {
		super(dNI, nombre, apellidos);
		this.numeroHistoria = numeroHistoria;
		this.sexo = sexo;
	}




	public Paciente(String dNI, String nombre, String apellidos, String fechaNacimiento, String direccion,
			String ciudadProcedencia, String numeroHistoria, String sexo, String gSanguineo, String medicamentos) {
		super(dNI, nombre, apellidos, fechaNacimiento, direccion, ciudadProcedencia);
		this.numeroHistoria = numeroHistoria;
		this.sexo = sexo;
		this.gSanguineo = gSanguineo;
		this.medicamentos = medicamentos;
	}

	public String getNumeroHistoria() {
		return numeroHistoria;
	}

	public void setNumeroHistoria(String numeroHistoria) {
		this.numeroHistoria = numeroHistoria;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getgSanguineo() {
		return gSanguineo;
	}

	public void setgSanguineo(String gSanguineo) {
		this.gSanguineo = gSanguineo;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	@Override
	public String toString(){
		return String.format("Paciente: %s\n Numero de Historia Clinica: %s\n"
				+ "Sexo: %s\n Grupo Sanguineo: %s\n Medicamentos: %s\n"
				,super.toString(),this.getNumeroHistoria(),this.getSexo(),
				this.getgSanguineo(),this.getMedicamentos());
	}
	@Override
	public void Registrar(){
		System.out.println("Ingrese datos del Paciente...");
		super.Registrar();
		this.setNumeroHistoria(entrada.next());
		this.setSexo(entrada.next());
		this.setgSanguineo(entrada.next());
		this.setMedicamentos(entrada.next());
	}
}
