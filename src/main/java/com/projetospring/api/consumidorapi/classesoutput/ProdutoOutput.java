package com.projetospring.api.consumidorapi.classesoutput;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect (fieldVisibility = Visibility.ANY)
public class ProdutoOutput {

	private String name;
	private Double totalProdutosVendidos;
	
	public Double getTotalProdutosVendidos() {
		return totalProdutosVendidos;
	}

	public void setTotalProdutosVendidos(Double totalProdutosVendidos) {
		this.totalProdutosVendidos = totalProdutosVendidos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
