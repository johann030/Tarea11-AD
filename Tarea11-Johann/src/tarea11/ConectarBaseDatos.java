package tarea11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConectarBaseDatos {
	private Connection conexion;
	private Statement sentencia;
	private ResultSet resultado;
	private String sql;
	Scanner sc = new Scanner(System.in);

	public void conexion() {
		String url = "jdbc:mysql://localhost/johann06";
		String usuario = "johann";
		String contrasenia = "manager";
		try {
			// Cargar driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establecer la conexion
			conexion = DriverManager.getConnection(url, usuario, contrasenia);

			// Liberar
			conexion.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public void insertarAlumnos() {
		InsertarAlumnos IA = new InsertarAlumnos();

		sql = "insert into alumno values(" + IA.toString() + ")";
		try {
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void eliminarPK() {
		// TODO
		try {
			String PK = sc.nextLine();
			sql = "delete from alumno where nombre = '" + PK + "'";
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarApellido() {
		try {
			String apellido = sc.nextLine();
			sql = "delete from alumno where nombre LIKE '%" + apellido + "%'";
			sentencia = conexion.createStatement();
			resultado = sentencia.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}