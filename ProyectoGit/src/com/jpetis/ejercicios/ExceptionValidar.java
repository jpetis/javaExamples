/**
 * 
 */
package com.jpetis.ejercicios;

/**
 * @author Jaime Gpetis
 *
 */
public class ExceptionValidar {
	/**
	 * 
	 */
	public static void esValidar(boolean valido)throws MiError {
		if(!valido)throw new MiError();
	}
	public static void esValidar(boolean valido, String mensaje)throws MiError {
		if(!valido)throw new MiError(mensaje);
	}
}
