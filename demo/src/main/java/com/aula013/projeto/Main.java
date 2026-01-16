package com.aula013.projeto;

import java.util.List;

import javax.swing.JOptionPane;

// import java.math.BigDecimal;
// import java.time.LocalDateTime;
// import com.aula013.projeto.model.Produto;
// import com.aula013.projeto.repositorio.ProdutoColletionRepository;
import com.aula013.projeto.model.Categoria;
import com.aula013.projeto.model.Produto;
import com.aula013.projeto.repositorio.CategoriaCollectionRepository;
import com.aula013.projeto.repositorio.ProdutoColletionRepository;
import com.aula013.projeto.view.CategoriaView;
import com.aula013.projeto.view.Opcao;
import com.aula013.projeto.view.OpcaoView;
import com.aula013.projeto.view.ProdutoView;



public class Main {
    public static void main(String[] args) {
        
        // Categoria categoria = new Categoria();
        // categoria.setNome("Eletronicos");
        // Categoria categoriaSalva = CategoriaCollectionRepository.save(categoria);
        // System.out.println("Categoria: " + categoriaSalva);

        // Produto produto = new Produto();
        // produto
        //     .setNome("Kindle")
        //     .setDescricao("E-Reader")
        //     .setCategoria(CategoriaCollectionRepository.findByNome("Eletrônicos").get(0))
        //     .setDataDeCadastro(LocalDateTime.now())
        //     .setPreco(BigDecimal.valueOf(800));
        // Produto produto1 = ProdutoColletionRepository.save(produto);
        // System.out.println("id: " + produto1.getId() + " " + "Produto1: " + produto1.getNome());

        Opcao opcao = null;

        do {
            opcao = OpcaoView.select();
            switch (opcao) {
                case CADASTRAR_CATEGORIA -> cadastrarCategoria();
                case CADASTRAR_PRODUTO -> cadastrarProduto();
                case ALTERAR_PRODUTO -> alterarProduto();
                case CONSULTAR_PRODUTO_POR_ID -> consultarProdutoPorID();
                case CONSULTAR_PRODUTO_POR_CATEGORIA -> consultarProdutoPorCategoria();
                case ENCERRAR_SISTEMA -> encerrarOSistema();
            }
        } while (opcao != Opcao.ENCERRAR_SISTEMA);
    }

    private static void cadastrarCategoria(){
        CategoriaView view = new CategoriaView();
        Categoria categoria = CategoriaView.form(new Categoria());
        CategoriaCollectionRepository.save(categoria);
        view.sucesso(categoria);
    }
    private static void cadastrarProduto(){
        Produto produto = ProdutoView.form(new Produto());
        ProdutoColletionRepository.save(produto);
        ProdutoView.sucesso(produto);
    }
    private static void alterarProduto(){
        Produto produto = ProdutoView.select(null);
        ProdutoView.update(produto);
    }
    private static void consultarProdutoPorID(){
        Long id = 0l;
        do {
            try{
                id = Long.parseLong(JOptionPane.showInputDialog("Informe o id do produto"));
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "ID inválido");
            }
        } while (id <=0);

        Produto p = ProdutoColletionRepository.findById(id);
        if(p != null){
            ProdutoView.show(p);
        } else{
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }
    }
    private static void consultarProdutoPorCategoria(){
        Categoria categoria = CategoriaView.select(null);
        List<Produto> produtos = ProdutoColletionRepository.findByCategoria(categoria);

        if(produtos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não encontrarmos produtos com a categoria " + categoria.getNome());
        }else{
            produtos.forEach(ProdutoView::show);
            produtos.forEach(System.out::println);
        }
    }
    private static void encerrarOSistema(){
        System.exit(0);
    }
}