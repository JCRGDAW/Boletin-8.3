/*
Contar cuantas palabras tiene una frase. Recuerde que la gramática establece que una frase termina
en un punto.
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca una cadena de texto: ");
        String cadena = s.nextLine();
        int count = 0;
        for (int i = 0; i < cadena.length(); i++) {
            count++;
        }

        System.out.println("La frase " + "\"" + cadena + "\"" + " tiene " + count + " caracteres.");
    }

}
