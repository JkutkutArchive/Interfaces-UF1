package septiembre22_Ejercicio1.ej1;

/**
 * Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor acada una. A
 * continuación realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A
 * tome el valor de D, D tome el valor de B.. Imprimir por pantalla los valores iniciales y posteriormente los
 * valores finales con dos líneas de separación.
 *
 * @author jkutkut - Jorge Re
 */
public class Ej1 {
    public static void print(int a, int b, int c, int d) {
        System.out.printf(
                "A: %d, B: %d, C: %d, D: %d\n",
                a, b, c, d);
    }
    public static void main(String[] args) {
        int A, B, C, D, tmp;

        A = 0;
        B = 1;
        C = 2;
        D = 3;
        print(A, B, C, D);

        tmp = B;
        B = C;
        C = A;
        A = D;
        D = tmp;
        print(A, B, C, D);
    }
}
