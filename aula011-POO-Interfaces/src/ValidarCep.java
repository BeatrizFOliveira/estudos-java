/*
Essa é uma interface, para mais explicações vá para Persistivel.java
*/

public interface ValidarCep <T>{ //O <T> indica a interface será aplicada a todos os elementos de um determinado tipo (String, int, etc.)

    boolean validar(T tipo);
    
} 
