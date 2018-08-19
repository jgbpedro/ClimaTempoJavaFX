package br.com.climatemp.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Janelas {

	public void abrir(String fxml, Stage primaryStage){


		try {
			Parent p = FXMLLoader.load(getClass().getResource(fxml));

			primaryStage.setScene(new Scene(p));
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
}
