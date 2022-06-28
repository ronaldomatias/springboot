package com.projetospring.api.consumidorapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.projetospring.api.consumidorapi.classesoutput.ProdutoOutput;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OrderClient {

	private final WebClient webClient;

	public OrderClient(WebClient.Builder builder) {
		this.webClient = builder.baseUrl("https://api-teste-app.herokuapp.com").build();
	}
	
	public Flux<ProdutoOutput> top10Produtos() {
		
		return webClient
				.get()
				.uri("/toptensellingproducts")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.onStatus(HttpStatus::is4xxClientError, error -> Mono.error(new RuntimeException("Verifique os parâmetros")))
				.bodyToFlux(ProdutoOutput.class);
	}
	
	
	
}
