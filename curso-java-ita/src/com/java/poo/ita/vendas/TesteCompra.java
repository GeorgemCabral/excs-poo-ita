package com.java.poo.ita.vendas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompra {

	@Test
	public void comprasAvista(){
		Compras cmp = new Compras(800);
		
		assertEquals((Integer)1, cmp.getNumeroParcelas());
		assertEquals((Integer)800, cmp.getValorParcelas());
		assertEquals((Integer)800, cmp.getValorTotal());
	}
	
	@Test
	public void comprasParcelada(){
		Compras cmp = new Compras(200,4);
		
		assertEquals((Integer)4, cmp.getNumeroParcelas());
		assertEquals((Integer)200, cmp.getValorParcelas());
		assertEquals((Integer)800, cmp.getValorTotal());
	}

}
