package funcionarios; //Por estar dentro da pasta funcionários precisa do package

public class Empregado{
    double salario;

    public double getProventos(){
        return salario;
    }

    //Método getter e setter
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    //Método construtor
    public Empregado(double salario){
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" + "salario=" + salario + '}';
    }
}