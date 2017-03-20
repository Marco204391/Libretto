package it.polito.tdp.libretto_;

	/**
	 * Sample Skeleton for 'Libretto.fxml' Controller Class
	 */
	import java.net.URL;
	import java.util.ResourceBundle;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;

	public class LibrettoController {

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

	    }

	    @FXML
	    void handleInserisci(ActionEvent event) {
	    	//recupera i dati dalla vista
	    	
	    	//verifica la validità dei dati
	    	
	    	//chiedi al model di effettuare l'operazione
	    	
	    	//aggiorna la vista con il risultato dell'operazione
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
	}
