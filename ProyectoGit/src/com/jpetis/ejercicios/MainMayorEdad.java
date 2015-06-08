/**4) HACER UN MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE EDAD O NO
 * 
 */
package com.jpetis.ejercicios;

/**
 * @author Jaime Gpetis
 *
 */
public class MainMayorEdad {
	/**
	 * @category meted main
	 * */
	public static void main(String[] args) {
		//CREO UNA VARIABLE QUE REFIERE Y GUADA LA EDAD DE UN SUPUESTO USUARIO -int user = 16 -
		int edadUsuario = 18;
		//CREO UN OBJETO DE LA CLASE -ClasePedirEdad clasePedirEdad-  
		ClasePedirEdad clasePedirEdad = new ClasePedirEdad();
		//LLAMO ATRAVES DEL OBJETO AL METODO DE LA CLASE -ClasePedirEdad- Y LE PASO LA EDAD DEL USUARIO
		//LO MUESTRO
		System.out.println(clasePedirEdad.mayorOmenorEdad(edadUsuario));
		
	}

}
