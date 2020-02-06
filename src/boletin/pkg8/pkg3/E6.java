/*
Dado un párrafo con dos frases (separadas por un punto), contar cuántas palabras tiene cada frase.
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un parrafo: ");
        String cadena = s.nextLine();
        String primera = " ";

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char ascii = cadena.charAt(i);
            if (ascii == '.') {
                contador++;
            }
            if ((ascii == '.') && (contador <= 1)) {
                primera = cadena.substring(0, i);
            }

        }
        System.out.println();
        for (int i = 0; i < primera.length(); i++) {
            contador++;
        }
        contador--;
        System.out.println("La frase " + "\"" + primera + "\"" + " tiene " + contador + " caracteres.");
    }

}
