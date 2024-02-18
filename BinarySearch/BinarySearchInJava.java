package BinarySearch;

public class BinarySearchInJava {
    public static void main(String[] args) {
        // BinarySearch = inicia a la mitad del dataset y va descartando la mitad en la
        // que no se encuentra lo que se busca
        // ! SIEMPRE TIENEN QUE SER DATASETS ORDENADOS(SORTED)
        // tiene una complejidad de O(n log n)
        // Lo que quiere decir que mientras más grande sea el dataset, más rápido es
        // Binary search es malo con datasets chicos o medianos, pero fabuloso con
        // datasets grandes
        // la mitad del array es eliminado en cada "paso"

        int array[] = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // ! Forma trampa de hacer esto en java
        // int index = Arrays.binarySearch(array, target);

        // Ejemplo desde 0 en java
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println("Element found at index: " + index);
        }

    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + middle);

            if (value < target)
                low = middle + 1;
            else if (value > target)
                high = middle - 1;
            else
                return middle; // target found

        }

        return -1;
    }
}
