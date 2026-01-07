/*
Para criar uma função basta escolher se ela vai ser pública ou não, colocar a palavra class e o nome da função.
Entre chaves os atributos devem vir com o seus respectivos tipos e como o nome em seguida.
*/

public class ExemploComputador{
    String modelo;
    String marca;
    double preco;
    int memoriaRam;
    int espacoHD;
    String processador;
    boolean placaDeVideoDedicada;

    ExemploFabricante fabricante;


    //METODOS----------------
    
    /*Para criar um método:
    1° Coloca se vai ser público ou não depois o que ele retorna e o seu nome
    2° Em seguida coloca entre parênteses os parâmetros com seus respectivos tipos
    3° Por fim abre chaves e escreve o seu funcionamento */

    public double calcularDesconto(double desconto){
        return preco*desconto;
    }

    boolean adicionarMemoriaRam(int quantidade){
        if(quantidade % 2 == 1) return false;

        memoriaRam += quantidade;
        preco += quantidade*150;
        return true;
    }
}