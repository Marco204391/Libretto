package it.polito.tdp.libretto_;

	/**
	 * Sample Skeleton for 'Libretto.fxml' Controller Class
	 */
	import java.net.URL;
	import java.util.ResourceBundle;

import it.polito.tdp.libretto_model.Esame;
import it.polito.tdp.libretto_model.Libretto_model;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;

	public class LibrettoController {
		
		Libretto_model model;

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="txtcod"
	    private TextField txtcod; // Value injected by FXMLLoader

	    @FXML // fx:id="txttitolo"
	    private TextField txttitolo; // Value injected by FXMLLoader

	    @FXML // fx:id="txtdocente"
	    private TextField txtdocente; // Value injected by FXMLLoader

	    @FXML // fx:id="btninserisci"
	    private Button btninserisci; // Value injected by FXMLLoader

	    @FXML // fx:id="btnCerca"
	    private Button btnCerca; // Value injected by FXMLLoader

	    @FXML // fx:id="txtmessage"
	    private TextArea txtmessage; // Value injected by FXMLLoader

	    @FXML
	    void handleCerca(ActionEvent event) {
	    	String codice = txtcod.getText();
	    	
	    	if(codice.length()<5){
	    		txtmessage.appendText("Codice corso non valido\n");
	    		return;
	    	}
	    	Esame e= model.trovaEsame(codice);
	    	
	    	if(e==null){
	    		txtmessage.appendText("Codice "+codice+" non trovato \n");
	    	}else{
	    		txtmessage.appendText("Codice "+codice+" trovato \n");
	    		
	    		txtcod.setText(e.getCodice());
	    		txttitolo.setText(e.getTitolo());
	    		txtdocente.setText(e.getDocente());
	    	}
	    		
	    }

	    @FXML
	    void handleInserisci(ActionEvent event) {
	    	//recupera i dati dalla vista
	    	String codice= txtcod.getText();
	    	String titolo= txttitolo.getText();
	    	String docente = txtdocente.getText();
	    	//verifica la validità dei dati
	    	if(codice.length()<5|| titolo.length()==0||docente.length()==0){
	    		txtmessage.appendText("Dati esame insufficente\n");
	    		return;
	    	}
	    	//chiedi al model di effettuare l'operazione
	    	Esame e= new Esame(codice, titolo, docente);
	    	boolean result =model.addEsame(e);
	    	//aggiorna la vista con il risultato dell'operazione
	    	if(result){
	    		txtmessage.appendText("Esame aggiunto correttamente \n");
	    	}else{
	    		txtmessage.appendText("Esame NON AGGIUNTO (codice duplicato)\n");
	    	}
	    }

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert txtcod != null : "fx:id=\"txtcod\" was not injected: check your FXML file 'Libretto.fxml'.";
	        assert txttitolo != null : "fx:id=\"txttitolo\" was not injected: check your FXML file 'Libretto.fxml'.";
	        assert txtdocente != null : "fx:id=\"txtdocente\" was not injected: check your FXML file 'Libretto.fxml'.";
	        assert btninserisci != null : "fx:id=\"btninserisci\" was not injected: check your FXML file 'Libretto.fxml'.";
	        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'Libretto.fxml'.";
	        assert txtmessage != null : "fx:id=\"txtmessage\" was not injected: check your FXML file 'Libretto.fxml'.";

	    }

		/**
		 * @param model the model to set
		 */
		public void setModel(Libretto_model model) {
			this.model = model;
		}
	}
