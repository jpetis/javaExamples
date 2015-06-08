/**
 * 
 */
package com.jpetis.evaluacion.primera;


import java.util.List;

/**
 * @author Jaime Gpetis
 *
 */
public class MainRegionesDAO {
	public static void main(String[] args) {
		try {
			 List<RegionesDTO> lista_regiones = RegionesDAO.obtenerRegiones();
				System.out.println(lista_regiones);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al recuperar la lista de empleados de la base de datos");
		}
	
	}

}
