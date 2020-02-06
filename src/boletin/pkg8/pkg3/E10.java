/*
Escribir un programa que lea por teclado un nombre (con sus apellidos) y escriba en pantalla las
iniciales de dicho nombre.
 */
package boletin.pkg8.pkg3;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class E10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String nombreC = s.nextLine();
        
        String iniciales = "";
        String parts[] = nombreC.split(" ");
        for (int i = 0; i < parts.length; i++) {
            iniciales = parts[i];
            System.out.print(iniciales.toUpperCase().substring(0, 1));
        }
        System.out.println("");

    }

}
