/*
 * Universidad Santo Tomas seccional Tunja
 * Proyecto Airline Saint Tomas 
 * Materia Estructura de Datos
 * Ingeniera Uribe Rios Mery Yolima
 * Estudiante Luis Felipe Narvaez Gomez
 * Estudiante Andrés Felipe Rodríguez pesca
 * Tunja - Boyaca
 * 2021-1
 */
package AeroliniaSaintTomas;

public class Cliente
{
	private String nombreCliente;
	private int edadCliente;
	private int id;
	private int tiquetes;
	private double millasAcum;
	
	public Cliente()	{	}
	public Cliente(String nombreCliente, int id, int edadCliente, int tiquetes, double millasAcum)
	{
		this.nombreCliente = nombreCliente;
		this.edadCliente = edadCliente;
		this.tiquetes = tiquetes;
		this.millasAcum = millasAcum;
		this.id = id;
	}
	
	public String getNombreCliente() {		return nombreCliente;	}
	public void setNombreCliente(String nombreCliente) {		this.nombreCliente = nombreCliente;	}
	
	public int getEdadCliente() {		return edadCliente;	}
	public void setEdadCliente(int edadCliente) {		this.edadCliente = edadCliente;	}
	
	public int getTiquetes() {		return tiquetes;	}
	public void setTiquetes(int tiquetes) {		this.tiquetes = tiquetes;	}
	
	public double getMillasAcum() {		return millasAcum;	}
	public void setMillasAcum(double millasAcum) {		this.millasAcum = millasAcum;	}	
	
	public int getId() {		return id;	}
	public void setId(int id) {		this.id = id;	}
	
	public String toString()
	{
		return ") Cliente: |"+nombreCliente+"| identificado con cedula |"+id
				+"| con edad de |"+edadCliente+"| a comprado un total de tiquetes de |"+tiquetes+"| y lleva un total de millas acumuladas de |"+millasAcum+"| ";
	}
	

}
