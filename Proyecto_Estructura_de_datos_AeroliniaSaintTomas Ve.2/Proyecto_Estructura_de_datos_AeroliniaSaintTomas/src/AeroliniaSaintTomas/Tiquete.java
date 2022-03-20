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

public class Tiquete extends Ruta
{
	private String ciudadOrigen;
	private String ciudadDestino;
	private String pasajero;
	
	public Tiquete() {super();}
	public Tiquete(String pasajero, String ciudadOrigen, String ciudadDestino , String timeruta, String horarioDisponible, double millas, String estadoTierraAire)
	{
		super(timeruta, horarioDisponible, millas, estadoTierraAire);
		this.pasajero = pasajero;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
	}
	public String getCiudadOrigen() {		return ciudadOrigen;	}
	public void setCiudadOrigen(String ciudadOrigen) {		this.ciudadOrigen = ciudadOrigen;	}
	
	public String getCiudadDestino() {		return ciudadDestino;	}
	public void setCiudadDestino(String ciudadDestino) {		this.ciudadDestino = ciudadDestino;	}
	
	public String getPasajero() {		return pasajero; }
	public void setPasajero(String pasajero) {		this.pasajero = pasajero;	}
	
	
	
	

}
