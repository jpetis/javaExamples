/**
 * 
 */
package com.jpetis.ejercicios;

/**
 * @author Jaime Gpetis
 *
 */
public class MiError extends RuntimeException{
	/**
	 *@category constructor empty  
	 */
	public MiError() {
		super("!! ya me ha fallado");
	}
	public MiError(String mensaje){
		super(mensaje);
	}
}
