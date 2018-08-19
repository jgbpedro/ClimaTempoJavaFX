package br.com.climatemp.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {


		Janelas j = new Janelas();
		j.abrir("Previsoes.fxml", primaryStage);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
