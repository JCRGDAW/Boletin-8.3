/*
Realizar un clase que lea una cadena de caracteres, la imprima invertida.
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabraInv = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String palabra = s.nextLine();

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInv = palabraInv + palabra.charAt(i);

        }

        System.out.println(palabraInv);
    }
}
