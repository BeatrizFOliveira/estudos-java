public class Fabricante {
    String nome;
    String endereco;

    public Fabricante(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public Fabricante(){

    }

    @Override
    public String toString() {
        return "Fabricante {" +
            "nome='" + nome + '\'' +
            ", endereco='" + endereco + '\'' +
            '}';
    }
}
