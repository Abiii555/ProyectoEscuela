package ar.com.benavidez;

import java.util.ArrayList;

public class Alumno {
	String nombre;
	public Alumno(String nombre, String apellido, ArrayList<Materia> materias, String curso, String profesor) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.materias = materias;
		this.curso = curso;
		this.profesor = profesor;
	}

	String apellido;
	ArrayList<Materia> materias;
	String curso;
	String profesor;
	
	public Alumno() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	

}
