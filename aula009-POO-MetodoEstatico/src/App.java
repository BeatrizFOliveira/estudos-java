public class App {
    public static void main(String[] args) throws Exception { 
        //Em uma classe a palavra static faz com que seja possível usar os métodos da classe mesmo sem ter sido criado nenhum objeto.

        Casa c1 = new Casa("Gabriela");
        Casa c2 = new Casa("Eduardo");
        Casa c3 = new Casa("Vitor");

        System.out.println(c1.dono + " - " + c1.cor);
        System.out.println(c2.dono + " - " + c2.cor);
        System.out.println(c3.dono + " - " + c3.cor);

        Casa.cor = "Azul";

        System.out.println(c1.dono + " - " + c1.cor);
        System.out.println(c2.dono + " - " + c2.cor);
        System.out.println(c3.dono + " - " + c3.cor);

    }
}

class Casa{
    String dono;
    static String cor = "Bege";  //A palavra estatic faz com que um atributo seja alterado em todos os objetos é por isso que mesmo já tendo sido definido as casas como beje ao trocar o atributo para azul todas as casas criadas ficam azul.

    public Casa(String dono){
        this.dono = dono;
    }
}