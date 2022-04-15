package com.ies.ronaldo.projetospring.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ies.ronaldo.projetospring.domain.Anime;

@RestController
@RequestMapping("anime")
public class AnimeController {

	@GetMapping(path="list")
	public List<Anime> lista(){
		
		List<Anime> lista = new ArrayList<Anime>();
		lista.add(new Anime("Ronaldo"));
		lista.add(new Anime("Matias"));
		
		return lista ;
	}
}
