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
package Metodos;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JOptionPane;

import Imagenes.Icono;
import AeroliniaSaintTomas.Cliente;
import AeroliniaSaintTomas.Tiquete;

public class Controller
{
	private Icono ico = new Icono();
	private Mapa mapamundi;
	
	private List<Cliente> cliente;
	private Hashtable<Integer, Cliente> userCliente;
	private Hashtable<Integer, Tiquete> historial;
	
	
	
	public Controller()
	{
		this.cliente = new ArrayList<Cliente>();
		this.userCliente = new Hashtable<Integer, Cliente>();
		this.historial = new Hashtable<Integer, Tiquete>();
		
		initCliente();
	}
	public Controller(Icono ico, Mapa mapamundi, List<Cliente> cliente, Hashtable<Integer, Cliente> userCliente, Hashtable<Integer, Tiquete> historial)
	{
		this.ico = ico ;
		this.mapamundi = new Mapa();
		
		this.cliente = new ArrayList<Cliente>();
		this.userCliente = new Hashtable<Integer, Cliente>();
		this.historial = new Hashtable<Integer, Tiquete>();
		
		initCliente();
	}

	
	public List<Cliente> getCliente() {		return cliente;	}
	public void setCliente(List<Cliente> cliente) {		this.cliente = cliente;	}
	
	public Hashtable<Integer, Cliente> getUserCliente() {		return userCliente;	}
	public void setUserCliente(Hashtable<Integer, Cliente> userCliente) {		this.userCliente = userCliente;	}
	
	public Hashtable<Integer, Tiquete> getHistorial() {		return historial;	}
	public void setHistorial(Hashtable<Integer, Tiquete> historial) {		this.historial = historial;	}
	
	//----------------------------------------------------------------------Inicializar clientes-------------------------------------------------------------------------------------
	public void initCliente()
	{	
		//String nombreCliente, int id, int edadCliente, int tiquetes, double millasAcum 
		cliente.add(new Cliente("Maria Jose",1049011, 22, 0, 0));
		userCliente.put(1049011, cliente.get(0));
		historial.put(1049011, new Tiquete("","","","","",0,"") );
		
		cliente.add(new Cliente("Maoly Vanessa",1049012, 23, 0, 0));
		userCliente.put(1049012, cliente.get(1));
		historial.put(1049012, new Tiquete("","","","","",0,"") );
		
		cliente.add(new Cliente("Maria Fernanda",1049013, 24, 0, 0));
		userCliente.put(1049013, cliente.get(2));
		historial.put(1049013, new Tiquete("","","","","",0,"") );
		
		cliente.add(new Cliente("Angie Rojas",1049014, 19, 0, 0));
		userCliente.put(1049014, cliente.get(3));
		historial.put(1049014, new Tiquete("","","","","",0,"") );
		
		cliente.add(new Cliente("Manuela Castiblanco",1049015, 22 , 0, 0));
		userCliente.put(1049015, cliente.get(4));
		historial.put(1049015, new Tiquete("","","","","",0,"") );
	
	}
//-------------------------------------------------------------------------Recorrer clientes-----------------------------------------------------------------------------------------
	public void recorrerClientes() {
		JOptionPane.showMessageDialog(null, "El total de clientes inscritos en la Aerolinia son: \n"
											+"<html><h1 align='center'><b>"+cliente.size()+"</b></h1><html> \n"+
											"estos los puedes ver en la terminal del IDE",null,JOptionPane.INFORMATION_MESSAGE,ico.getImgIcono());
		
		System.out.println("El total de clientes inscritos en la Aerolinia son: "+cliente.size());
		
		int count = 1;
		for(int i=0 ; i < cliente.size() ; i++)
		{
			System.out.println(count+cliente.get(i).toString());
			count ++;
		}
	}
//--------------------------------------------------------------------------------Añadir Nuevo Cliente----------------------------------------------------------------------------------
	public void añadirCliente()
	{
		JOptionPane.showMessageDialog(null,"Ahora podra registrar un Usuario nuevo en la Aerolinea Saint Tomas",null,JOptionPane.INFORMATION_MESSAGE,ico.getImgIcono());
		
		String name = JOptionPane.showInputDialog("Escriba el nombre del nuevo usuario");
		
		int cedula = 0;
		while(true)
		{
			try {
				cedula = Integer.parseInt( JOptionPane.showInputDialog("Escriba la cedula de " + name) );
				break;
			}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
					+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
					,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());	}
		}
		
		int age = 0;
		while(true)
		{
			try {
				age = Integer.parseInt( JOptionPane.showInputDialog("Escriba la edad de "+name));
				break;
			}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
					+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
					,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());	}
		}		
		
		cliente.add(new Cliente(name, cedula, age, 0, 0));
		userCliente.put(cedula, cliente.get( cliente.size()-1 ));
		historial.put(cedula, new Tiquete("","","","","", 0,"") );
		
		JOptionPane.showMessageDialog(null, "Cliente "+name+" identificado con cedula "+cedula+" y con una edad de "+age+"\n"
											+ "Se encuentra ahora registrado en Airline Saint Tomas",null,JOptionPane.INFORMATION_MESSAGE,ico.getImgIcono());
		
	}
//------------------------------------------------------------------------------Buscar un cliente en especifico------------------------------------------------------------------------------------
	public void searchSpecificClient()
	{
		int cedulaCiudadaniaIdentificador = 0;
		while(true)
		{
			try {
				cedulaCiudadaniaIdentificador = Integer.parseInt( JOptionPane.showInputDialog("Ingrese la cedula correspondiente en el cuadro inferior") );
				break;
			}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
					+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
					,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());	}
		}
		
		if (userCliente.containsKey(cedulaCiudadaniaIdentificador))
		{
			JOptionPane.showMessageDialog(null, "El usuario de Airline Saint Tomas es el siguiente \n\n"
												+ "Nombre: " +userCliente.get(cedulaCiudadaniaIdentificador).getNombreCliente()+"\n"
												+ "Cedula: "+userCliente.get(cedulaCiudadaniaIdentificador).getId()+"\n"
												+ "Edad: "+userCliente.get(cedulaCiudadaniaIdentificador).getEdadCliente()+"\n"
												+ "Tiquetes Comprados: "+userCliente.get(cedulaCiudadaniaIdentificador).getTiquetes()+"\n"
												+ "Millas Acumuladas: "+userCliente.get(cedulaCiudadaniaIdentificador).getMillasAcum()+"\n" ,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());
		}else {
			JOptionPane.showMessageDialog(null, "Este Usuaio no existe en Airline Saint Tomas",null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());
		}
	}
//--------------------------------------------------------------------------Comprar tiquete-----------------------------------------------------------------------------------------------
	public void tiqueteCompra(Mapa recibeMapamundi)
	{
		this.mapamundi = recibeMapamundi;
		
		boolean ciclo = true;
		
		while(ciclo)
		{
			int idCedula = 0;
			while(true)
			{
				try
				{
					idCedula = Integer.parseInt( JOptionPane.showInputDialog("Si ya existe en el sistema, ingrese su cedula a continuacion: "));
					break;
				}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
						+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
						,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());	}
			}
			
			if(userCliente.containsKey(idCedula))
			{
				JOptionPane.showMessageDialog(null, "Bienvenido Usuario "+userCliente.get(idCedula).getNombreCliente());
				
				JOptionPane.showMessageDialog(null, "Las rutas disponibles para esta ciudad son las que se ven en la terminal del IDE");
				mapamundi.imprimirgraf();
				
				
				
				String ciudadOrigen = JOptionPane.showInputDialog("Ingresa la ciudad de ORIGEN de tu viaje");
				mapamundi.buscarCiudadTiquete(ciudadOrigen);
				String originTown = mapamundi.getNameCityTiquet();
				String ciudadDestino = JOptionPane.showInputDialog("Ingresa la ciudad de DESTINO de tu viaje");
				mapamundi.buscarCiudadTiquete(ciudadDestino);
				String finshTown = mapamundi.getNameCityTiquet();
				
				
				mapamundi.buscarRutaTiquete(originTown, finshTown);
				
				if(mapamundi.getTempoMessage().equals("No existe ruta"))
				{
					JOptionPane.showMessageDialog(null, mapamundi.getTempoMessage() );
					ciclo = false;
				}
				else {
					JOptionPane.showMessageDialog(null, " La informacion de su tiquete es la siguiente \n\n"
							+"Viaje a nombre de: "+userCliente.get(idCedula).getNombreCliente()+"\n"
							+"Ciudad de Origen: "+ originTown + "\n"
							+"Ciudad de Destino: "+ finshTown + "\n"
							+"Tiempo estimado de Viaje: "+ mapamundi.getTemporalTime() + "\n"
							+"Horario de Abordaje: "+ mapamundi.getTempHorario() + "\n"
							+"Millas del Viaje: "+ mapamundi.getTempMillas() + "\n"
							+"Estado del viaje: "+ mapamundi.getTempEstado() + "\n");
					
					
					historial.put(idCedula, new Tiquete(userCliente.get(idCedula).getNombreCliente(), originTown, finshTown, mapamundi.getTemporalTime(), mapamundi.getTempHorario(), mapamundi.getTempMillas(), mapamundi.getTempEstado() ));
					
					double nuevasMillas = userCliente.get(idCedula).getMillasAcum() + mapamundi.getTempMillas() ;
					userCliente.get(idCedula).setMillasAcum(nuevasMillas);
					
					int nuevoTiquete = userCliente.get(idCedula).getTiquetes() + 1;
					userCliente.get(idCedula).setTiquetes(nuevoTiquete);
				}
				
				ciclo = false;
				
			}else {
				JOptionPane.showMessageDialog(null, "Este Usuaio no existe en Airline Saint Tomas",null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());
				ciclo = false;
			}

			
			
		}
	}
	//...............................................................................METODO DE HISTORIAL.................................................................................................
	public void buscarHistorial() {
		int idCedula = Integer.parseInt( JOptionPane.showInputDialog("Escriba la cedula del cliente: \n"));
		
		if(historial.containsKey(idCedula))
		{
			for( int i = 0 ; i < historial.size() ; i++)
			{
				System.out.println( "................................................................\n"
									+"Nombre Pasajero: "+ historial.get(idCedula).getPasajero()+"\n"
									+"................................................................\n"
									+"Ciudad de Origen: "+ historial.get(idCedula).getCiudadOrigen()+"\n"
									+"Ciudad de Destino: "+ historial.get(idCedula).getCiudadDestino()+"\n"
									+"Tiempo Estimado de Viaje: "+ historial.get(idCedula).getTimeruta()+"\n"
									+"Horaio de Abordaje: "+ historial.get(idCedula).getHorarioDisponible()+"\n"
									+"Millas de Viaje: "+ historial.get(idCedula).getMillas()+"\n"
									+"Estado del Viaje: "+ historial.get(idCedula).getEstadoTierraAire()+"\n"
									+".................................................................\n"
									);
			}
		}
		
	}


	
}
