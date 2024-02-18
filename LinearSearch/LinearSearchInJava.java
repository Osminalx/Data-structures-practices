package LinearSearch;

public class LinearSearchInJava {
    public static void main(String[] args) {
        // Linear search = Iterar por una colección, un elemento a la vez
        // Tienen una complejidad de O(n)
        // ! Desventajas:
        // Lento para sets de datos grandes
        // * Ventajas:
        // 1. Rápido para busquedas en datasets pequeños o medianos
        // 2. El dataset no necesita estar acomodado(sorted)
        // 3. Útil para estructuras de datos sin random access(LinkedLists)

        int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5, 10 };

        int index = linearSearch(array, 5);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
