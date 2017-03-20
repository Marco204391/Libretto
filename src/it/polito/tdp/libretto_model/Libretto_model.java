package it.polito.tdp.libretto_model;

import java.util.ArrayList;
import java.util.List;

public class Libretto_model {
	
	private List<Esame> esami;
	
	public Libretto_model(){
		this.esami=  new ArrayList<Esame>();
	}

	/**
	 * Aggiunge un nuove esame all'elenco degli esami presenti
	 * @param e
	 */
	public void addEsame(Esame e){
		esami.add(e);
	}
}
