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
package Imagenes;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Icono
{
	private Icon imgIcono; 
	
	public Icono() {
		this.imgIcono = new ImageIcon(getClass().getResource("/Imagenes/logo_airline_Saint_Tomas.png"));
	}
	public Icono(Icon imgIcono)
	{
		this.imgIcono = new ImageIcon(getClass().getResource("/Imagenes/logo_airline_Saint_Tomas.png"));
	}
	
	public Icon getImgIcono() {		return imgIcono;	}
	public void setImgIcono(Icon imgIcono) {		this.imgIcono = imgIcono;	}
	
}
