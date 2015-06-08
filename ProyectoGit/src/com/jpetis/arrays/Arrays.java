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
	private int[] vector;
	private boolean[] resultados;
	/**
	 * @return the vector
	 */
	public int[] getVector() {
		return vector;
	}
	/**
	 * @param vector the vector to set
	 */
	public void setVector(int[] vector) {
		this.vector = vector;
	}
	/**
	 * @return the resultados
	 */
	public boolean[] getResultados() {
		return resultados;
	}
	/**
	 * @param resultados the resultados to set
	 */
	public void setResultados(boolean[] resultados) {
		this.resultados = resultados;
	}
	
	//CONSTRUCTOR DE CLASE CON PARAMETROS
	public Arrays(int[] vector) {
		this.vector = vector;
	
	}
	/**RECORREMOS EL ARRAY DE NÚMEROS ENTEROS*/
	public int[] arrayTipoInt(int[] vector){
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
		return vector;
		
	}
	/**RECORREMOS EL ARRAY DE VARIABLE TIPO BOOLEAM */
	public boolean[] arrayTipoBoolean(boolean[]resultados){
		for (int i = 0; i < resultados.length; i++) {
			System.out.println(resultados[i] + " Boleanos");
		}
		return resultados;
	}
	

}
