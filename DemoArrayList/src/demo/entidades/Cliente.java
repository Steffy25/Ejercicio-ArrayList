package demo.entidades;

public class Cliente {
	
   private String identificaciones;
   private String nombres;
   private String apellidos;
   private int edad;
   
   public Cliente(){
	   
   }
   
public Cliente(String identificaciones, String nombres, String apellidos,
		int edad) {
	super();
	this.identificaciones = identificaciones;
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.edad = edad;
}


public String getIdentificaciones() {
	return identificaciones;
}
public void setIdentificaciones(String identificaciones) {
	this.identificaciones = identificaciones;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

@Override
// source  generate to Sting
public String toString() {
	return "Cliente [identificaciones=" + identificaciones + ", nombres="
			+ nombres + ", apellidos=" + apellidos + ", edad=" + edad + "]";
}
	
   
}
