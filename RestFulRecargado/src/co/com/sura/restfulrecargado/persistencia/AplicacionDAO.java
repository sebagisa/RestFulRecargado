package co.com.sura.restfulrecargado.persistencia;

import java.util.List;

import co.com.sura.restfulrecargado.modelo.Aplicacion;

public class AplicacionDAO {

	public AplicacionDAO() {
		super();
	}

	public Aplicacion crear(Aplicacion aplicacion) 
	{
		Aplicacion nuevaAplicacion = new Aplicacion();
		nuevaAplicacion = buscar(aplicacion.getNombreAplicacion());
		
		if (nuevaAplicacion == null)
		{
			DataStore.listaAplicaciones.add(aplicacion);
		}
		return aplicacion;
	}

	public Aplicacion buscar(String nombreAplicacion) 
	{
		for (Aplicacion aplicacion : DataStore.listaAplicaciones) 
		{
			if (aplicacion.getNombreAplicacion().equals(nombreAplicacion)) 
			{
				return aplicacion;
			}
		}
		return null;
	}
	
	public List<Aplicacion> buscarTodas() 
	{
		return DataStore.listaAplicaciones;
	}
	
	public Aplicacion borrarAplicacion(String nombreAplicacion)
	{
		Aplicacion aplicacionABorrar = buscar(nombreAplicacion);
		
		if (aplicacionABorrar != null)
		{
			DataStore.listaAplicaciones.remove(aplicacionABorrar);
		}
		
		return aplicacionABorrar;
	}
	
	public Aplicacion actualizarAplicacion(Aplicacion aplicacion)
	{
		Aplicacion aplicacionActualizar = buscar(aplicacion.getNombreAplicacion());
		
		if (aplicacionActualizar != null)
		{
			int indice = DataStore.listaAplicaciones.indexOf(aplicacionActualizar);
			DataStore.listaAplicaciones.add(indice, aplicacion);
		}
		else
		{
			crear(aplicacion);
		}
		return aplicacion;
	}
}
