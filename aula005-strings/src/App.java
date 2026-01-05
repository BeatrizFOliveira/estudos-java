public class App {
    public static void main(String[] args) throws Exception {
        
        String nome1 = "Ana";
        String nome2 = new String("Ana");

        System.out.println(nome1 == nome2); //Não é possível comparar strings com diferentes armazenamentos utilizando o ==
        System.out.println(nome1.equals(nome2)); //Para comparar objetos utiliza-se o .equals que irá comparar caractere por caractere


        //É possível escrever e imprimir em múltiplas linhas usando """ """
        System.out.println("""
                escrevendo
                    em 
                        múltiplas
                            linhas
                """);

    }
}
