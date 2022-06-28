package com.projetospring.api.consumidorapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetospring.api.consumidorapi.classesoutput.ProdutoOutput;
import com.projetospring.api.consumidorapi.clients.OrderClient;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/produtos")
public class OrderController {

	@Autowired
	OrderClient orderClient;

	@GetMapping("/top10produtos")
	private Flux<ProdutoOutput> top10Produtos() {
		
		return orderClient.top10Produtos();
	}
}
