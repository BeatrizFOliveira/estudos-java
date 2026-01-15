package com.aula013.projeto.model;

import java.util.Objects;

public class Categoria {

    private Long id;
    private String nome;

    //CONSTRUTORES--------------------------------------------
    public Categoria(){}
    public Categoria(Long id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }
    public Categoria(String nome) {
        this.setNome(nome);
    }
    
    //GETTER E SETTER-----------------------------------------
    public Long getId() {
        return id;
    }
    public Categoria setId(Long id) {
        this.id = id;
        return this;
    }
    public String getNome() {
        return nome;
    }
    public Categoria setNome(String nome) {
        this.nome = nome;
        return this;
    }

    //TO STRING-----------------------------------------------
    @Override
    public String toString() {
        return getNome().toUpperCase();
    }

    //HASHCODE E EQUALS---------------------------------------
    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Categoria categoria  = (Categoria) o;
        return Objects.equals(getNome(), categoria.getNome()); 
    }

}
