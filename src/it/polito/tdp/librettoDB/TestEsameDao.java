package it.polito.tdp.librettoDB;

import it.polito.tdp.libretto_model.Esame;

public class TestEsameDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EsameDao dao = new EsameDao();
		Esame e1= dao.find("03FYZ");
		System.out.println(e1);
		Esame e2= dao.find("03FYX");
		System.out.println(e2);
	}

}
