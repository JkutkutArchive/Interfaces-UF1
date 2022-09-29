package septiembre22_Ejercicio2.ej2;

import java.util.Scanner;

/**
 * Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por
 * pantalla la longitud y el área de la circunferencia. Longitud de la circunferencia = 2*PI*Radio,
 * Area de la circunferencia = PI*Radio^2
 *
 * Se pide realizar los dos apartados en proyectos diferentes en el IDE y mostrar al profesor cada
 * apartado por separado y que funcione.
 *
 * @author jkutkut - Jorge Re
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        float r = 0f;
        while (running) {
            System.out.printf("Introduce el radio: ");
            try {
                r = Float.parseFloat(sc.nextLine());
                running = false;
            }
            catch (Exception e) {
                System.out.println("El radio introducido no es válida.");
            }
        }

        System.out.printf("La longitud de la circunferencia es %.2f\n", r * Math.PI * 2);
        System.out.printf("El área de la circunferencia es %.2f\n", r * Math.PI * r);
    }
}
