import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Laço de repetição: FOR---------------------------------------
        
        System.out.println("Quantidade de alunos: ");
        Scanner leitor = new Scanner(System.in);
        int qtdAlunos = leitor.nextInt();


        double somaNotas = 0;
        for(int i=0; i<qtdAlunos; i++){
            System.out.println("Nota do " + (i+1) + "° aluno: ");
            float nota = leitor.nextFloat();

            somaNotas += nota;
        }

        double media = somaNotas/qtdAlunos;
        System.out.println("Média da turma: " + media);


        //Laço de repetição: WHILE

        int i = 0;

        while(i<10){
            System.out.println("i = " + i);
            i++;
        }

        //Laço de repetição: DO WHILE
        i = 0;
        do{
            System.out.println("i = " + i);
            i++;
        } while(i < 10);

        leitor.close();
    }
}
