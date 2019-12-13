package application;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Clase controlador para la vista Mars.fxml
 * 
 * @author andrea
 *
 */
public class ControlRocket {

	@FXML
	private AnchorPane mars;
	
	@FXML
	private ImageView imagenLogin;

	public void initialize() {
		FadeLogin();
	}

	/**
	 * Método para abrir una nueva ventana
	 */
	@FXML
	public void openStage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Urano.fxml"));
			AnchorPane root = loader.load();
			Stage stage = new Stage();
			stage.setTitle("Urano");
			stage.setScene(new Scene(root));
			stage.show();
			closeStage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que cierra el stage de la primera ventana de la aplicación
	 */
	public void closeStage() {
		Stage st = (Stage) mars.getScene().getWindow();
		st.close();
	}

	/**
	 * Transición del tipo Fade para la imagen del login que va apareciendo cuando
	 * se arranca la aplicación
	 */
	private void FadeLogin() {
		FadeTransition faded = new FadeTransition(Duration.seconds(5), imagenLogin);
		faded.setFromValue(0);
		faded.setToValue(1);
		faded.play();
	}

}
