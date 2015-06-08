/**6) HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS
 * 
 */
package com.jpetis.ejercicios;

/**
 * @author Jaime Gpetis
 * 
 */
public class ClaseCadenaAlReves {
	/**
	 * @param constructor empty
	 */
	//CREO UN CONSTRUCTOR VACIO -SIN PARAMETROS-
	public ClaseCadenaAlReves() {

	}

	/**
	 * @param metodo type String
	 */
	//CREO UN METODO TIPO STRING Y LE PASO UNA CADENA
	public String cadenaAlReves(String cadena) {
		//DECLARO UNA VARIABLE -String-
		//PARA DEVOLVER LA CADENA QUE ME PASEN AL REVES
		String cadenaReves = "";
		//RECORRO LA CADENA QUE ME HAN PASDO DESDE EL FINAL MENOS UNO
		//Y DE ESTA MANERA LA LEEO AL REVES
		for (int i = cadena.length() - 1; i >= 0; i--) {
			//LA VOY CARGANDO EN LA VARIABLE QUE ME HE CREADO
			//UNIENDOLA POR MEDIO DE CONCATENANDOLA CON CADA CARAZTER
			//QUE VOY LEYENDO
			cadenaReves = cadenaReves + cadena.charAt(i);
		}//DEVUELVO EL RESULTADO DE LA EJECUCIÓN DEL METODO EN 
		//LA VARIABLE QUE ME CREE -String cadenaReves = "";-
		return cadenaReves;

	}
}
