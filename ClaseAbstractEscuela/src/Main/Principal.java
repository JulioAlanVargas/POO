package Main;

import java.util.Scanner;

import Implementacion.Implementacion;
import Model.Alumno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreE;
		long claveEscolarE;
		int numAlumnosE;

		String nomAlumno;
		String carrera;

		Alumno alumno;
		Scanner lectura = null;
		int menuP, menuAlumno, indice, subMenu;

		// Instancia de clase
		Implementacion imp = new Implementacion();

		do {
			System.out.println("MENU DE PRINCIPAL");
			System.out.println("1.-----Crud Alumno");
			System.out.println("2.-----Salir");
			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {
			case 1:
				do {
					System.out.println("CRUD ALUMNOS");
					System.out.println("1--- ALTA");
					System.out.println("2--- BUSCAR ");
					System.out.println("3--- EDITAR ");
					System.out.println("4--- ELIMINAR ");
					System.out.println("5--- LISTAR");
					System.out.println("6--- MENU PRINCIPAL");
					lectura = new Scanner(System.in);
					menuAlumno = lectura.nextInt();

					switch (menuAlumno) {
					case 1:						
						
						System.out.println("Ingrese el nombre de la Escuela");
						lectura = new Scanner(System.in);
						nombreE = lectura.nextLine();

						System.out.println("Ingrese la clavae escolar");
						lectura = new Scanner(System.in);
						claveEscolarE = lectura.nextLong();

						System.out.println("Ingrese el numero de almunos");
						lectura = new Scanner(System.in);
						numAlumnosE = lectura.nextInt();

						System.out.println("Ingrese el nombre del alumno");
						lectura = new Scanner(System.in);
						nomAlumno = lectura.nextLine();

						System.out.println("Ingrese la carrera del alumno");
						lectura = new Scanner(System.in);
						carrera = lectura.nextLine();

						// GUARDAR
						alumno = new Alumno(nombreE, claveEscolarE, numAlumnosE, nomAlumno, carrera);
						imp.guardar(alumno);
						System.out.println("Se guardo correctamente");
						break;

					case 2:
						imp.indiceDescrip();
						System.out.println("\ningrese el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Buscar
						alumno= (Alumno) imp.buscar(indice);
						System.out.println("Se encontro el " + alumno);

						break;
					case 3:
						imp.indiceDescrip();
						System.out.println("\ningrese el indice a editar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Buscar
						alumno= (Alumno) imp.buscar(indice);
						System.out.println("Se encontro el " + alumno + " a editar");

						do {
							System.out.println("Submenu de editar");
							System.out.println("1.----Nombre  de la escuela");
							System.out.println("2.----Numero de alumnos");
							System.out.println("3.--- Regresar al menu principal");
							lectura = new Scanner(System.in);
							subMenu = lectura.nextInt();
							switch (subMenu) {
							case 1:
								System.out.println("Ingrese el nuevo nombre");
								lectura = new Scanner(System.in);
								nomAlumno = lectura.nextLine();

								// EDITAR
								alumno.setNombre(nomAlumno);
								imp.editar(indice, alumno);

								System.out.println("Se edito correctamente");

								break;

							case 2:
								System.out.println("Ingrese el numero correcto de alumnos");
								lectura = new Scanner(System.in);
								numAlumnosE = lectura.nextInt();

								// EDITAR
								alumno.setNumAlumnos(numAlumnosE);
								imp.editar(indice, alumno);

								System.out.println("Se edito correctamente");
								break;
							case 3:

								break;
							}

						} while (subMenu < 3);
						break;
					case 4:
						imp.indiceDescrip();
						System.out.println("\ningrese el indice a eliminar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Eliminar
						imp.eliminar(indice);
						System.out.println("Se elimino");
						break;
					case 5:
						imp.listar();

						break;
					case 6:

						break;
					}
				} while (menuAlumno < 6);
				break;

			case 2:

				break;
			}
		} while (menuP < 2);
	}

}
