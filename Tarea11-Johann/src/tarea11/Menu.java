package tarea11;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	ConectarBaseDatos cbd = new ConectarBaseDatos();

	public void menu() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("1. Insertar nuevo alumno");
		System.out.println("2. Mostrar alumnos");
		System.out.println("3. Guardar alumnos en un fichero");
		System.out.println("4. Guardar en la BD los alumnos del fichero");
		System.out.println("5. Modificar nombre en la base de datos");
		System.out.println("6. Eliminar un alumno a partir de su PK");
		System.out.println("7. Eliminar un alumno a partir de su apellido");
		System.out.println("8. Guardar alumnos en fichero XML o JSON");
		System.out.println("9. Guardar en la BD los alumnos del fichero XML o JSON");
		System.out.println("----------------------------------------------------------------");
		int num = sc.nextInt();
		switch (num) {
		case 1: {
			
		}
		case 2: {

		}
		case 3: {

		}
		case 4: {

		}
		case 5: {

		}
		case 6: {

		}
		case 7: {

		}
		case 8: {

		}
		case 9: {

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
	}
}