/**
 * 
 */
package com.jpetis.evaluacion.primera;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jaime Gpetis
 *
 */
public class RegionesDAO {
		private static ArrayList<RegionesDTO> lista_regiones;
		
	private static RegionesDTO instaciarObjeto(ResultSet rs) throws SQLException{
		RegionesDTO region = null;
		int region_id = rs.getInt(1);
		String region_name = rs.getString(2);
		
		region = new RegionesDTO(region_id,region_name);
		return region;
		
	}
	public static List<RegionesDTO> obtenerRegiones (){
		Connection conn;
		Statement stmt;
		ResultSet rs;
		RegionesDTO region;
		try {
			conn = Conexiones.obtenerConexion();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(InstruccionesSQL.CONSULTAR_TODAS);
			lista_regiones = new ArrayList<RegionesDTO>();
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		return null;
		
	}
}

