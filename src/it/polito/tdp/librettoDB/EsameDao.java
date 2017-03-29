package it.polito.tdp.librettoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import it.polito.tdp.libretto_model.Esame;

public class EsameDao {

	public Esame find (String codice){
		
		String sql=
			"SELECT codice,titolo,docente,superato,voto,data_sup "+
			"FROM esame "+
			"WHERE codice=?";
		
		String jdbcURL= "jdbc:mysql://localhost/libretto?user=root&password=root";
		Esame result=null;
		try{
			Connection conn= DriverManager.getConnection(jdbcURL);
			PreparedStatement st=conn.prepareStatement(sql);
			
			st.setString(1, codice);
			ResultSet res= st.executeQuery();
			if(res.next()){
				
				Esame es = new Esame(res.getString("codice"), res.getString("titolo"), res.getString("docente"));
			//TODO: estrarre anche voto e data_sup	
				result= es;
				
			} else{
				result=null;
			}
			conn.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public boolean create(Esame e){
		String sql= "INSERT INTO `libretto`.`esame` (`codice`, `titolo`, `docente`) VALUES ('?', '?', '?');";
		String jdbcURL= "jdbc:mysql://localhost/libretto?user=root&password=root";
		
		try {
			Connection conn= DriverManager.getConnection(jdbcURL);
			
			PreparedStatement st=conn.prepareStatement(sql);
			
			st.setString(1, e.getCodice());
			st.setString(2, e.getTitolo());
			st.setString(3, e.getDocente());
			
			int result= st.executeUpdate();
			
			conn.close();
			
			if(result==1){
				return true;
			} else{
				return false;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}
}
