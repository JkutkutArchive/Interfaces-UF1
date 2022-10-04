package septiembre22_Ejercicio2.ej1;

import java.util.Scanner;

/**
 * Programa en Java que le pida al usuario la temperatura media del dia en cantidad de grados
 * centígrados y la pase a grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
 * Utilizar la clase Scanner y el tipo de variable double.
 *
 * Imprimir por pantalla “La temperatura de hoy en grados centígrados es” y los grados
 * centrigrados
 * Y después imprimir por pantalla “La temperatura de hoy en grados Fahrenheit es” y los grados
 * Fahrenheit.
 *
 * @author jkutkut - Jorge Re
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        float c = 0f, f;
        while (running) {
            System.out.printf("Introduce la temperatura en C: ");
            try {
                c = Float.parseFloat(sc.nextLine());
                running = false;
            }
            catch (Exception e) {
                System.out.println("La temperatura introducida no es válida.");
            }
        }
        f = 32f + ( 9f * c / 5f);
        System.out.printf("La temperatura de hoy en grados Fahrenheit es %.2f\n", f);
    }
}
