
/**3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO
 * 
 */
package com.jpetis.ejercicios;

/**
 * @author Jaime Gpetis
 *
 */

public class MainNumeros {
	/**
	 * @category meted main
	 * */
	public static void main(String[] args) {
		//CREAMOS UNA VARIABLE DE REFERENCIA LA CUAL SE LA PASAMOS AL METODO -parOImpar
		int num = 11;
		//CREAMOS UN OBJETO DE LA CLASE -ClaseNumeros claseNumeros-
		ClaseNumeros claseNumeros = new ClaseNumeros();
		//MOSTRAMOS EL RESULTADO PASANDOLE EL NUMERO -num- 
		//ATRAVES DEL OBJETO -claseNumeros- LLAMANDO AL METODO -parOImpar(num)
		System.out.println(claseNumeros.parOImpar(num));	
	}

}
