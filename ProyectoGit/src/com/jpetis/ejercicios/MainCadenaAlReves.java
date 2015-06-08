/**6) HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS
 * 
 */
package com.jpetis.ejercicios;

/**
 * @author Jaime Gpetis
 * 
 */
public class MainCadenaAlReves {
   /**
    * @param metodo main
    * */
	public static void main(String[] args) {
		//CREO UNA VAIABLE A LA QUE LLAMO CADENA PARA PASARSELA POSTERIORMENTE
		//AL METODO DE LA CLASE -ClaseCadenaAlReves-
		String cadena = "abcde";
		//CREO UN OBJETO DE LA CLASE -ClaseCadenaAlReves-
		ClaseCadenaAlReves cr = new ClaseCadenaAlReves();
		//ASIGNO A LA VARIABLE -cadena- QUE ME CREE AL PRINCIPIO
		//EL VALOR RESULTANTE DE CARGAR EN EL OBJETO -cr-
		//DE LA CLASE -ClaseCadenaAlReves- 
		//EL METODO -cadenaAlReves- DE LA MISMA CLASE -ClaseCadenaAlReves- 
		//Y LE PASO LA -cadena-
		cadena = cr.cadenaAlReves(cadena);
		//MUESTRO EL RESULTADO 
		//QUE RECIBO DE LA EJECUCIÓN DEL METODO-cadenaAlReves-
		System.out.println(cadena);
	}
}
