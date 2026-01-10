package com.aula013.projeto.model;

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class Produto {
    private long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private LocalDateTime dataDeCadastro;
    private Categoria categoria;

    //CONSTRUTORES------------------------------------------------------
    public Produto(){}
    public Produto(long id, String nome, String descricao, BigDecimal preco, LocalDateTime dataDeCadastro,
            Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.dataDeCadastro = dataDeCadastro;
        this.categoria = categoria;
    }
    public Produto(String nome, String descricao, BigDecimal preco, LocalDateTime dataDeCadastro, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.dataDeCadastro = dataDeCadastro;
        this.categoria = categoria;
    }

    //GETTER AND SETTER -------------------------------------
    public long getId() {
        return id;
    }
    public Produto setId(long id) {
        this.id = id;
        return this;
    }
    public String getNome() {
        return nome;
    }
    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public String getDescricao() {
        return descricao;
    }
    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public Produto setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }
    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }
    public Produto setDataDeCadastro(LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
        return this;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public Produto setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    };

    //TO STRING----------------------------------------------
    @Override
    public String toString() {
        return nome.toUpperCase();
    }

    //HASHCODE E EQUALS--------------------------------------
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
    
}
