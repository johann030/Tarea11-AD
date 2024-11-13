package tarea11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccederBaseDatos {

	public void crearAcceso() {
		String url = "jdbc:mysql://localhost/";
		String usuario = "johann";
		String contrasenia = "manager";
		try {
			// Cargar driver
			Class.forName("com.mysql.jdbc.Driver");

			// Establecer la conexion
			Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);

			// Preparar las sentencias
			Statement sentencia = conexion.createStatement();
			String sql = "SELECT * FROM alumnos";
			ResultSet resultado = sentencia.executeQuery(sql);

			// Recorrer el resultado para visualiar cada fila
			while (resultado.next()) {
				System.out.println(resultado.getString(1));
			}

			// Liberar
			resultado.close();
			sentencia.close();
			conexion.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
