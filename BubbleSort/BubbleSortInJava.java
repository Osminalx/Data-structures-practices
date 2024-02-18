package BubbleSort;

public class BubbleSortInJava {
    public static void main(String[] args) {

        // BubbleSort = pares de elementos adyacentes son comparados y son cambiados
        // entre sí, cuando no están en orden
        // Tiempo cuádratico O(n^2)
        // Cuando es un set de datos pequeño = okay (más o menos)
        // Cuando es un set de datos grande = por favor no

        int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

        bubbleSort(array);

        for (int i : array) {
            System.out.println(i);
        }

    }

    public static void bubbleSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) { // * > para ascendiente, < para descendiente
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
