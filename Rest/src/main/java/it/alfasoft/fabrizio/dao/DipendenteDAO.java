package it.alfasoft.fabrizio.dao;

import it.alfasoft.fabrizio.model.Dipendente;

import java.util.Map;
import java.util.TreeMap;

public class DipendenteDAO {
	
	private Map<String, Dipendente> dipendenti;

	public DipendenteDAO() {
		this.dipendenti = new TreeMap<String, Dipendente>();
		Dipendente d1 = new Dipendente("aaa", "aaa", 1100.0, "aaa1");
		Dipendente d2 = new Dipendente("bbb", "bbb", 1200.0, "bbb2");
		Dipendente d3 = new Dipendente("ccc", "ccc", 1300.0, "ccc3");
		Dipendente d4 = new Dipendente("ddd", "ddd", 1400.0, "ddd4");
		Dipendente d5 = new Dipendente("eee", "eee", 1500.0, "eee5");
		dipendenti.put(d1.getCodice(), d1);
		dipendenti.put(d2.getCodice(), d2);
		dipendenti.put(d3.getCodice(), d3);
		dipendenti.put(d4.getCodice(), d4);
		dipendenti.put(d5.getCodice(), d5);
	}

	public Map<String, Dipendente> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Map<String, Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	

	
}
