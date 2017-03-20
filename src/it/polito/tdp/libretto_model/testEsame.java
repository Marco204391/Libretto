package it.polito.tdp.libretto_model;

import java.time.LocalDate;

public class testEsame {

	public static void main(String[] args){
		Esame tdp= new Esame("ovfsd", "tdp", "Fulvio Corno");
		System.out.println(tdp);
		Esame ami = new Esame("hffhdf", "ami", "Fulvio Corno");
		System.out.println(ami);
		System.out.println(ami.equals(tdp));
		
		
		tdp.supera(30, LocalDate.now());
		System.out.println(tdp);
		
		
	}
}
