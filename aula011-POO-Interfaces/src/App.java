public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa cliente1 = new Pessoa();

        cliente1.nome = "Ana";
        cliente1.idade = 18;
        cliente1.endereco = new Endereco("Rua 77", "Presidente Prudente", new Cep("86553-045"));

        System.out.println(cliente1.endereco.cep);

    }
}
