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
	 * verificando che non ci sia già
	 * @param e
	 */
	public boolean addEsame(Esame e){
		if(!esami.contains(e)){
			esami.add(e);
			return true;
		}
		else{
			return false;
			//in caso in cui avremmo voluto gestire con un eccezione la failure guardare sotto
			//come da codice gestisto l'errore ritornando un boolean rispetto al void
			//throw new IllegalArgumentException("Esame "+e.getCodice()+e.getTitolo()+" già esistente");
		}
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato 
	 * se esiste, lo restituisce, altirmenti restituisce null
	 * @param codice codice dell'esame da ricercare
	 * @return l'esame trovato, oppure null se non trovato
	 */
	
	
	public Esame trovaEsame (String codice){
		int pos= this.esami.indexOf(new Esame(codice, null, null));//creo l'oggetto perchè index of confronta oggetti(altrimenti avrei comparato una stringa con un oggetto e no va assolutamente bene)
		if(pos==-1){
			return null;
		}else{
			return esami.get(pos);
		}
	}
}
