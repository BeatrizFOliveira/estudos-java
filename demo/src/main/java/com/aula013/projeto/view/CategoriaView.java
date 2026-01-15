package com.aula013.projeto.view;

import javax.swing.JOptionPane;

import com.aula013.projeto.model.Categoria;
import com.aula013.projeto.repositorio.CategoriaCollectionRepository;

public class CategoriaView {

    static CategoriaCollectionRepository repository;

    public static Categoria select(Categoria categoria){
        Categoria ret = (Categoria) JOptionPane.showInputDialog(null,
             "Selecione uma categoria",
              "Menu",
               JOptionPane.QUESTION_MESSAGE,
                null, 
                repository.findAll().toArray(),
                 categoria == null ? 1 : categoria);
        
        return ret;
    }

    public void sucesso(){
        JOptionPane.showMessageDialog(null, "A categoria foi salva com sucesso");
    }
    public void sucesso(Categoria categoria){
        JOptionPane.showMessageDialog(null, "A categoria " + categoria.getNome() + "  foi salva com sucesso");
    }

    public Categoria form(){
        String nome = JOptionPane.showInputDialog(null, "Informe o nome da categoria");
        return new Categoria(nome);
    }
}
