/**
 * 
 */
package com.jpetis.cajonsastre;

/**
 * @author Jaime Gpetis
 *
 */
public class Triangulo {
	public static void main(String[] args) {
		String string = "1234567890";
		String trianguloIzq = "";
		for (int i = string.length()-1; i >= 0; i--) {
			trianguloIzq = trianguloIzq+string.charAt(i);
			System.out.println(trianguloIzq);
		}
	}
}

