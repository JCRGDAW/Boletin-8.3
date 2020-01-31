/*
 Cambiar todas las vocales de la frase “Tengo una hormiguita en la patita, que me esta haciendo
cosquillitas y no me puedo aguantar” por otra vocal pedida por teclado.
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String parrafo = "Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar";
        System.out.println("Frase: " + parrafo);
        System.out.print("Introduzca una vocal: ");
        String palabra = s.nextLine();
        parrafo = parrafo.replaceAll("a", palabra);
        parrafo = parrafo.replaceAll("e", palabra);
        parrafo = parrafo.replaceAll("i", palabra);
        parrafo = parrafo.replaceAll("o", palabra);
        parrafo = parrafo.replaceAll("u", palabra);
        System.out.println();
        System.out.println(parrafo);
    }

}
