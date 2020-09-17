package br.com.roman.pontodeequilibrio.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection recuperarConexao() throws SQLException {
		return DriverManager.
				getConnection("jdbc:mysql://localhost/ponto_de_equilibrio?useTimezone=true&serverTimezone=UTC",
						"root","admin123");
		
	
	}
}
