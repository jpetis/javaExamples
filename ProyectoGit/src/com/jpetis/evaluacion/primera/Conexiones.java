/**
 * 
 */
package com.jpetis.evaluacion.primera;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author Jaime Gpetis
 *
 */
public class Conexiones {
	
	private static final String RUTA_PROPERTIS = "db.properties";
	private static final String LOG4J_PROPERTIS = "log4j.properties";
	private static Logger log = Logger.getLogger("mylog");
	private static String error;
	private static String mensage = "Fichero de properties no encontrado";
	private static String conexion;
	private static String user;
	private static String pass;
	private static String driver;
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	static{
		
		Properties properties = new Properties();
		
		try {
			properties.load(new FileReader(LOG4J_PROPERTIS));
			error = properties.getProperty("log4j.appender.FICHERO.Threshold");
			properties.load(new FileReader(RUTA_PROPERTIS));
			driver = properties.getProperty("driver");
			conexion = properties.getProperty("cad_Conexion");
			user = properties.getProperty("user");
			pass = properties.getProperty("password");	
		

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			Logger.getLogger(error);
		} catch (IOException e) {
			log.entering(LOG4J_PROPERTIS, error);
			e.printStackTrace();
			log.exiting(error, conexion, LOG4J_PROPERTIS);
		}catch (ClassCastException e) {
			
		}
		
		
		
	}
	public static Connection obtenerConexion () throws SQLException
	{
		//devuelvo una nueva conexión cada vez que me lo piden
		return DriverManager.getConnection(conexion, user, pass);
	}
	public static void liberarRecursos (Connection conn, Statement stmt, ResultSet rset)
	{

		if (rset != null)   {try  {rset.close();  }catch  (Exception e)  { e.printStackTrace();  }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e1) { e1.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e2) { e2.printStackTrace(); }}
	}
	//nuevo método, sobrecarga del anterior, cuando necesitáis liberar recursos, después
		//de ejecutar una instrucción que NO es un SELECT ;)
		public static void liberarRecursos (Connection conn, Statement stmt)
		{
			if (conn != null) 	{ try { conn.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		}

}
