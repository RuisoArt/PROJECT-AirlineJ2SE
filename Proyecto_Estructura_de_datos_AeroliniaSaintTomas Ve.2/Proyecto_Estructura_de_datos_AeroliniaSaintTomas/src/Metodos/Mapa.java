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

import javax.swing.JOptionPane;
import AeroliniaSaintTomas.Grafo;
import Imagenes.Icono;
import AeroliniaSaintTomas.Ciudad;
import AeroliniaSaintTomas.Node;
import AeroliniaSaintTomas.Ruta;

public class Mapa
{
	private Grafo graf = new Grafo(); //para crear los nodos con sus rutas
	private Icono ico = new Icono();

	private String nameCityTiquet;
	private String tempoMessage;
	private String tempTime;
	private String tempHorario;
	private double tempMillas;
	private String tempEstado;
	
	
	public Mapa() {}
	public Mapa(Grafo graf, Icono ico, String nameCityTiquet, String tempoMessage, String tempTime, String tempHorario, double tempMillas, String tempEstado)
	{
		this.graf = graf;
		this.ico = ico;
		this.nameCityTiquet = nameCityTiquet;
		this.tempoMessage = tempoMessage;
		this.tempTime = tempTime;
		this.tempHorario = tempHorario;
		this.tempMillas = tempMillas;
		this.tempEstado = tempEstado;

	}
	

	public String getNameCityTiquet() {		return nameCityTiquet;	}
 	public void setNameCityTiquet(String nameCityTiquet) {		this.nameCityTiquet = nameCityTiquet;	}
 
	public String getTemporalTime() {	return tempTime;}
	public void setTemporalTime(String tempTime) {	this.tempTime = tempTime;}
	
	public String getTempTime() {		return tempTime;	}
	public void setTempTime(String tempTime) {		this.tempTime = tempTime;	}
	
	public String getTempHorario() {		return tempHorario;	}
	public void setTempHorario(String tempHorario) {		this.tempHorario = tempHorario;	}
	
	public double getTempMillas() {		return tempMillas;	}
	public void setTempMillas(double tempMillas) {		this.tempMillas = tempMillas;	}
	
	public String getTempEstado() {		return tempEstado;	}
	public void setTempEstado(String tempEstado) {		this.tempEstado = tempEstado;	}
	
	public String getTempoMessage() {		return tempoMessage;	}
	public void setTempoMessage(String tempoMessage) {		this.tempoMessage = tempoMessage;	}
	
	//------------------------------------------------------------------- Añadir una nueva ciudad ORIGEN CLASE GRAFO ----------------------------------------------------------------------------------------
    public void addCiudad(Ciudad ciudad) 
    {
        if (graf.getCiudads() == null)
        {
            graf.setCiudads(new ArrayList<>());
        	//ciudads = new ArrayList<>();
        }
        graf.getCiudads().add(ciudad); 
        //ciudads.add(ciudad);
    }
//--------------------------------------------------------------------------------inicializar ciudades y rutas especificamente------------------------------------------------------------------------------
	
    public void grafo11()
    {
        Ciudad barranquilla = new Ciudad("Barranquilla", "colombia", "18", "templado");
        Ciudad cartagena = new Ciudad("Cartagena", "colombia", "10", "templado");
        Ciudad tunja = new Ciudad("Tunja", "colombia", "2810", "frio ");
        Ciudad cali = new Ciudad("Cali", "colombia", "1810", "calido ");
        Ciudad bogota = new Ciudad("Bogota", "colombia", "2610", "frio ");
        Ciudad medellin = new Ciudad("Medellin", "colombia", "1495", "calido ");
        Ciudad bucaramanga = new Ciudad("bucaramanga", "colombia", "959", "calido ");

        // public Ruta (Ciudad origen, Ciudad destino, String timeruta, String horarioDisponible, double millas, String estadoTierraAire)
        /*
        barranquilla.addRuta( new Ruta(barranquilla, cartagena, "16 horas", "10 am ",623, "aire") );
        bogota.addRuta(new Ruta(bogota, bucaramanga, "9 horas", "4 pm ", 247, "tierra"));
        tunja.addRuta(new Ruta(tunja, bogota, "2 horas y media", "8 am ", 86,  "tierra"));
        medellin.addRuta(new Ruta(medellin, cartagena, "12 horas", "7 am ", 391, "aire"));
        medellin.addRuta(new Ruta(medellin, bogota, "8 horas", "3 pm ", 260, "aire"));
        bucaramanga.addRuta(new Ruta(bucaramanga, tunja, "6 horas", "11 am ", 175, "tierra"));
        cali.addRuta(new Ruta(cali, bogota, "9 horas", " 1 pm ", 283, "aire"));
        cartagena.addRuta(new Ruta(cartagena, barranquilla, "16 horas", "6 am ", 623, "aire"));
        medellin.addRuta(new Ruta(medellin, bucaramanga, "8 horas", "12 am ", 243, "aire"));
        bogota.addRuta(new Ruta(bogota, tunja, "2 horas y media", "8 am ", 86, "tierra"));
        */
        
        addCiudad(barranquilla);
        addCiudad(cartagena);
        addCiudad(cali);
        addCiudad(tunja);
        addCiudad(bogota);
        addCiudad(medellin);
        addCiudad(bucaramanga);
    }

  //------------------------------------------------------------------------Agregar una nueva ciudad-----------------------------------------------------------------------------------------
    public void agregarciudad()
    {
    	int paises = 0;
        while(true)
        {
        	try {
        		paises = Integer.parseInt( JOptionPane.showInputDialog(" ¿Cuantas ciudades deseas agregar?: "));
        		break;
        	}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
					+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
					,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());	}
        }
        

        for (int i = 0; i < paises; i++)
        {
        	
        	String name = JOptionPane.showInputDialog("Ingresa el nombre de la ciudad"); 
        	String pais = JOptionPane.showInputDialog("Ingresa el nombre del pais donde se encuentra la ciudad "+name);
        	String clima = JOptionPane.showInputDialog("Ingresa el clima de la ciudad "+name);
        	
        	int l = 0;
        	while(true)
        	{
        		try {l = Integer.parseInt( JOptionPane.showInputDialog("Ingrese la altura de la ciudad "+name));
        			break;
        		}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
						+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
						,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());	}
        	}
        	String altura = String.valueOf(l);

        	addCiudad(new Ciudad (name, pais, altura, clima) );
        	showCitys();
        	
        	int opcionRuta = 0;
        	while(true)
        	{
        		try {
        			opcionRuta = Integer.parseInt( JOptionPane.showInputDialog("¿Desea agregar de una vez una ruta? \n"
													                			+ "[1] SI \n"
													                			+ "[2] NO \n") );
        			break;
        		}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
																								+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
																								,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());	}
        	}
        	
        	switch(opcionRuta)
        	{
        		default:
        			JOptionPane.showMessageDialog(null, "Error en el dato ingresado",null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());
        			break;
        		case 1:
        			agregarruta();
        			break;
        		case 2:
        			JOptionPane.showMessageDialog(null, "Volvera al Menu Trabajador",null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());
        			break;
        	}
        	

        }
    }
    // --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void agregarruta()
    {

		showCitys();

        String origen = JOptionPane.showInputDialog("Ingrese el nombre de la CIUDAD ORIGEN de la ruta: ");
        String destino = JOptionPane.showInputDialog("Ingrese el nombre de la CIUDAD DESTINO de la ruta: ");
        String timeruta = JOptionPane.showInputDialog("Ingrese el tiempo estimado que se demora entre ir de la ciudad "+origen+" a la ciudad "+destino);
        String horario = JOptionPane.showInputDialog("Ingrese el horario de salida de la ruta de la ciudad "+origen+" a la ciudad "+destino);
        String viajar = JOptionPane.showInputDialog("Digite la forma de viajar ( tierra o aire) ");
        
        double mill = 0;
        while(true)
        {
        	try {
                mill = Double.parseDouble( JOptionPane.showInputDialog("Ingrese la candidad de MILLAS que hay entra la ciudad "+origen+" y la ciudad "+destino) );
                break;
        	}catch(NumberFormatException e)	{	JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"
					+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo"
					,null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());	}
        }

        agregarrut(origen,destino,timeruta,horario,mill,viajar);
       
        JOptionPane.showMessageDialog(null, "La ruta creada de la ciudad de origen "+origen+"\n "
        		+ "a la ciudad de destino "+destino+", ya se encuentra en el sistema.\n "
        		+ "A continuacion podra ver las rutas exitentes",null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());
        
        imprimirgraf();

    }
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void agregarrut(String origen, String destino, String timeruta, String horarioDisponible, double millas, String estadoTierraAire)
    {
            Node orige= encontrarnode(origen);
            Node  destin= encontrarnode(destino);
            
            if (orige==null){
                orige=agregarnode(origen);
            }
            if (destin==null){
                destin=agregarnode(destino);
            }
            int fpz= posicion(origen);
            //
            graf.getNodes().get(fpz).addRuta1(new Ruta(orige,destin, timeruta, horarioDisponible, millas, estadoTierraAire));

    }
    
	public Node agregarnode(String nombreciudad)
	{
		graf.getNodes().add(new Node(buscarciudadname(nombreciudad)));
        return graf.getNodes().get(graf.getNodes().size()-1);
    }
	
    public Ciudad buscarciudadname(String name )
    {
        for (int i=0;i<graf.getCiudads().size(); i++)
        {
            if (graf.getCiudads().get(i).getName().equals(name))
            {
                return graf.getCiudads().get(i);
            }
        }
        return null;
    }
    
	public  Node encontrarnode(String nombre){
	    for (Node node: graf.getNodes())
	    {
	        if (node.getCiudad().getName().equals(nombre))
	        {
	            return node;
	        }
	    }
	    return null;
	}

	public  int posicion(String nombre) {
	    int p = 0;
	    for (Node node : graf.getNodes())
	    {
	        if (node.getCiudad().getName().equals(nombre))
	        {
	            return p;
	        }
	        p++;
	    }
	    return -1;
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
    public  void imprimirgraf()
    {
    	JOptionPane.showMessageDialog(null, "La lista de ciudades la puedes ver en la terminal del IDE",null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());
    	
        for (Node node: graf.getNodes())
        {
            System.out.println(node);
        }
    }

  //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void showCitys()
    {
    	int count = 1;
    	JOptionPane.showMessageDialog(null, "La lista de ciudades la puedes ver en la terminal del IDE",null,JOptionPane.INFORMATION_MESSAGE, ico.getImgIcono());
    	
        for (Ciudad c : graf.getCiudads())
        {
            System.out.println(count+"). Nombre: " + c.getName() + " Pais: " + c.getPais() + " Altura: " + c.getAltura() + " Clima: " + c.getClima());
            count = count + 1;
        }
    }
  //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   public void buscarCiudadTiquete(String recibeCiudadOrigen)
   {	   
	   for (int i=0;i<graf.getCiudads().size(); i++)
       {
           if (graf.getCiudads().get(i).getName().equals(recibeCiudadOrigen) )
           {
               nameCityTiquet = graf.getCiudads().get(i).getName();      	   
           }
       }
   }
   public void buscarRutaTiquete(String recibeOriginTown, String recibeFinishTown)
   {	   
	   Node origen = encontrarnode(recibeOriginTown);
	   Node destino = encontrarnode(recibeFinishTown);
	   
	   for ( int i=0 ; i <  graf.getNodes().size()-1 ; i++ )
	   {
		   if (  graf.getNodes().get(i).getRuta().get(i).getOrigen().equals(origen) && graf.getNodes().get(i).getRuta().get(i).getDestino().equals(destino)  )
		   {
			    tempTime = graf.getNodes().get(i).getRuta().get(i).getTimeruta();
			    tempHorario = graf.getNodes().get(i).getRuta().get(i).getHorarioDisponible();
			    tempMillas = graf.getNodes().get(i).getRuta().get(i).getMillas();
			    tempEstado = graf.getNodes().get(i).getRuta().get(i).getEstadoTierraAire();
			    
			    tempoMessage = "SI";
		   }
		   else {
			   tempoMessage = "No existe ruta";
		   }
		   
	   }
   }
    


}