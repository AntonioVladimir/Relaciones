package relaciones;

public class Asignatura {
	String nombre = null;
	int horas = 0;
	private Profesor profesor;

	@SuppressWarnings("unused")
	private void serImpartida() {

	}

	@SuppressWarnings("unused")
	private void darCodigoLibroDigital() {

	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
}
