package it.alfasoft.fabrizio.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dipendente {
	
	private String nome;
	private String cognome;
	private double stipendio;
	private String codice;
	private List<Link> links;
	
	public Dipendente() {
	}

	public Dipendente(String nome, String cognome, 
			double stipendio, String codice) {
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
		this.codice = codice;
		this.links = new ArrayList<Link>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public void addLink(String link, String rel){
		Link l = new Link (link, rel);
		this.links.add(l);
	}
	

}
