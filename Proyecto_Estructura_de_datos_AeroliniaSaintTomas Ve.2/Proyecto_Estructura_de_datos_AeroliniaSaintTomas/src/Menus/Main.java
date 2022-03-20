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

import Metodos.Controller;
import Metodos.Mapa;
import Imagenes.Icono;

public class Main
{	
	private Icono ico = new Icono();
	private Mapa mapamundi = new Mapa();
	private Controller control = new Controller();
	private MenuCliente mcliente = new MenuCliente();
	private MenusTrabajador msalary = new MenusTrabajador();
	
	public Main()	{	}
	public Main(Icono ico, Mapa mapamundi, Controller control, MenuCliente mcliente, MenusTrabajador msalary)
	{
		this.ico = ico;
		this.mapamundi = mapamundi;
		this.control = control;
		this.mcliente = mcliente;
		this.msalary = msalary;
	}
 //................................................................METODO PRINCIPAL ¡ MAIN ! \(°w°)/ .......................................................................................................
	public static void main(String[] args)
	{
		Main m = new Main();
		m.ico = new Icono();
		m.mapamundi = new Mapa();
		m.control = new Controller();
		m.mcliente = new MenuCliente();
		m.msalary = new MenusTrabajador();
		
		m.mapamundi.grafo11(); //inicializa la lista de ciudades
		
		JOptionPane.showMessageDialog(null,"<html><h1 align='center'><b> "+"Airline Saint Tomas"+"</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, m.ico.getImgIcono());
		//JOptionPane.showInputDialog(null,"encabezado","Alien Pet Game",JOptionPane.INFORMATION_MESSAGE,m.imgIcono,null,"");
		
		boolean estado = true;
		while(estado)
		{
			int teclado = 0;
			while(true)
			{
				try {
					teclado = Integer.parseInt( JOptionPane.showInputDialog("<html><h1 align='center'><b> "+"Bienvenido Airline Saint Tomas"+"</b></h1></html>"+"\n"
																			+ "Idendifiquese a continuacion son el numero especificado en el menu: \n\n"
																			+ "[0] Salir del Sistema \n"
																			+ "[1] Personal de Airline Saint Tomas \n"
																			+ "[2] Cliente Airline Saint Tomas \n\n"
																			));
					break;
				}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
																							+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
																								,null,JOptionPane.INFORMATION_MESSAGE, m.ico.getImgIcono());	}
			}	
			
			switch(teclado)
			{
				default:
					JOptionPane.showMessageDialog(null, "Error en el dato ingresado, intentelo de nuevo");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "See you later");
					estado = false;
					break;
				case 1:
					m.msalary.menuTrabajador(m.mapamundi, m.control);
					break;
				case 2:
					m.mcliente.menuCliente(m.control, m.mapamundi);
					break;
			}
		}
		
	}
//........................................................................................................................................................................................................
}
