public class App {
    public static void main(String[] args) throws Exception {
        
        Computador computador1 = new Computador();

        //Por ter um construtur vazio é possível criar um objeto e inserir os atributos posteriormente.
        computador1.espacoHD = 16;
        computador1.marca = "Apple";
        computador1.modelo = "MacBook Pro";

        //Aqui é usado o construtor com parâmetros, o que permite criar de uma só vez o objeto já com seus atributos.
        Computador computador2 = new Computador("Macbook Pro 2", "Apple", 9000, 32, 256, "AMD", false, new Fabricante("Positivo", "Manaus - Amazonas"));

        System.out.println(computador2);
        
    }
}
