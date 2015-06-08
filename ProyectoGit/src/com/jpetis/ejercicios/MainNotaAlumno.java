/**
 * 
 */
package com.jpetis.ejercicios;

/**
 * @author Jaime Gpetis
 *
 */
public class MainNotaAlumno {
	public static void main(String[] args) throws Exception {
		//CREAMOS LAS VARIBLES DE REFERENCIA PARA INTRODUCIR LOS DATOS DEL USUARIO
		//LO CUAL LO PODRIAMOS HACER COMO SE EXPONE AQUI OSEA DECLARANDOLAS E INICIANDOLAS
		//O INTRODUCIENDOLAS POR EL USUARIO MEDIANTE LA CLASE -Scanner sc = new Scanner(System.in);
		//Y COGIENDO LOS DATOS INTRODUCIDOS E INGRESARLOS DIRECTAMENTE EN LA VARIABLE MEDIANTE
		//-sc.NestLine()- -sc.getNota- y demas variables..........
		int nota = 10;
		int edad = 18;
		String curso = "Geografia";
		String nombre = "Jaime";
		NotaEquibalente notaEquibalente = null;
		//CREAMOS UN OBJETO -a1- DE LA CLASE -ClaseAlumno- 
		ClaseAlumno a1 = new ClaseAlumno(nota, curso, edad, nombre, notaEquibalente );
		//LE PASAMOS LOS DATOS
		a1.getNota();
		a1.getEdad();
		a1.getCurso();
		a1.getNombre();
		a1.getNotaEquibalente();
		
		
		
		//LE PEDIMOS LAS NOTAS
		a1.setNota(nota);
		a1.setEdad(edad);
		a1.setNombre(nombre);
		a1.setCurso(curso);
		a1.setNotaEquibalente(notaEquibalente);
		
//		notaEquibalente.equivalenciaNota(nota);
		
		
		//Mostramos el alumno con suscalificaciones
		System.out.println(a1.toString());
//		System.out.println(a1.getNota()+a1.getEdad()+a1.getNombre()+a1.getCurso()+a1.getNotaEquibalente().equivalenciaNota(nota));
		
		
		
	
	}

}
