package SelectionSort;

public class SelectionSortInJava {
    public static void main(String[] args) {
        // SelectionSort = Se busca dentro de un array mientras se tiene en mente el
        // número más pequeño en cada iteración, al final de cada iteración, se cambian
        // las variables
        // Tiempo cuádratico = O(n^2)
        // dataset pequeño = OK
        // dataset grande = MALO

        int array[] = { 8, 7, 9, 2, 3, 1, 5, 4, 6 };

        selectionSort(array);

        for (int i : array) {
            System.out.println(i);
        }

    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }

}
