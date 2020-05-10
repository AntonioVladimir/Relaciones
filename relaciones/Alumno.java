package relaciones;

public class Alumno {
	String nombre = null;
	int edad = 0;
	private String dni = null;

	public int recibirNota() {
		return edad;
	}

	@SuppressWarnings("unused")
	private void hacerDeberes() {

	}

	@SuppressWarnings("unused")
	private void cursarCurso() {
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
