package controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VentanaInicioController {
	@FXML
	private Button iniciarBTN;

	private void abrirVentanaLogin() {
        try {
            // Cargar la ventana de login desde el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VentanaLogin.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Login");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
