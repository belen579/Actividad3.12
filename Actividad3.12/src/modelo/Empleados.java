package modelo;

import java.io.Serializable;

public abstract class Empleados implements Serializable {
	

	
protected	String dni;

private String nombre;

private	String teléfono;

protected	float porcentaRetención;

public Empleados(String dni, String nombre, String teléfono, float porcentaRetención) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.teléfono = teléfono;
	this.porcentaRetención = porcentaRetención;
}

public Empleados() {
	// TODO Auto-generated constructor stub
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTeléfono() {
	return teléfono;
}

public void setTeléfono(String teléfono) {
	this.teléfono = teléfono;
}

public float getPorcentaRetención() {
	return porcentaRetención;
}

public void setPorcentaRetención(float porcentaRetención) {
	this.porcentaRetención = porcentaRetención;
}


public abstract void calculoNomina();
	



}
