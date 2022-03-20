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

public class Ruta
{
	private Node origen;
	private Node destino;
	//private String originCiudad;
	//private String destinoCiudad;
	private double millas;
	private String timeruta;
	private String horarioDisponible;
	private String estadoTierraAire;
	
	
	public Ruta()	{	}
	
	public Ruta (String timeruta, String horarioDisponible, double millas, String estadoTierraAire)
	{
		this.timeruta = timeruta;
		this.horarioDisponible = horarioDisponible;
		this.millas = millas;
		this.estadoTierraAire = estadoTierraAire;
	}
	
	public Ruta (Node origen, Node destino, String timeruta, String horarioDisponible, double millas, String estadoTierraAire)
	{
		this.origen = origen;
		this.destino = destino;
		this.timeruta = timeruta;
		this.horarioDisponible = horarioDisponible;
		this.millas = millas;
		this.estadoTierraAire = estadoTierraAire;
	}
	
	public Node getOrigen() {		return origen;	}
	public void setOrigen(Node origen) {		this.origen = origen;	}
	
	public Node getDestino() {		return destino;	}
	public void setDestino(Node destino) {		this.destino = destino;	}
	
	public String getTimeruta() {		return timeruta;	}
	public void setTimeruta(String timeruta) {		this.timeruta = timeruta;	}
	
	public String getHorarioDisponible() {		return horarioDisponible;	}
	public void setHorarioDisponible(String horarioDisponible) {		this.horarioDisponible = horarioDisponible;	}
	
	public double getMillas() {		return millas;	}
	public void setMillas(double millas) {		this.millas = millas;	}
	
	public String getEstadoTierraAire() {		return estadoTierraAire;	}
	public void setEstadoTierraAire(String estadoTierraAire) {		this.estadoTierraAire = estadoTierraAire;	}
	
	/*
	public String getOriginCiudad() {		return originCiudad;	}
	public void setOriginCiudad(String originCiudad) {		this.originCiudad = originCiudad;	}
	
	public String getDestinoCiudad() {		return destinoCiudad;	}
	public void setDestinoCiudad(String destinoCiudad) {		this.destinoCiudad = destinoCiudad;	}
	*/
	public String toString()
	{
		return "\n--------------------------------------------------------- \n"
				+"Viaje en Saint Tomas\n"
				+"---------------------------------------------------------\n"
				+"Ciudad de origen: "+origen.getCiudad().getName()+"\n"
				+"Ciudad de destino: "+destino.getCiudad().getName()+"\n"
				+"Tiempo estipulado de viaje: "+timeruta+"\n"
				+"Horario de Viaje: "+horarioDisponible+"\n"
				+"Millas del viaje: "+millas+"\n"
				+"Estado del Viaje: "+estadoTierraAire+"\n"
				+"---------------------------------------------------------\n"
				;
	}
	
	//-------------------------------------------------------------------------------------------------

    public  boolean equals(Object n)
    {
       Ruta arc=(Ruta) n;
        return destino== arc.destino;
    }
	
}
