package modelo;

import java.io.Serializable;

public class Fijos extends Empleados implements Serializable{
	
	
private	int salarioBase;

private	int trienios;




public Fijos(int salarioBase, int trienios) {
	super();
	this.salarioBase = salarioBase;
	this.trienios = trienios;
}

public int getSalarioBase() {
	return salarioBase;
}

public void setSalarioBase(int salarioBase) {
	this.salarioBase = salarioBase;
}

public int getTrienios() {
	return trienios;
}

public void setTrienios(int trienios) {
	this.trienios = trienios;
}

@Override
public void calculoNomina() {

  float sueldo=  (this.salarioBase+this.trienios) - (this.salarioBase+this.trienios)* super.porcentaRetención;
	
}




	

	

}
