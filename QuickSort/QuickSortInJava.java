package QuickSort;

public class QuickSortInJava {
    public static void main(String[] args) {
        // Quick sort = mueve los elementos más pequeños a la izquierda de un pivot, de
        // manera recursiva divide el array en 2 particiones
        // run-time complexity = mejor caso O(n log n)
        // Caso promedio O(n log n)
        // Peor Caso O(n^2) si ya está sorteado
        // space complexity = O(log(n)) por la recursión

        int array[] = { 8, 2, 5, 3, 9, 4, 7, 6, 1 };

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.println(i);
        }

    }

    private static void quickSort(int[] array, int start, int end) {

        if (end <= start)
            return;

        int pivot = partition(array, start, end);

        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;

    }
}