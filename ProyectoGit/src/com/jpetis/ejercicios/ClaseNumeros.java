/**3) HACER UN M�TODO QUE DADO UN N�MERO, DIGA SI ES PAR O NO
 * 
 */
package com.jpetis.ejercicios;

/**
 * @author Jaime Gpetis
 *
 */

public class ClaseNumeros {
	//CREAMOS UN METODO PARA COMPROBAR SI EL N�MERO QUE NOS PASAN
	//DESDE LA CLASE -MainNumeros- ES PAR O IMPAR
	public String parOImpar(int num) {
			if (num%2==0) {
				return "par";
			}
		return "impar";
		}
	}
