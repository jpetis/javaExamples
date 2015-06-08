/**5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE
 * 
 */
package com.jpetis.ejercicios;

/**
 * @author Jaime Gpetis
 *
 */

public class ClaseAlumno {
	private String nombre;
	private String curso;
	private NotaEquibalente notaEquibalente;
	int edad;
	int nota;
	/**
	 * @param nota 
	 * @param nombre 
	 * @param edad 
	 * @param curso 
	 * @throws Exception 
	 * 
	 */
	
	public ClaseAlumno(int nota, String nombre, int edad, String curso, NotaEquibalente notaEquibalente) throws Exception {
		this.curso = curso;
		this.edad = edad;
		this.nombre = nombre;
		this.nota = nota;
		this.notaEquibalente = NotaEquibalente.equivalenciaNota(nota);
	}
	/**
	 * @return the notaEquibalente
	 */
	public NotaEquibalente getNotaEquibalente() {
		return notaEquibalente;
	}
	/**
	 * @param notaEquibalente the notaEquibalente to set
	 */
	public void setNotaEquibalente(NotaEquibalente notaEquibalente) {
		this.notaEquibalente = notaEquibalente;
	}
	/**
	 * @return the name
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the name to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the course
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the course to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	/**
	 * @return the age
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the age to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the note
	 */
	public int getNota() {
		return nota;
	}
	/**
	 * @param nota the note to set
	 */
	public void setNota(int nota) {
		this.nota = nota;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		try {
			return "Nota :"+ClaseAlumno.this.getNota()+"/ Edad :"+ClaseAlumno.this.getEdad()+
					"/ Nombre: "+ClaseAlumno.this.getNombre()+"/ Curso: "+ClaseAlumno.this.getCurso()+
					"/ Calificación: "+NotaEquibalente.equivalenciaNota(getNota());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	/**
	 * 
	 */

}
