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

        //Pone la primera letra de la palabra en mayuscula y el resto en minuscual
        String primera = cadena.substring(0, 1).toUpperCase();
        String resto = cadena.substring(1, cadena.length()).toLowerCase();
        System.out.print(primera + "" + resto);
        // Fin de la primera en mayuscula y el resto en minuscual

        //Coma
        System.out.print(",");
        //Fin coma

        //Desplaza la ultima letra de la palabra al principio
        do {
            for (int i = 1; i < palabra.length(); i++) {
                primera = cadena.substring(palabra.length()-i);
                resto = cadena.substring(0, palabra.length()-i);
                System.out.print(primera + "" + resto);
                System.out.print(",");
            }
        } while (palabra != cadena);
        //Fin desplaza la ultima letra de la palabra al principio
        System.out.println(cadena);

    }
}
