public class App {
    public static void main(String[] args) throws Exception {
        float provaSemestral = 7, tcc = 5, aval1 = 10, aval2 = 6;

        double media = provaSemestral*0.5 + tcc*0.3 + (aval1 + aval2)/2 * 0.2;

        System.out.println("A media final eh: "+ media);

    }
}
