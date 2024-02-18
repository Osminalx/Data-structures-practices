package HashTable;

import java.util.Hashtable;

public class HastableInJava {
    public static void main(String[] args) {
        // HashTable = una estructura de datos de clave valor que por lo general es
        // <Integer/String>
        // cada clave/valor es una entrada
        // Rápida incersión, revisión y borrado de pares clave/valor
        // No es ideal para datasets pequeños, pero es muy bueno con datasets grandes
        //
        // Hashing = toma una clave y computa un entero (La formula cambia según la
        // clave y su tipo de dato)
        // en una HashTable, usamos la fórmula: hash % capacidad para calcular el número
        // de index
        //
        // key.hashCode() % capacidad = index
        //
        // Bucket = La localización indexada para una o más entradas
        // puede almacenar múltiples entradas en caso de una colición en forma de una
        // linkedlist
        //
        // Collision = la función hash genera el mismo index para más de una sola clave,
        // mientras menos colisiones, mejor eficiencia
        //
        // Runtime complexity = Mejor caso O(1)
        // Peor caso O(n)

        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Suidward");
        table.put(777, "Gary");

        // table.remove(777);

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

    }
}
