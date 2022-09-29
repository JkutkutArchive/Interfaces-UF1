package septiembre29_bisiesto;

import jkutkut.SuperScanner;

/**
 * Programa que pide un año y dice si es bisiesto o no.
 *
 * @author jkutkut - Jorge Re
 */
public class Ej1_bisiesto {
    public static void main(String[] args) {
        SuperScanner sc = new SuperScanner(System.in);

        System.out.println("Este programa te dirá si un año es bisiesto o no.");
        int year = sc.getNatural("Introduce un año: ");
        if (isBisiesto(year))
            System.out.printf("El año %d es bisiesto. Por tanto, febrero tiene 29 días.", year);
        else
            System.out.printf("El año %d no es bisiesto. Por tanto, febrero tiene 28 días.\n", year);
    }

    private static boolean isBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}