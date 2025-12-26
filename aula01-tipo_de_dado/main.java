public class main{
    public static void main(String[] args) {
        
        //Esses são os tipos de dados primitivos para números inteiros
        byte idade = 18; //byte = 1 byte
        short ano = 2000, mes = 1, dia = 15; //short = 2 bytes
        int quantidade = 0; //int = 4 bytes
        long numeroDeVendas = 500L; //long = 8 bytes

        //Esses são os tipos de dados primitivos para números com ponto flutuante
        float tamanho = 1.87f; //usa-se o f, pois o padrão é double
        double valor = 25.50;

        //Os booleanos só podem receber true ou false
        boolean ativo = true;

        //O char é um tipo primitivo que só pode guardas 1 caractere
        char sexo = 'M';

        //Para guardar mais de um caractere se utiliza a String.
        //String não é um tipo primitivo, mas um objeto, por isso tem que estar com letra maiúscula.
        String nome = "Gustavo";

        //Se utilizado o var ele irá descobrir por conta própria qual o tipo da variável
        var peso = 54;

        

    }
}
