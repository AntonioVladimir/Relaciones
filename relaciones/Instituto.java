package relaciones;

public class Instituto {
	// Atributos
	String nombre = null;
	String localizacion = null;
	private Director director;

	// Metodos
	public int ObttenerPlazasDisponibles() {
		return 0;
	}

	@SuppressWarnings("unused")
	private int ConsultarPrecio() {
		return 0;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
}
