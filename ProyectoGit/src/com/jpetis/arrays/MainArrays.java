/**
 * 
 */
package com.jpetis.arrays;

import java.util.Scanner;
import java.util.Vector;



/**
 * @author Jaime Gpetis
 *
 */
public class MainArrays {
	public static void main(String[] args) {
		
		int[]vector = null ;
		boolean[]resultados = null;
		Arrays arrays = new Arrays(vector);
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducca un número: ");
		 
		int paso= sc.nextInt();
		vector = new int[paso];
		System.out.println("Introducca valores enteros: ");
		for (int i = 0; i < vector.length; i++) {
			vector[i] = sc.nextInt();
			System.out.println("Elemento nº " +  (i+1)+ " : "+vector[i]);		
		}
		arrays.arrayTipoInt(vector);
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introducca un número: ");
		
		int pasoBoolean = sc.nextInt();
		resultados = new boolean[pasoBoolean];
		System.out.println("Introducca valores boleanos: ");
		for (int i = 0; i < resultados.length; i++) {
			resultados[i] = sc.nextBoolean();
			System.out.println("Elemento nº " +  (i+1)+ " : "+ resultados[i]);
		}
		arrays.arrayTipoBoolean(resultados);
		
//		for (int i = 0; i < vector.length; i++) {
//			System.out.println(vector[i]);
//		}
//		arrays.getVector();
//		arrays.setVector(vector);
		
		
		
		
		
		
		
		
		
		
		
		
//		Arrays arrays = new Arrays(vector, resultados);
//		arrays.getVector();
//		vector[0] = 1;
//		vector[1] = 1;
//		vector[2] = 1;
//		arrays.getVector();
		
		
//		resultados[0] = false;
//		resultados[1] = true;
//		resultados[2] = false;
//		arrays.getResultados();
		
		
		
		
		
		
		
		
		
		
		/**ARRAY DE NÚMEROS ENTEROS CON UN SOLO INDICE DESDE ELEMENTO[0]A ELEMENTO VECTOR[3]*/
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
//		//DECLARO UN OBJETO DE LA CLASE -Arrays- CON EL CONSTRUCTO VACIO POR DEFECTO
//		Arrays arrays = new Arrays();
//		//CREO UN NUEVO -Array de tipo int- (int vector[]) Y LE PASO EL METODO -arrays.arrayTipoInt()-
//		//ATRAVES DEL OBJETO QUE ME ACABO DE CREAR
//		int vector[] =arrays.arrayTipoInt();
//		//RECORRO EL -Array- (vector[]) MEDIANTE UN -foreach-
//		for (int i : vector) {
//			//LO MUESTRO, EL CUAL POR SUPUSTO NO TIENE VALORES YA QUE NO LO HE RRELLENADO SINO SOLO CREADO
//			//Y ASIGNADO EL ESPACIO QUE OCUPARA. EN ESTE CASO TRES NUMEROS ENTEROS.
//			System.out.println(i);
//			}
			//SALIDA EN CONSOLA
			/**0
			 * 0
			 * 0*/
		
		
		/**ARRAY DE VARIABLE TIPO BOOLEAM CON UN SOLO ÍNDICE DESDE -RESULTADOS[0]A ELEMENTO RESULTADOS[3]*/
			
//			//DECLARO UN OBJETO DE LA CLASE -Arrays- CON EL CONSTRUCTO VACIO POR DEFECTO
//			Arrays arrays_boolean = new Arrays();
//			//CREO UN NUEVO -Array de tipo boolean- (boolean vector_boolean[]) Y LE PASO EL METODO
//			//-arrays_boolean.arrayTipoBoolean()-- ATRAVES DEL OBJETO QUE ME ACABO DE CREAR
//			boolean vector_boolean[] =arrays_boolean.arrayTipoBoolean();
//			//RECORRO EL -Array- (vector_boolean[]) MEDIANTE UN -foreach-
//			for (boolean j : vector_boolean) {
//				//LO MUESTRO, EL CUAL POR SUPUSTO NO TIENE VALORES YA QUE NO LO HE RRELLENADO SINO SOLO CREADO
//				//Y ASIGNADO EL ESPACIO QUE OCUPARA. EN ESTE CASO TRES BOOLEANOS A FALSO POR DEFECTO.
//				System.out.println(j);
//			}
			//SALIDA EN CONSOLA	
			/**falso
			 * falso
			 * falso
			 * */	
		
	}
}
