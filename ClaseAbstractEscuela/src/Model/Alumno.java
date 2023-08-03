package Model;

public class Alumno extends Escuelas{
	String nomAlumno;
	String carrera;
	public Alumno() {
		super();
	}
	public Alumno(String nombre, long claveEscolar, int numAlumnos, String nomAlumno, String carrera) {
		super(nombre, claveEscolar, numAlumnos);
		this.nomAlumno = nomAlumno;
		this.carrera = carrera;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", claveEscolar=" + claveEscolar + ", numAlumnos=" + numAlumnos
				+ ", nomAlumno=" + nomAlumno + ", carrera=" + carrera + "]";
	}
	
}
