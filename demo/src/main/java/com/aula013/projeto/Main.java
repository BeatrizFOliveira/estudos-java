package com.aula013.projeto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.aula013.projeto.model.Categoria;
import com.aula013.projeto.model.Produto;


public class Main {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setId(1l).setNome("Eletronicos");

        Produto produto = new Produto();
        produto
            .setId(1l)
            .setNome("Kindle")
            .setDescricao("E-Reader")
            .setCategoria(categoria)
            .setDataDeCadastro(LocalDateTime.now())
            .setPreco(BigDecimal.valueOf(800));


        System.out.println("Categoria: " + categoria);
        System.out.println("Produto: " + produto);
    }
}