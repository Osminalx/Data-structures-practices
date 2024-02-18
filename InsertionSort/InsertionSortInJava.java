package InsertionSort;

public class InsertionSortInJava {
    public static void main(String[] args) {
        // Insetion Sort = después de comparar los elementos a la izquierda, se mueven
        // los datos a la derecha para hacer espacio para insertar un valor
        //
        // Tiempo cuadrático O(n^2)
        // dataset pequeño = decente
        // dataset grande = Malo
        //
        // Menos pasos que el BubbleSort
        // Su mejor caso es O(n) comparado con el SelectionSort O(n^2)
        // ! Este Sort es preferible sobre el bubble sort y el selection sort

        int array[] = { 9, 1, 8, 2, 7, 3, 6, 5, 4 };

        insertionSort(array);

        for (int i : array) {
            System.out.println(i);
        }

    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

    }
}
