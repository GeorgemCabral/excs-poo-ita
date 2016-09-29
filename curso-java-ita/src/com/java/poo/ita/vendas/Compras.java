package com.java.poo.ita.vendas;

public class Compras {
	
	Integer valorTotal;
	Integer numeroParcelas;
	
	
	public Compras (Integer valor){
		valorTotal = valor;
		numeroParcelas = 1;
	}
	public Compras (Integer valorParcela, int qtdParcelas){
		numeroParcelas = qtdParcelas;
		valorTotal = valorParcela * qtdParcelas; 
	}
	
	
	public Integer getValorTotal() {
		return valorTotal;
	}
	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}
	public Integer getValorParcelas() {
		return valorTotal/numeroParcelas;
	}

}
