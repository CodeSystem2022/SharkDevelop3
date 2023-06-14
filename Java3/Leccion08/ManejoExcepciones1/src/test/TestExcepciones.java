package test;

import aritmetica.Aritmetica;

public class TestExcepciones {
    public static void main(String[] args) {
        
        int resultado = 0;
        try{
            resultado = Aritmetica.division(10, 0) ;
        }catch (Exception e){
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);

    }
}
