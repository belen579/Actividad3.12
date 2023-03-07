package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Temporales extends Empleados implements Serializable {
	
	
private	LocalDate fechaInicio;

private	LocalDate fechaFin;

private	float pagoDia;

private	float suplemento;

public Temporales(LocalDate fechaInicio, LocalDate fechaFin, float pagoDia, float suplemento) {
	super();
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.pagoDia = pagoDia;
	this.suplemento = suplemento;
}

public LocalDate getFechaInicio() {
	return fechaInicio;
}

public void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
}

public LocalDate getFechaFin() {
	return fechaFin;
}

public void setFechaFin(LocalDate fechaFin) {
	this.fechaFin = fechaFin;
}

public float getPagoDia() {
	return pagoDia;
}

public void setPagoDia(float pagoDia) {
	this.pagoDia = pagoDia;
}

public float getSuplemento() {
	return suplemento;
}

public void setSuplemento(float suplemento) {
	this.suplemento = suplemento;
}

@Override
public void calculoNomina() {
	
	 
	
	float sueldo= this.pagoDia*(ChronoUnit.DAYS.between(fechaInicio, fechaFin) ) -this.pagoDia*(ChronoUnit.DAYS.between(fechaInicio, fechaFin))*super.porcentaRetención+this.suplemento;
}




}
