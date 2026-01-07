public class App {
    public static void main(String[] args){
        ExemploComputador pc = new ExemploComputador();

        pc.modelo = "G5";
        pc.marca = "Dell";
        pc.espacoHD = 256;
        pc.placaDeVideoDedicada = true;
        pc.memoriaRam = 8;
        pc.processador = "i7";
        pc.preco = 5200.50;

        ExemploComputador note = new ExemploComputador();

        note.modelo = "Macbook Pro";
        note.marca = "Apple";
        note.espacoHD = 512;
        note.placaDeVideoDedicada = false;
        note.processador = "i5";
        note.preco = 15999.99;

        ExemploFabricante dell = new ExemploFabricante();

        dell.nome = "Dell Computadores";
        dell.endereco = "Av Paulista 1000 - SP";

        ExemploFabricante apple = new ExemploFabricante();

        apple.nome = "Apple Inc.";
        apple.endereco = "Silicon Valley - California";

        pc.fabricante = dell;
        note.fabricante = apple;

        double valorComDesconto = pc.calcularDesconto(0.1);
        System.out.println("Valor com desconto: " + valorComDesconto);

        boolean sucesso = pc.adicionarMemoriaRam(8);

        if(sucesso){
            System.out.println("Memória Ram adicionada.");
            System.out.println("Quantidade de memoria ram: " + pc.memoriaRam);
            System.out.println("Novo valor do computador: " + pc.preco);
        }
        else{
            System.out.println("Não foi possível adicionar a memória");
        }

    }
}
