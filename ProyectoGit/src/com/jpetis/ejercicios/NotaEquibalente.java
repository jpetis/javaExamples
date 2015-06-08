/**
 * 
 */
package com.jpetis.ejercicios;



/**
 * @author Jaime Gpetis
 * 
 */
public enum NotaEquibalente {
	SOBRESALIENTE, NOTABLE, BIEN, SUFICIENTE, INSUFICIENTE, MUYDEFICIENTE;

	public static NotaEquibalente equivalenciaNota(int nota)
			throws NotaException {
		NotaEquibalente devuelta = null;
		
		switch (nota) {
		case 10:
			devuelta = NotaEquibalente.SOBRESALIENTE;
			break;
		case 9:
		case 8:
			devuelta = NotaEquibalente.NOTABLE;
			break;
		case 7:
		case 6:
			devuelta = NotaEquibalente.BIEN;
			break;
		case 5:
			devuelta = NotaEquibalente.SUFICIENTE;
			break;
		case 4:
		case 3:
			devuelta = NotaEquibalente.INSUFICIENTE;
			break;
		case 2:
		case 1:
		case 0:
			devuelta = NotaEquibalente.MUYDEFICIENTE;
			break;
		default:
			throw new NotaException();

		}
		return devuelta;

	}
}
