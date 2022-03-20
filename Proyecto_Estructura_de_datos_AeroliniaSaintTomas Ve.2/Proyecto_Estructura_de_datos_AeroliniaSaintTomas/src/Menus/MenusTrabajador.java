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
package Menus;

import javax.swing.JOptionPane;

import Imagenes.Icono;
import Metodos.Controller;
import Metodos.Mapa;

public class MenusTrabajador
{
	private Controller control = new Controller();
	private Icono ico = new Icono();
	private Mapa mapamundi = new Mapa();
	
	public MenusTrabajador() {}
	public MenusTrabajador(Controller control, Icono ico, Mapa mapamundi)
	{
		this.control = control;
		this.ico = ico;
		this.mapamundi = mapamundi;
	}
	//-------------------------------------------------------------------------------------MENU TRABAJADOR---------------------------------------------------------------------------------------------------------------
	public void menuTrabajador(Mapa recibeMMapamundi, Controller recibeMControl)
	{
		this.mapamundi = recibeMMapamundi;
		this.control = recibeMControl;
		
		boolean ciclo = true;
		while(ciclo)
		{
			int contraseña = 0;
			while(true)
			{
				try {
					contraseña = Integer.parseInt( JOptionPane.showInputDialog("<html><h1 align='center'><b>"+"INGRESO DE PERSONAL"+"</b></h1></html>"+"\n\n"
																				+"Para poder ingresar a esta seccion del programa \n"
																				+ "debe ingresar su respectiva contraseña a continuacion \n\n"
																				+ "Si no recuerda la contraseña cancele el ingreso con el numero [0] \n\n") );
					break;
				}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
						+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
						,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());	}
			}
			
			switch(contraseña)
			{
				default:
					break;
				case 159951:
					JOptionPane.showMessageDialog(null, "¡Contraseña correcta, Bienvenido!");
					ingresoActivo();
					break;
				case 0:
					ciclo = false;
					break;
			}
		}
		
	}
 //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------::::::::::::::::::::
	public void ingresoActivo() 
	{
		
		boolean ciclo = true;
		while(ciclo)
		{
			int keyboard = 0;
			while (true)
			{
				try {
					keyboard = Integer.parseInt( JOptionPane.showInputDialog("<html><h1 align='center'><b>"+"MENU PERSONAL AIRLINE S.T."+"</b></h1></html>"+"\n\n"
							+"Bienvenido Trabajador de Airline Saint Tomas\n"
							+ "Elije alguna de las opciones del siguiente menu: \n\n"
							+ "[0] Salir \n"
							+ "[1] Ver clientes actuales de Airlne Saint Tomas \n"
							+ "[2] Ver ciudades disponibles \n"
							+ "[3] Ver TODAS las rutas disponibles \n"
							+ "[4] Crear una nueva ruta \n"
							+ "[5] Crear una nueva ciudad \n\n"
							));
					break;
				}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
						+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
						,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());	}
			}
			
			switch(keyboard)
			{
				default:
					JOptionPane.showMessageDialog(null, "Error en el dato ingresado, intentelo de nuevo");
					break;
				case 0:
					ciclo = false;
					break;
				case 1:
					control.recorrerClientes();
					break;
				case 2:
					mapamundi.showCitys();
					break;
				case 3:
					mapamundi.imprimirgraf();
					break;
				case 4:
					mapamundi.agregarruta();
					break;
				case 5:
					mapamundi.agregarciudad();
					break;
			}
		}
		
	}
}
