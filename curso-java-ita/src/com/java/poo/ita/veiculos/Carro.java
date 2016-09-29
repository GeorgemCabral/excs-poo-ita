package com.java.poo.ita.veiculos;

public class Carro {
	Integer velocidade;
	Integer potencia;
	String modelo;
	
	
	void acelerar(){
		velocidade += potencia;
	}
	
	void frear(){
		velocidade = velocidade / 2;
	}
	
	Integer getVelocidade(){
		return velocidade;
	}
	
	void imprimir(){
		System.out.println("O " +modelo+ " está a " +velocidade+ " km/h!");
	}

}
