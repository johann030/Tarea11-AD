package tarea11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarAlumnoFicheros{
	public void guardar() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("alumnos.txt"));
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
