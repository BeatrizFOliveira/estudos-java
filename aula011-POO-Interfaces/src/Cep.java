public class Cep implements ValidarCep <String> { //Para implementar uma interface usa-se o termo "implementes" seguido do nome da interface e nesse caso precisa também do tipo, por isso tem o <String>
    
    String numeroCep;

    //Método construtor
    public Cep(String numero){ 
        if(validar(numero)==true) //Esse método construtor utiliza do método validar da interface para verificar o cep antes de construí-lo.
            this.numeroCep = numero;
        else{
            throw new RuntimeException("Cep Invalido");
        }
    }
    
    //Para implementar a interface em uma classe basta usar o @Overrride, escrever o método e detalhar como ele irá funcionar.
    @Override
    public boolean validar(String palavra){
        return palavra.matches("[0-9]{5}-[0-9]{3}");
    }

    //Método String conforme visto nas outras aulas
    @Override
    public String toString() {
        return numeroCep;
    }
}
