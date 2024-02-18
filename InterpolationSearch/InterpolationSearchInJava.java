package InterpolationSearch;

public class InterpolationSearchInJava {
    public static void main(String[] args) {
        // Interpolation search:
        // Mejora sobre la búsqueda binaria mejor utilizada para los datos distribuidos
        // "uniformemente"
        // 'adivina" donde un valor podría basarse en los resultados de la sonda
        // calculados
        // si la sonda es incorrecta, el área de búsqueda se estrecha, y una nueva sonda
        // se calcula

        // Caso promedio: O(log(log(n)))
        // Peor caso: O(n) [los valores incrementan exponencialmente]

        int[] array = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };

        int index = interpolationSearch(array, 256);

        if (index != -1) {
            System.out.println("Element found at index: " + index);

        } else {
            System.out.println("Element not found");

        }

    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe: " + probe);

            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }

        }

        return -1;
    }
}