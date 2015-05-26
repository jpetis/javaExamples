/**
 * 
 */
package com.jpetis.arrays;

/**
 * @author Jaime Gpetis
 *
 */
public class Arrays {
	/**AQUI, A NIVEL DE CLASE SE DECLARAN TODAS LAS VARIABLES Y REFERENCIAS A ARRAYS
	 *  
	 */
	int[] vector ;
	boolean[] resultados;
	//CONSTRUCTOR BACIO EL CUAL NO ES NECESARIO DECLARAR YA QUE VA IMPLICITO EN LA CLASE
	public Arrays() {
		
	}
	/**ARRAY DE NÚMEROS ENTEROS CON UN SOLO INDICE DESDE ELEMENTO[0]A ELEMENTO VECTOR[29]*/
	public int[] arrayTipoInt(){
		//AQUI SE LES DECLARA EL ESPACIO A RESERVAR
		vector = new int[30];
		return this.vector;
	}
	/**ARRAY DE VARIABLE TIPO BOOLEAM CON UN SOLO ÍNDICE DESDE -RESULTADOS[0]A ELEMENTO RESULTADOS[9]*/
	public boolean[] arrayTipoBoolean(){
		//AQUI SE LES DECLARA EL ESPACIO A RESERVAR
		resultados = new boolean[9];
		return null;
	}
	

}
