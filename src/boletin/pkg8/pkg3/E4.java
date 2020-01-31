/*
Verificar si un String leído por teclado finaliza con la misma palabra que empieza.
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca una cadena de texto: ");
        String cadena = s.nextLine();
        String primera = " ";
        
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char ascii = cadena.charAt(i);
            if (ascii == ' ') {
                contador++;
            }
            if ((ascii == ' ') && (contador <= 1)) {
                primera = cadena.substring(0, i);
            }

            System.out.print(ascii);
        }
        System.out.println();
        boolean resultado = cadena.endsWith(primera);
        if (resultado) {
            System.out.println("La frase empieza igual que como termina");
        } else {
            System.out.println("La frase no termina tal como empieza");
        }
    }

}
