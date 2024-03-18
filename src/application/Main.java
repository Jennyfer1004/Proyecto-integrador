package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try
		{
			 FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/VentanaInicio.fxml"));
		     Parent root = loader.load();
		     Scene scene = new Scene(root);
		     primaryStage.setScene(scene);
		     primaryStage.setTitle("Inicio");
		     primaryStage.show();
		     
		     
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
