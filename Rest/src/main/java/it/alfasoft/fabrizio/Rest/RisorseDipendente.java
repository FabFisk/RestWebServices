package it.alfasoft.fabrizio.Rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import it.alfasoft.fabrizio.dao.DipendenteDAO;
import it.alfasoft.fabrizio.model.Dipendente;

@Path("dipendente")
public class RisorseDipendente {
	
	private DipendenteDAO dDao = new DipendenteDAO();
	
//	@Path("{codice}")
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public Dipendente getDipConCodice(@PathParam("codice")String code){
//		return dDao.getDipendenti().get(code);
//	}
	
//	@Path("/tutti")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Dipendente> getDipendenti(){
//		return new ArrayList<Dipendente>(dDao.getDipendenti().values());
//	}
	
//	@Path("/{num}")
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String testConversion(@PathParam("num")int numero){
//		return numero+" "+numero*2;
//	}
	
//	@Path("{codice}")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Dipendente getDipConCodice(@PathParam("codice")String code){
//		return dDao.getDipendenti().get(code);
//	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void addDipendente(Dipendente d){
		dDao.getDipendenti().put(d.getCodice(), d);
		System.out.println(d.getCognome()+" "+d.getNome());
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public void updateDipendente(Dipendente d2){
		dDao.getDipendenti().put(d2.getCodice(), d2);
		for(Dipendente d: dDao.getDipendenti().values()){
			System.out.println(d.getCognome()+" "+d.getNome());			
		}		
	}
	
	@Path("/elimina/{codice}/")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteDipendente(@PathParam("codice")String code){
		Dipendente d1 = dDao.getDipendenti().remove(code);
		System.out.println(d1.getCognome());
		for(Dipendente d: dDao.getDipendenti().values()){
			System.out.println(d.getCognome()+" "+d.getNome());			
		}		
	}
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Dipendente testQueryParam(@QueryParam("codice")String code){		
//		return dDao.getDipendenti().get(code);
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public void testQueryParam(@QueryParam("codice")String code,
										@QueryParam("num")int numero){		
		System.out.println(dDao.getDipendenti().get(code)+" "+numero);
	}
	
	
}
