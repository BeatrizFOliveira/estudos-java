package com.aula013.projeto.model;

public class Categoria {

    private long id;
    private String nome;

    //CONSTRUTORES--------------------------------------------
    public Categoria(){}
    public Categoria(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Categoria(String nome) {
        this.nome = nome;
    }
    
    //GETTER E SETTER-----------------------------------------
    public long getId() {
        return id;
    }
    public Categoria setId(long id) {
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
        return nome.toUpperCase();
    }

    //HASHCODE E EQUALS---------------------------------------
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Categoria other = (Categoria) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

}
