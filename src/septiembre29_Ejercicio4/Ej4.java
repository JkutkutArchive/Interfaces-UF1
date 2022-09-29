package septiembre29_Ejercicio4;

import jkutkut.SuperScanner;

/**
 * Se quiere realizar un programa en Java que sirva para calcular la media de una serie de valores
 * numéricos que se leen por teclado. Para ello se quiere que el programa pida al usuario por
 * teclado 10 números enteros, tanto positivos como negativos pero no decimales y los guarde en
 * un array.
 *
 * A continuación calcula y muestra por separado la media de los valores positivos y la de los
 * valores negativos de los valores numéricos que se le han pedido al usuario y se han guardado en
 * un array.
 *
 * @author jkutkut - Jorge Re
 */
public class Ej4 {
    private static final int N = 10;

    public static void main(String[] args) {
        int[] array = askArray(N);

        analyzeArray(array);
    }

    private static int[] askArray(int n) {
        SuperScanner sc = new SuperScanner(System.in);
        int[] array = new int[n];
        System.out.println("Introduce " + N + " enteros:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.getInt((i + 1) + "º: ");
        }
        return array;
    }

    private static void analyzeArray(int[] array) {
        int positives = 0;
        int negatives = 0;
        int positivesSum = 0;
        int negativesSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positives++;
                positivesSum += array[i];
            } else {
                negatives++;
                negativesSum += array[i];
            }
        }
        System.out.println("Media números positivos:");
        printAvg(" sum(positivos) / num(positivos) = %d / %d = %s\n", positivesSum, positives);
        System.out.println("Media números negativos:");
        printAvg(" sum(negativos) / num(negativos) = %d / %d = %s\n", negativesSum, negatives);
        System.out.println("Media total:");
        printAvg(" sum(total) / num(total) = %d / %d = %s\n", positivesSum + negativesSum, positives + negatives);
    }

    private static void printAvg(String format, int sum, int n) {
        double avg = (double) sum / n;
        String avgStr;
        if (Double.isFinite(avg))
            avgStr = String.format("%.2f", avg);
        else
            avgStr = "No definido";
        System.out.printf(format, sum, n, avgStr);
    }
}
