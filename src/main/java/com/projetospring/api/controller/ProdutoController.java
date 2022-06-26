package com.projetospring.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetospring.api.repository.maps.ProdutoMap;
import com.projetospring.api.service.ProdutoService;

@RestController
@RequestMapping(value = "/api")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;

	@GetMapping("/produtos")
	private List<ProdutoMap> buscarTodos() {

		return produtoService.findAll();
	}

	@GetMapping("/produto/{id}")
	private Optional<ProdutoMap> buscarPorId(@PathVariable(value = "id") Long id) {

		return produtoService.findById(id);
	}

	@PostMapping("/produto")
	private ProdutoMap salvar(@RequestBody ProdutoMap produto) {

		return produtoService.save(produto);
	}

	@DeleteMapping("/produto")
	private void deletar(@RequestBody ProdutoMap produto) {

		produtoService.delete(produto);
	}
	
	@PutMapping("/produto")
	private void atualizar(@RequestBody ProdutoMap produto) {

		produtoService.put(produto);
	}

}
