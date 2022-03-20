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

public class Ciudad
{
    private String  name;
    private String pais;
    private  String altura;
    private String clima;
    private boolean mostrar;
    private List<Ruta> rutas;

    public  Ciudad(){}
    public Ciudad(String name, String pais, String altura, String clima)
    {
        this.name = name;
        this.pais = pais;
        this.altura = altura;
        this.clima = clima;

    }

    public String getName() {        return name;    }
    public void setName(String name) {        this.name = name;    }

    public String getPais() {        return pais;    }
    public void setPais(String pais) {        this.pais = pais;    }

    public String getAltura() {        return altura;    }
    public void setAltura(String altura) {        this.altura = altura;    }

    public String getClima() {        return clima;    }
    public void setClima(String clima) {        this.clima = clima;    }

    public boolean isMostrar() {        return mostrar;    }
    public void setMostrar(boolean mostrar) {        this.mostrar = mostrar;    }

	public List<Ruta> getRutas() {		return rutas;	}
	public void setRutas(List<Ruta> rutas) {		this.rutas = rutas;	} 
	
	
	public String toString() {
        return " \n Ciudad= [" +" Nombre --->" + name + "| Pais --->" + pais + "| Altura --->" + altura + "| Clima --->" + clima + "| Mostrar --->" + mostrar +"| Rutas --->" + rutas +']';
    }
    
    //---------------------------------------------------------------------- METODO PARA AÑADIR UNA RUTA---------------------------------------------------------------------------------------
    
	public void addRuta(Ruta ruta)
	{
        if (rutas == null)
        {
            rutas = new ArrayList<>();
        }
        rutas.add(ruta);
    }
}

