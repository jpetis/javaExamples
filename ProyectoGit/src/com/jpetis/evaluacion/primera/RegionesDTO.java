/**
 * 
 */
package com.jpetis.evaluacion.primera;

import java.util.List;

/**
 * @author Jaime Gpetis
 *
 */
public class RegionesDTO {
	private static int region_id;
	private static String region_name;
	private static List<RegionesDTO> lista_regiones;
	/**
	 * @param region_id
	 * @param region_name
	 */
	public RegionesDTO(int region_id, String region_name) {
		this.region_id = region_id;
		this.region_name = region_name;
	}
	/**
	 * @return the region_id
	 */
	public static int getRegion_id() {
		return region_id;
	}
	/**
	 * @param region_id the region_id to set
	 */
	public static void setRegion_id(int region_id) {
		RegionesDTO.region_id = region_id;
	}
	/**
	 * @return the region_name
	 */
	public static String getRegion_name() {
		return region_name;
	}
	/**
	 * @param region_name the region_name to set
	 */
	public static void setRegion_name(String region_name) {
		RegionesDTO.region_name = region_name;
	}
	/**
	 * @param region the region to insert 
	 * @return name region
	 */
	public static String insertarRegion(String region_name){
		
		return region_name;
		
	}
	/**
	 * @param region the region to consult 
	 * @return number to region_id
	 */
	public static int recuperarPorId(int region_id){
		
		return region_id;
		
	}
	public static List<RegionesDTO> recuperarTodas(){
		return lista_regiones;
		
	}

	


}
