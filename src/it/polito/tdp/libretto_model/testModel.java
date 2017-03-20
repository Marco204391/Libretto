package it.polito.tdp.libretto_model;

public class testModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libretto_model m = new Libretto_model();
		
		m.addEsame(new Esame("ovfsd", "tdp", "Fulvio Corno"));
		m.addEsame(new Esame("hffhdf", "ami", "Fulvio Corno"));
		
		System.out.println(m.trovaEsame("ovfsd"));
		System.out.println(m.trovaEsame("hffhdf"));
		System.out.println(m.trovaEsame("asafsfagag"));
	}

}
