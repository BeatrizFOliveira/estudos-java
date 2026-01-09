/*
Essa é uma interface ou seja, ela funciona como um contrato. Ao ser implementada em uma classe, a classe terá de implementar todos os métodos
da interface.

Para criar uma interface basta no lugar de class colocar a palavra interface.
Dentro dela deve haver os métodos que serão implementados.
*/
public interface Persistivel {

    //Nesse caso temos os métodos captar o Id, cadastrar, consultar, alterar e excluir.

    public long getId();
    public Persistivel cadastrar(Persistivel p);
    public Persistivel consultar(long id);
    public Persistivel alterar(Persistivel p);
    public boolean excluir(long id);
}
