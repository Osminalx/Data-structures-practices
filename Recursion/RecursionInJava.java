package Recursion;

public class RecursionInJava {
    public static void main(String[] args) {
        // Recursión = una cosa que se define en términos de sí misma.
        // En terminos de programación:
        // es aplicar el resultado de un procedimiento, a un procedimiento
        // un método recursivo se llama a sí mismo, puede ser un substituto a la
        // iteración
        // Divide un problema en sub-problemas del mismo tipo que el original.
        // Comunmente usado en algoritmos de sort avanzados y navegación de arboles.
        //
        // Ventajas
        // ------
        // Fácil de escribir/leer
        // Fácil de debugear
        // ------
        //
        // Desventajas
        // ______
        // Algunas veces es más lento
        // Usa más memoria

        walk(5);
        System.out.println(factorial(7));
        System.out.println(power(2, 8));

    }

    private static int power(int base, int exponent) {
        if (exponent < 1)
            return 1;
        return base * power(base, exponent - 1);

    }

    private static int factorial(int num) {
        if (num < 1)
            return 1; // Caso base
        return num * factorial(num - 1);
    }

    private static void walk(int steps) {
        // ! Forma iterativa
        /*
         * for (int i = 0; i < steps; i++) {
         * System.out.println("You take a step!");
         * }
         */
        // !Forma recursiva:
        if (steps < 1)
            return; // Caso base para parar la recursión, SIEMPRE NECESARIO
        System.out.println("You take a step!");
        walk(steps - 1);

    }
}