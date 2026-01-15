package com.aula013.projeto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.aula013.projeto.model.Categoria;
import com.aula013.projeto.model.Produto;
import com.aula013.projeto.repositorio.CategoriaCollectionRepository;
import com.aula013.projeto.repositorio.ProdutoColletionRepository;


public class Main {
    public static void main(String[] args) {
        
        Categoria categoria = new Categoria();
        categoria.setNome("Eletronicos");
        Categoria categoriaSalva = CategoriaCollectionRepository.save(categoria);
        System.out.println("Categoria: " + categoriaSalva);

        Produto produto = new Produto();
        produto
            .setNome("Kindle")
            .setDescricao("E-Reader")
            .setCategoria(CategoriaCollectionRepository.findByNome("Eletrônicos").get(0))
            .setDataDeCadastro(LocalDateTime.now())
            .setPreco(BigDecimal.valueOf(800));
        Produto produto1 = ProdutoColletionRepository.save(produto);
        System.out.println("id: " + produto1.getId() + "Produto1: " + produto1.getNome());
    }
}