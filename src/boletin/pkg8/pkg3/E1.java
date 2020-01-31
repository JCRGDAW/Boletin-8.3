/*
Imprimir carácter por carácter un String dado, cada uno en una línea distinta.
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca una cadena de texto: ");
        String cadena = s.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            char ascii = cadena.charAt(i);
            System.out.println(ascii);

        }
    }

}
