package co.com.sura.restfulrecargado.persistencia;

import java.util.ArrayList;
import java.util.List;
import co.com.sura.restfulrecargado.modelo.Aplicacion;

public class DataStore 
{
	public static List<Aplicacion> listaAplicaciones;

	static 
	{
		listaAplicaciones = new ArrayList<Aplicacion>();
		listaAplicaciones.add(new Aplicacion("Requisitos", "01"));
		listaAplicaciones.add(new Aplicacion("Asistencia", "02"));
		listaAplicaciones.add(new Aplicacion("Agenda Web", "03"));
		listaAplicaciones.add(new Aplicacion("ServiciosAutosura", "04"));
		listaAplicaciones.add(new Aplicacion("Gestion de Riesgos", "05"));
		listaAplicaciones.add(new Aplicacion("Modulo Integrado de Consultas",
				"06"));
		listaAplicaciones.add(new Aplicacion("Consatrack", "07"));
		listaAplicaciones.add(new Aplicacion("Arboles de Decision", "08"));
		listaAplicaciones.add(new Aplicacion("MEVI", "09"));
		listaAplicaciones.add(new Aplicacion("ConectaT", "10"));
	}

	public DataStore() 
	{
		super();
	}

}
