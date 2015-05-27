/**
 * 
 */
package com.jpetis.arrays;

import java.util.Vector;

/**
 * @author Jaime Gpetis
 *
 */
public class MainArrays {
	public static void main(String[] args) {
		
		/**ARRAY DE NÚMEROS ENTEROS CON UN SOLO INDICE DESDE ELEMENTO[0]A ELEMENTO VECTOR[3]*/
		
		//DECLARO UN OBJETO DE LA CLASE -Arrays- CON EL CONSTRUCTO VACIO POR DEFECTO
		Arrays arrays = new Arrays();
		//CREO UN NUEVO -Array de tipo int- (int vector[]) Y LE PASO EL METODO -arrays.arrayTipoInt()-
		//ATRAVES DEL OBJETO QUE ME ACABO DE CREAR
		int vector[] =arrays.arrayTipoInt();
		//RECORRO EL -Array- (vector[]) MEDIANTE UN -foreach-
		for (int i : vector) {
			//LO MUESTRO, EL CUAL POR SUPUSTO NO TIENE VALORES YA QUE NO LO HE RRELLENADO SINO SOLO CREADO
			//Y ASIGNADO EL ESPACIO QUE OCUPARA. EN ESTE CASO TRES NUMEROS ENTEROS.
			System.out.println(i);
			}
			//SALIDA EN CONSOLA
			/**0
			 * 0
			 * 0*/
		
		
		/**ARRAY DE VARIABLE TIPO BOOLEAM CON UN SOLO ÍNDICE DESDE -RESULTADOS[0]A ELEMENTO RESULTADOS[3]*/
			
			//DECLARO UN OBJETO DE LA CLASE -Arrays- CON EL CONSTRUCTO VACIO POR DEFECTO
			Arrays arrays_boolean = new Arrays();
			//CREO UN NUEVO -Array de tipo boolean- (boolean vector_boolean[]) Y LE PASO EL METODO
			//-arrays_boolean.arrayTipoBoolean()-- ATRAVES DEL OBJETO QUE ME ACABO DE CREAR
			boolean vector_boolean[] =arrays_boolean.arrayTipoBoolean();
			//RECORRO EL -Array- (vector_boolean[]) MEDIANTE UN -foreach-
			for (boolean j : vector_boolean) {
				//LO MUESTRO, EL CUAL POR SUPUSTO NO TIENE VALORES YA QUE NO LO HE RRELLENADO SINO SOLO CREADO
				//Y ASIGNADO EL ESPACIO QUE OCUPARA. EN ESTE CASO TRES BOOLEANOS A FALSO POR DEFECTO.
				System.out.println(j);
			}
			//SALIDA EN CONSOLA	
			/**falso
			 * falso
			 * falso
			 * */	
		
	}
}
