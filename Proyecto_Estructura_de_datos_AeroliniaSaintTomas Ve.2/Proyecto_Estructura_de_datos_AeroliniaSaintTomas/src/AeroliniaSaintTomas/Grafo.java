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


public class Grafo
{
    private List<Ciudad> ciudads;
    private List<Node> nodes;
    
    public Grafo()
    { 
    	this.nodes = new ArrayList<Node>();
    	this.ciudads = new ArrayList<Ciudad>();
    	
    }
    public Grafo(List<Ciudad> ciudads, List<Node> nodes)
    {   	
    	this.nodes = new ArrayList<Node>();
    	this.ciudads = new ArrayList<Ciudad>();
    }

    public List<Ciudad> getCiudads() {        return ciudads;    }
    public void setCiudads(List<Ciudad> ciudads) {        this.ciudads = ciudads;    }
   
    public List<Node> getNodes() {		return nodes;	}
	public void setNodes(List<Node> nodes) {		this.nodes = nodes;	}
	
	
	public String toString()
    {
        return " \n Ciudad" + ciudads + "\n";
    }
    
	

}
