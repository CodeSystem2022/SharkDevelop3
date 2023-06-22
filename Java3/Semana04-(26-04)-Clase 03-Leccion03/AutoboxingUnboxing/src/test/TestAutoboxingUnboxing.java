
package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clases envolventes o wrapper
        /*
            clases envolventes de tipo entero:
        int = la clase envolvente es integer
        long = Long
        float = Float
        double = Double
        boolean = Boolean
        byte = Byte
        char = Character
        short = Short
        
        
        */
        
        int entero = 10; //primitivo
        System.out.println("entero = " + entero);
        Integer entero1 = 10; //tipo object
        System.out.println("entero1 = " + entero1.doubleValue()); //autoboxing
        
        int entero2 = entero; //unboxing
        
    }
}
