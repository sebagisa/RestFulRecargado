package co.com.sura.restfulrecargado.modelo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(value = XmlAccessType.PROPERTY)

public class Aplicacion implements Serializable
{
	private String nombreAplicacion;
	private String codigoAplicacion;
	private String descripcionAplicacion;
	private String valoracionAplicacion;
	
	
	public Aplicacion() 
	{
	
	}

	public Aplicacion(String nombreAplicacion, String codigoAplicacion) 
	{
		super();
		this.nombreAplicacion = nombreAplicacion;
		this.codigoAplicacion = codigoAplicacion;
	}

	public Aplicacion(String nombreAplicacion, String codigoAplicacion,	String descripcionAplicacion, String valoracionAplicacion) 
	{
		super();
		this.nombreAplicacion = nombreAplicacion;
		this.codigoAplicacion = codigoAplicacion;
		this.descripcionAplicacion = descripcionAplicacion;
		this.valoracionAplicacion = valoracionAplicacion;
	}

	public String getNombreAplicacion() 
	{
		return nombreAplicacion;
	}
	
	public void setNombreAplicacion(String nombreAplicacion) 
	{
		this.nombreAplicacion = nombreAplicacion;
	}
	
	public String getCodigoAplicacion() 
	{
		return codigoAplicacion;
	}
	
	public void setCodigoAplicacion(String codigoAplicacion) 
	{
		this.codigoAplicacion = codigoAplicacion;
	}
	public String getDescripcionAplicacion() 
	{
		return descripcionAplicacion;
	}
	
	public void setDescripcionAplicacion(String descripcionAplicacion) 
	{
		this.descripcionAplicacion = descripcionAplicacion;
	}
	
	public String getValoracionAplicacion() 
	{
		return valoracionAplicacion;
	}
	
	public void setValoracionAplicacion(String valoracionAplicacion) 
	{
		this.valoracionAplicacion = valoracionAplicacion;
	}
	
}
