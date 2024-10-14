package ar.com.benavidez;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
	
	public static void main(String[] args) {
		
		
		/*		this.nombre = nombre;
		this.apellido = apellido;
		this.materias = materias;
		this.curso = curso;
		this.profesor = profesor;*/
		List<Materia> materias = new ArrayList<Materia>();
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		Alumno aby = new Alumno("nombre", "apellido", materias, "curso" ,"profesor");
		Alumno sofia = new Alumno ("sofia","guerrero", materias,"6° 1°", "Liliana");
		Alumno franco = new Alumno ("franco","rojas", materias, "6to 2da","marcelo");
		
		alumnos.add(aby); 
		alumnos.add(sofia);
		alumnos.add(franco);
		
		System.out.println("Imprimiendo la lista de materias");
		
		for (int i = 0; i < materias.size(); i++) {
			
		}		
			
			

}
