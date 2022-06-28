package com.projetospring.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetospring.api.repository.ProdutoRepository;
import com.projetospring.api.repository.maps.ProdutoMap;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;

	public List<ProdutoMap> findAll() {
		return produtoRepository.findAll();
	}

	public Optional<ProdutoMap> findById(Long id) {
		return produtoRepository.findById(id);
	}

	public ProdutoMap save(ProdutoMap produto) {
		return produtoRepository.save(produto);
	}

	public void delete(ProdutoMap produto) {
		produtoRepository.delete(produto);
	}

	public ProdutoMap put(ProdutoMap produto) {
		return (produtoRepository.existsById(produto.getId()) == true) ? produtoRepository.save(produto) : null;
	}

}
