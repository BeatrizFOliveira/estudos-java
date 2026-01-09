import funcionarios.*;
import servicos.empregadoService;

public class App {
    public static void main(String[] args) throws Exception {

        Empregado e = new Empregado(10_000);

        //Aqui definimos g como empregado apesar dele ser um gerente, sendo um exemplo de polimorfismo
        Empregado g = new Gerente(10_000, 30);

        //printf é usado quando será informado uma variável formatada, nesse cado % indica o local onde a variável será inserida, a vírgula indica que haverá separação da casa dos milhares, o ponto seguido do 2 indica as casas decimais.
        System.out.printf("Proventos do Empregado: %,.2f \n", e.getProventos()); 
        System.out.printf("Proventos do Gerente: %,.2f \n", g.getProventos());
    
        //Como g é definido como Empregado não é possível acessar um método de gerente. Para solucionar esse problema é feito uma conversão (cast), para isso basta colocar antes do g o novo tipo entre parênteses.
        System.out.printf("Bonus do gerente: %.2f%%", ((Gerente) g).getBonus());

        
        empregadoService servico = new empregadoService();

        //Devido ao polimorfismo é possível aplicar o aumento tanto no empregado e quanto no gerente g
        servico.concederAumento(e, 10);
        servico.concederAumento(g, 10);

        System.out.printf("Proventos do Empregado: %,.2f \n", e.getProventos());
        System.out.printf("Proventos do Gerente: %,.2f \n", g.getProventos());


    }
}
