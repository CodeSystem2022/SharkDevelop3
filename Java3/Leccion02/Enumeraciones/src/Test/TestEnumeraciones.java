
package Test;

import Enumeraciones.Continentes;
import Enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        
      //  System.out.println("Dia uno: "+Dias.LUNES);
  //indicarDiaSemana(Dias.LUNES);
      // indicarDiaSemana(Dias.MARTES);
        System.out.println("Continente No. 4: "+Continentes.AMERICA);
        System.out.println("No. de paises en el 4to continente: "+Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to continente: "+Continentes.AMERICA.getHabitantes());
        indicarDiaSemana(Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana ");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
            default:
                System.out.println("No es correcto el dia indicado");
        }
                //AGREGAR TODOS LOS DIAS DE LA SEMANA Y EL DEFAULT EN EL SWITCH 
        }
    
     
   
}
