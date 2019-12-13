package application;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * Clase controlador para la vista Uranus.fxml
 * 
 * @author andrea
 *
 */
public class ControlRocket2 {

	@FXML
	private AnchorPane opacityPane, drawerPane;

	@FXML
	private ImageView drawerImage;

	/**
	 * Método inicial que arranca la aplicación con sus transiciones
	 */
	public void initialize() {

		opacityPane.setVisible(false);

		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(0.5), drawerPane);
		translateTransition.setByX(-200);
		translateTransition.play();

		drawerImage.setOnMouseClicked(event -> {

			opacityPane.setVisible(true);

			FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(0.5), opacityPane);
			fadeTransition1.setFromValue(0);
			fadeTransition1.setToValue(0.3);
			fadeTransition1.play();

			TranslateTransition translateTransition1 = new TranslateTransition(Duration.seconds(0.5), drawerPane);
			translateTransition1.setByX(200);
			translateTransition1.play();
		});

		opacityPane.setOnMouseClicked(event -> {

			FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(0.5), opacityPane);
			fadeTransition1.setFromValue(0.3);
			fadeTransition1.setToValue(0);
			fadeTransition1.play();

			fadeTransition1.setOnFinished(event1 -> {
				opacityPane.setVisible(false);
			});

			TranslateTransition translateTransition1 = new TranslateTransition(Duration.seconds(0.5), drawerPane);
			translateTransition1.setByX(-200);
			translateTransition1.play();
		});

	}
}
