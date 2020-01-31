/*
Intercambiar un String dado, hasta volverlo a su forma original:
Ejemplo: Hola, ahol, laho, olah, hola (stop).
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String cadena = s.nextLine(); // Esta no se toca
        String palabra = cadena; // Copio la palabra por teclado para modificar solo esta y guardar la otra para comparar al final
        int log = palabra.length();
        //Array de caracteres
        char letras[];
        letras = new char[log];
        for (int i = 0; i < palabra.length(); i++) {
            char ascii = palabra.charAt(i);
            int conv = (int) ascii;
            char conv2 = (char) conv;

            letras[i] = conv2;

        }
        //Fin array de caracteres

        //Pone la primera letra de la palabra en mayuscual
        String primera = cadena.substring(0, 1).toUpperCase();
        String resto = cadena.substring(1, cadena.length()).toLowerCase();
        System.out.print(primera + "" + resto);
        // Fin de la primera en mayuscula

        //Coma
        System.out.print(",");
        //Fin coma

        //Desplaza la ultima letra de la palabra al principio
        do {
            for (int i = palabra.length(); i > palabra.length(); i--) {
                System.out.println(letras[i]);
            }
            
        } while (palabra != cadena);
        //Fin desplaza la ultima letra de la palabra al principio

    }
}
