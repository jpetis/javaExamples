/**3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO
 * 
 */
package com.jpetis.ejercicios;

/**
 * @author Jaime Gpetis
 *
 */

public class ClaseNumeros {
	//CREAMOS UN METODO PARA COMPROBAR SI EL NÚMERO QUE NOS PASAN
	//DESDE LA CLASE -MainNumeros- ES PAR O IMPAR
	public String parOImpar(int num) {
			if (num%2==0) {
				return "par";
			}
		return "impar";
		}
	}
