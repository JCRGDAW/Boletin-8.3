/*
Leer un String por teclado e imprimir todos los números seguidos y sin espacios, correspondientes al
código ascii de cada uno de sus caracteres. Posteriormente calcular la frase original a partir de dichos
números (usar un array).
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca una cadena de texto: ");
        String cadena = s.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            char ascii = cadena.charAt(i);
            int conv = (int) ascii;
            System.out.print(conv);

        }

        for (int i = 0; i < cadena.length(); i++) {
            char ascii = cadena.charAt(i);
            int conv = (int) ascii;
            System.out.print((char) conv);

        }
        
        System.out.println("");
    }

}
