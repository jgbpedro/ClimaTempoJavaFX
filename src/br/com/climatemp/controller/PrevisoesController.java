package br.com.climatemp.controller;

import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import br.com.climatemp.model.Previsao;
import br.com.climatemp.view.Janelas;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class PrevisoesController implements Initializable {


	@FXML ListView<Previsao> lstPrevisoes;

	public static Previsao itemSelecionado= null;

	List<Previsao> lstInterna = new ArrayList<>();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		//Preencher dados Fake
		Image img =new Image(getClass()
				.getResource("img/img28.png").toString()) ;

		Previsao p = new Previsao("19/05/2016",
				19, 14, img);
		lstInterna.add(p);

		img =new Image(getClass()
				.getResource("img/img30.png").toString()) ;
		p = new Previsao("20/05/2016",
				25, 19, img);
		lstInterna.add(p);


		img =new Image(getClass()
				.getResource("img/img32.png").toString()) ;
		p = new Previsao("20/05/2016",
				24, 17, img);
		lstInterna.add(p);


		img =new Image(getClass()
				.getResource("img/img35.png").toString()) ;
		p = new Previsao("20/05/2016",
				29, 23, img);
		lstInterna.add(p);


		for(Previsao item : lstInterna){
			lstPrevisoes.getItems().add(item);
		}


		//Definir ação para quando um item for selecionado
		lstPrevisoes.getSelectionModel().selectedIndexProperty().addListener(l->{


			itemSelecionado = lstPrevisoes.getSelectionModel()
					.getSelectedItem();


			Janelas j = new Janelas();

			Stage mesmaJanela = (Stage)lstPrevisoes
					.getScene().getWindow();

			j.abrir("Detalhes.fxml", mesmaJanela);

			System.out.println(lstPrevisoes.getSelectionModel().getSelectedItem());

		});






	}

}
