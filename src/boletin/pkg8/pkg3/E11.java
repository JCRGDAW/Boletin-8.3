/*
Escribir un programa que dado un texto que finaliza en punto, se pide:
a. la posición inicial de la palabra más larga y su longitud
b. cuantas palabras con una longitud entre 8 y 16 caracteres poseen más de tres veces la vocal “a”
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca una frase (terminando en punto): ");
        String frase = s.nextLine();

        String palabra = "";
        String parts[] = frase.split(" ");
        for (int i = 0; i < parts.length; i++) {
            palabra = parts[i];
        }
    }

}
