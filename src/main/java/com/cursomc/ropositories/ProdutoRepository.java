package com.cursomc.ropositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
