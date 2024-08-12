package ar.com.benavidez;

public class Materia {
  String nombre;   
  int nota;
  
  public Materia (String pNombre,int nota){
	  this.nombre = pNombre;
	  this.nota = nota;
  }

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getNota() {
	return nota;
}

public void setNota(int nota) {
	this.nota = nota;
}


  
  
  
  
  
}
