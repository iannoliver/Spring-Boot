package com.projeto.bancoacesso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.bancoacesso.models.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {

}
