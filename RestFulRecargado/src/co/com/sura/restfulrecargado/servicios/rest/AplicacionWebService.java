package co.com.sura.restfulrecargado.servicios.rest;

import java.util.List;

import javax.jws.WebService;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.com.sura.restfulrecargado.modelo.Aplicacion;
import co.com.sura.restfulrecargado.persistencia.AplicacionDAO;
import co.com.sura.restfulrecargado.persistencia.DataStore;

@WebService
@Path(value = "/aplicacion")
public class AplicacionWebService 
{
	private AplicacionDAO aplicacionDAO;

	public AplicacionWebService() 
	{
		aplicacionDAO = new AplicacionDAO();
	}
	
	@POST
	@Produces(value = {MediaType.APPLICATION_JSON})
	@Consumes(value = {MediaType.APPLICATION_JSON})
	public Aplicacion crear(Aplicacion aplicacion) 
	{
		return (aplicacionDAO.crear(aplicacion));
	}
	
	@GET
	@Path(value = "/nombreAplicacion")
	@Produces(value = {MediaType.APPLICATION_JSON})
	public Aplicacion buscar(@QueryParam (value = "nombreAplicacion")String nombreAplicacion) 
	{
		return (aplicacionDAO.buscar(nombreAplicacion));
	}
	
	@GET
	@Produces(value = {MediaType.APPLICATION_JSON})
	public List<Aplicacion> buscarTodas() 
	{
		return (aplicacionDAO.buscarTodas());
	}
	
	@DELETE
	@Produces(value = {MediaType.APPLICATION_JSON})
	public Aplicacion borrarAplicacion(@QueryParam (value = "nombreAplicacion")String nombreAplicacion)
	{
		return (aplicacionDAO.borrarAplicacion(nombreAplicacion));
	}
	
	@PUT
	@Produces(value = {MediaType.APPLICATION_JSON})
	@Consumes(value = {MediaType.APPLICATION_JSON})
	public Aplicacion actualizarAplicacion(Aplicacion aplicacion)
	{
		return (aplicacionDAO.actualizarAplicacion(aplicacion));
	}
	
}
