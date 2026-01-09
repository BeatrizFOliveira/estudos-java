package servicos;

import funcionarios.Empregado; //por usar Empregado necessidade de importação

public class empregadoService {

    //Método que calcula um aumento
    public void concederAumento(Empregado empregado, double percentual){

        empregado.setSalario(empregado.getSalario() * (1 + (percentual/100)));

    }
}
