package septiembre29_Ejercicio3;

import jkutkut.InvalidDataException;
import jkutkut.SuperScanner;

/**
 * Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30
 * días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se debe comprobar que el valor
 * introducido esté comprendido entre 1 y 12.
 *
 * Después de obtener la variable entera el programa debe imprimir por pantalla el número de
 * dias del mes correspondiente y se mostrará además el nombre del mes. P.e si el usuario
 * introduce 5 se imprimirá por pantalla 31 y el nombre del mes mayo.
 *
 * Nota bonus:
 * Para ahorrar la cantidad de datos pedidos al usuario, el año será pedido sólo
 * si el mes es febrero. Por ese motivo, la información de si el año es bisiesto sólo ocurrirá
 * en este caso. Sin embargo, la implementación es equivalente.
 *
 * @author jkutkut - Jorge Re
 */
public class Ej3 {
    private static SuperScanner sc;
    private static final String[] MONTHS = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };

    public static void main(String[] args) {
        sc = new SuperScanner(System.in);

        System.out.println("Este programa te dirá si los días que tiene un mes son 30, 31 o 28/29.");

        int month = sc.getIntInRange("Introduce un mes (1-12): ", 1, 12);

        System.out.printf(
                "El mes %s (%d/12) tiene %d días.\n",
                monthName(month),
                month,
                monthDays(month)
        );
        sc.close();
    }

    private static String monthName(int month) {
        return MONTHS[month - 1];
    }

    private static boolean isBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static int monthDays(int month) {
        if (month < 1 || month > 12)
            throw new InvalidDataException("El mes debe estar entre 1 y 12.");
        switch (month) {
            case 4, 6, 9, 11:
                return 30;
            case 2:
                int year = sc.getNatural("Introduce un año: ");
                if (isBisiesto(year)) {
                    System.out.println("El año " + year + " es bisiesto.");
                    return 29;
                }
                System.out.println("El año " + year + " no es bisiesto.");
                return 28;
            default:
                return 31;
        }
    }
}
