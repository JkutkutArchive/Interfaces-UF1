package septiembre22_Ejercicio1.ej2;

import java.util.Random;

/**
 * Programa Java que declare una variable B de tipo entero y asígnale un valor. A continuación muestra
 * un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo. Utiliza el
 * condicional if y el println para resolverlo.
 *
 * @author jkutkut - Jorge Re
 */
public class Ej2 {
    public static void main(String[] args) {
        Random r = new Random();
        int B = r.nextInt(0, 42);

        String result = "impar";
        if (B % 2 == 0)
            result = "par";
        System.out.printf("El número B (%d) es %s.\n", B, result);
    }
}
