package it.polito.tdp.libretto_;
	
import it.polito.tdp.libretto_model.Libretto_model;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//dobbiamo riscrivere così fxml loader per il model
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Libretto.fxml"));
			BorderPane root = (BorderPane)loader.load();
			
			LibrettoController controller = loader.getController();
			Libretto_model model = new Libretto_model();
			controller.setModel(model);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
