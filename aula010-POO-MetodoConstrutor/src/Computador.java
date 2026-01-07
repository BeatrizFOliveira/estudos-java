public class Computador {
    String modelo;
    String marca;
    double preco;
    int memoriaRam;
    int espacoHD;
    String processador;
    boolean placaDeVideoDedicada;
    Fabricante fabricante;

    public double calcularDesconto(double var1) {
        return this.preco * var1;
    }

    boolean adicionarMemoriaRam(int var1) {
        if (var1 % 2 == 1) {
            return false;
        } else {
            this.memoriaRam += var1;
            this.preco += (double)(var1 * 150);
            return true;
        }
    }


    //MÉTODOS CONSTRUTORES--------------------------
    //Para criar construtores basta colocar o public como o próprio nome da classe parênteses e chaves.
    //IMPORTANTE: É UMA BOA PRÁTICA CRIAR DOIS CONSTRUTORES UM COM PARÂMETROS E UM VAZIO

    //Nesse caso é criado um construtur com parâmetros
    public Computador(String modelo, String marca, double preco, int memoriaRam, int espacoHD, String processador, Boolean placaDeVideoDedicada, Fabricante fabricante){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.memoriaRam = memoriaRam;
        this.espacoHD = espacoHD;
        this.processador = processador;
        this.placaDeVideoDedicada = placaDeVideoDedicada;
        this.fabricante = fabricante;
    }

    //Nesse caso é criado um construtor vazio
    public Computador(){

    }

    //TO STRING()------------------------
    //Esse método permite printar na tela os atributos com seus valores.

    @Override
    public String toString() {
        return "Computador {" +
            "modelo='" + modelo + '\'' +
            ", marca='" + marca + '\'' +
            ", preco=" + preco +
            ", memoriaRam=" + memoriaRam + " GB" +
            ", espacoHD=" + espacoHD + " GB" +
            ", processador='" + processador + '\'' +
            ", placaDeVideoDedicada=" + placaDeVideoDedicada +
            ", fabricante=" + fabricante +
            '}';
    }
}
