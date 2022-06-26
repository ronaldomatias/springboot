package com.projetospring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetospring.api.repository.maps.ProdutoMap;

public interface ProdutoRepository extends JpaRepository<ProdutoMap, Long> {


}
