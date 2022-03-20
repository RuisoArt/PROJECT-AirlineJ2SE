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

public class MenuCliente
{
	private Controller control = new Controller();
	private Icono ico = new Icono();
	private Mapa mapamundi = new Mapa();
	
	public MenuCliente() {}
	public MenuCliente(Controller control, Icono ico, Mapa mapamundi)
	{
		this.control = control;
		this.ico =ico;
		this.mapamundi = mapamundi;
	}
	//------------------------------------------------------------------------------------MENU CLIENTE--------------------------------------------------------------------------------------------------------------------
		public void menuCliente(Controller recibeMControl, Mapa recibeMMapamundi)
		{	
			this.control = recibeMControl;
			this.mapamundi = recibeMMapamundi;
			
			boolean estate = true;
			while(estate)
			{
				int keyboard = 0;
				while(true)
				{
					try {
						keyboard = Integer.parseInt( JOptionPane.showInputDialog("<html><h1 align='center'><b>"+"MENU CLIENTE"+"</b></h1></html>"+"\n\n"
								+"Bienvenido Cliente de Airline Saint Tomas\n"
								+ "Elije alguna de las opciones del siguiente menu: \n\n"
								+ "[0] Salir \n"
								+ "[1] Registrar cliente nuevo \n"
								+ "[2] Comprar un nuevo tiquete \n"
								+ "[3] Ver Informacion de Usuario \n"
								+ "[4] Ver historial de vuelos \n\n"));
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
						estate = false;
						break;
					case 1:
						control.añadirCliente();
						break;
					case 2:
						control.tiqueteCompra(mapamundi);
						break;
					case 3:
						control.searchSpecificClient();
						break;
					case 4:
						control.buscarHistorial();
						break;
						
				}
			}
			
			
		}
}
