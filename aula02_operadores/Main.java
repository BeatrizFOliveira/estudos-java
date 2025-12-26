package aula02_operadores;

public class Main {
    public static void main(String[] args) {
        System.out.println("5/2 = " + 5/2); //A divisão de inteiros resulta em um inteiro
        System.out.println("5/2 = " + 5f/2.0); //É possível divir float e double

        System.out.println("6 módulo 2 = " + 6%2);

        System.out.println(7*4+2-1);

        var x = 10;
        x += 1;
        System.out.println(x);


        float provaSemestral = 7f;
        float tcc = 5f;
        float avaliacao1 = 10f;
        float avaliacao2 = 6f;
        double media;

        media = 0.5* provaSemestral + tcc*0.3 + ((avaliacao1+avaliacao2)/2)*0.2;
        System.out.println("Media final: " + media);
        
    }
}
