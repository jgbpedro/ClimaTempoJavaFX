package br.com.climatemp.controller;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import br.com.climatemp.model.Previsao;
import br.com.climatemp.view.Janelas;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class DetalhesController implements Initializable {

    @FXML Label lblData;
    @FXML Label lblTempMax;
    @FXML Label lblTempMin;
    @FXML ImageView imgClima;
    @FXML Button btnVoltar;

    Previsao previsao = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    	//acessando o item estatico da previsão controller
    	previsao = PrevisoesController.itemSelecionado;


        lblData.setText(previsao.getData());
        lblTempMax.setText( String.format("%dº", previsao.getTempMax()));
        lblTempMin.setText( String.format("%dº", previsao.getTempMin()));

        imgClima.setImage(previsao.getImagem());


        //clique do botão voltar
        btnVoltar.setOnAction(  x -> {

        	Janelas j = new Janelas();
        	Stage m = (Stage) btnVoltar.getScene()
        			.getWindow();

        	j.abrir("Previsoes.fxml", m);

        	//data do sistema
        	Date d = new Date();
        	System.out.println(d);

        });

    }

}
