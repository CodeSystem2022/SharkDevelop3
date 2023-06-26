import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un dígito");
        var operando1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite un dígito");
        var operando2 = Integer.parseInt(entrada.nextLine());
        int resultado;

        System.out.println("""
                *******MENÚ*******
                1) SUMA
                2) RESTA
                3) MULTIPLICACIÓN
                4) DIVISION
                5) POTENCIA (NO disponible)
                6) RAIZ CUADRADA (NO disponible)
                """);
        int operacion = Integer.parseInt(entrada.nextLine());
        switch(operacion){
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado ="+resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado ="+resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado ="+resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado ="+resultado);
            }/*
            case 5 -> {
                resultado = operando1 ^ operando2;
                System.out.println("Resultado ="+resultado);
            }
            case 6 -> {
                double raizCuadrada = Math.sqrt(operando1);
                System.out.println("Resultado ="+raizCuadrada);
            }*/
            default -> System.out.println("No existe la operacion");
        }
    }
}
