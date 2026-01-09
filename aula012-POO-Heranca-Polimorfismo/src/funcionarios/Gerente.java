package funcionarios;
public class Gerente extends Empregado{ //Extends indica que empregado é a classe pai
    
    private double bonus;

    @Override //Como empregado já tem o getProventos(), essa aqui sobrescreve ele
    public double getProventos() {
        return super.getSalario() * (1 + (bonus/100)); //super indica que será usado o método getSalario() da classe pai
    }

    //Método getter e setter
    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    //Método Construtor
    public Gerente(double salario, double bonus){
        super(salario);
        this.bonus = bonus;
    }

    //Nesse toString() foi usado um StringBuilder que permite criar uma string como uso do método append
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gerente{"); //A palavra final significa que será uma constante
        sb.append("bonus=").append(bonus);
        sb.append(super.toString());
        sb.append('}');

        return sb.toString();
    }
}
