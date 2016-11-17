package it.alfasoft.fabrizio.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dipendente {
	
	private String codice;
	private String cognome;
	private String nome;
	private double stipendio;
	
	public Dipendente(){}
	public Dipendente(String cognome, String nome, double stipendio, String codice) {
		this.codice = codice;
		this.cognome = cognome;
		this.nome = nome;
		this.stipendio = stipendio;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
}
