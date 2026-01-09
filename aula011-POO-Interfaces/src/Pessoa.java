public class Pessoa implements Persistivel{ //Nesse caso está implementando a interface Persistivel, por isso usa o implements
    
    private Long id;
    String nome;
    int idade;
    Endereco endereco;


    //Método Construtor
    public Pessoa(){}


    //Implementação dos métodos da interface, para mais explicações vá para Cep.java
    @Override
    public long getId(){
        return id;
    }

    @Override
    public Persistivel cadastrar(Persistivel p){
        //Aqui ficaria as funções para cadastar
        return p;
    }

    @Override
    public Persistivel consultar(long id){
        //Aqui ficaria as funções para consultar
        return this; //Retora a própria classe Pessoa
    }

    @Override
    public Persistivel alterar(Persistivel p){
        //Aqui ficaria as funções para alterar
        return p;
    }

    @Override
    public boolean excluir(long id){
        //Aqui ficaria as funções para excluir
        return true; //Retorna true caso tenha sido excluido com sucesso.
    }
}
