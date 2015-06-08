/**4) HACER UN MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE EDAD O NO
 * 
 */
package com.jpetis.ejercicios;



/**
 * @author Jaime Gpetis
 *
 */
public class ClasePedirEdad {
	/**
	 * @category meted
	 * CREO UN METODO PARA COMPROBAR SI EL USUARIO ES MAYOR DE EDAD O NO
	 */
	
	//CREO UNA VARIABLE -final- PARA DETERMINAR UNA CONSTANTE QUE ES LA MAYORIA DE EDAD 
	private final int mayorEdad = 18;
	//CREO UN METODO PARA LA COMPROBACION DE LOS DATOS DEL USUARIO -edad- CON LA CONSTANTE - final int mayorEdad-
	public String mayorOmenorEdad(int edad) {	
		if (edad>=mayorEdad) {
			return "Mayor de edad";
		}
		return "Menor edad";
	}
}
