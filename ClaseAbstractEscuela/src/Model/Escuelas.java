package Model;

public abstract class Escuelas {
	String nombre;
	long claveEscolar;
	int numAlumnos;
	public Escuelas() {
		super();
	}
	public Escuelas(String nombre, long claveEscolar, int numAlumnos) {
		super();
		this.nombre = nombre;
		this.claveEscolar = claveEscolar;
		this.numAlumnos = numAlumnos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getClaveEscolar() {
		return claveEscolar;
	}
	public void setClaveEscolar(long claveEscolar) {
		this.claveEscolar = claveEscolar;
	}
	public int getNumAlumnos() {
		return numAlumnos;
	}
	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
	
}
