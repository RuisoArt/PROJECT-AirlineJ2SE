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

import java.util.ArrayList;
import java.util.List;

public class Node
{
	private Ciudad ciudad;
    private List<Ruta> ruta;

    public Node()
    {
    	this.ruta = new ArrayList<>();
    }
    public Node(Ciudad ciudad)
    {
        this.ciudad = ciudad;
        this.ruta = new ArrayList<>();
    }

    public Ciudad getCiudad() {        return ciudad;    }
	public void setCiudad(Ciudad ciudad) {		this.ciudad = ciudad;	}
    
    public List<Ruta> getRuta() {		return ruta;	}
	public void setRuta(List<Ruta> ruta) {		this.ruta = ruta;	}



	public void addRuta1(Ruta rt1 ) {
        ruta.add(rt1);
    }

    @Override
    public String toString() {
        return " \n Node{" +
                "ciudad=" + ciudad +
                ", ruta=" + ruta +
                '}';
    }
}
