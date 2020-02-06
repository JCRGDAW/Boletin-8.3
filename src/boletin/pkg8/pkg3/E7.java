/*
Verificar si en una frase se encuentra una determinada palabra.
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String frase = "Tengo una hormiguita en la patita.";

        System.out.println(frase);

        System.out.print("Introduzca una palabra: ");
        String palabra = s.nextLine();

        String resul = frase.replaceAll(palabra, "");
        if (resul.equals(frase)){
            System.out.println("Esa palabra no está en la frase");
        }else{
            System.out.println("Esa palabra si está en la frase");
        }
    }
}
