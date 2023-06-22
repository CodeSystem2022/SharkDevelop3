package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        
        int resultado = 0;
        try {
            resultado = division(10, 2);
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la division entre 0");
        }
        System.out.println("resultado = " + resultado);

    }
}
