import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //EXERCÍCIO 1------------------------------------------------------------
        int idade = 18;
        if (idade > 18) System.out.println("Maioridade");

        var a = true;
        if(a == true){
            var b = 10; //Ao declarar variáveis deve estar dentro de chaves
            System.out.println("A sentenca e verdadeira.");
        }
        else
            System.out.println("A sentenca e falsa."); //Quando tiver apeans uma linha e não tiver declaração de variáveis não precisa usar {}
        

        //EXERCÍCIO 2------------------------------------------------------------

        Scanner entrada = new Scanner(System.in);

        System.out.println("Prova semestral: ");
        float provaSemestral = entrada.nextFloat();
        System.out.println("TCC: ");
        float tcc = entrada.nextFloat();
        System.out.println("Avaliação 1: ");
        float aval1 = entrada.nextFloat();
        System.out.println("Avaliação 2: ");
        float aval2 = entrada.nextFloat();


        double media = provaSemestral*0.5 + tcc*0.3 + (aval1 + aval2)/2 * 0.2;
        System.out.println("A media final eh: "+ media);

        if(media >= 6) System.out.println("APROVADO");
        else if(media >= 3) System.out.println("RECUPERAÇÃO");
        else System.out.println("REPROVADO");


        //EXERCÍCIO 3------------------------------------------------------------


        System.out.println("Quantidad de laranjas? ");
        var qtdLaranja = entrada.nextInt(); //Usa o mesmo do exercício 2

        System.out.println("Pagamento via PIX? (true ou false) ");
        boolean pix = entrada.nextBoolean();

        double precoLaranja = qtdLaranja < 10 ? 2.5 : 2;
        double desconto = pix == true ? 0.9 : 1;

        double precoFinal = qtdLaranja * precoLaranja * desconto;

        System.out.println("Valor final R$ " + precoFinal);


        //EXERCÍCIO 4------------------------------------------------------------

        Scanner consulta = new Scanner(System.in);

        System.out.println("Escolha uma opção: " + System.lineSeparator()
            + "1 - Cadastrar usuário" + System.lineSeparator()
            + "2 - Consultar usuário" + System.lineSeparator()
            + "3 - Abrir pedido" + System.lineSeparator()
            + "4 - Fechar pedido");
        int opcao = consulta.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(opcao + " - Cadastrar usuário");
                break;
            case 2:
                System.out.println(opcao + " - Consultar usuário");
                break;
            case 3:
                System.out.println(opcao + " - Abrir pedido");
                break;
            case 4:
                System.out.println(opcao + "- Fechar pedido");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
