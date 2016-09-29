package com.java.poo.ita.veiculos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro();
		c1.velocidade = 0;
		c1.potencia = 15;
		c1.modelo = "Mustang";
		
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		
		c1.imprimir();
	}

}
