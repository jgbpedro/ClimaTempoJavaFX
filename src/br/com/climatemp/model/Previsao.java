package br.com.climatemp.model;

import javafx.scene.image.Image;

public class Previsao {

	private String data;
	private int tempMax;
	private int tempMin;
	private Image imagem;


	public Previsao() {
	}

	public Previsao(String data, int tempMax,int tempMin,
			Image imagem) {

		this.data = data;
		this.tempMax = tempMax;
		this.tempMin = tempMin;
		this.imagem = imagem;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s - max: %d , min %d",
				data, tempMax, tempMin);
	}


	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getTempMax() {
		return tempMax;
	}
	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}
	public int getTempMin() {
		return tempMin;
	}
	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}
	public Image getImagem() {
		return imagem;
	}
	public void setImagem(Image imagem) {
		this.imagem = imagem;
	}



}
