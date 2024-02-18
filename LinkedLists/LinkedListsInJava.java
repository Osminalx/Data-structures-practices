package LinkedLists;

import java.util.LinkedList;

public class LinkedListsInJava {

    public static void main(String[] args) {
        // Una LinkedList es una estructura de datos que almacena nodos en dos partes:
        // data y dirección, los nodos se encuentran en localizaciones no consecutivas
        // de la memoria
        // Los elementos estan conectados por medio de punteros
        // Estan las listas ligadas y las doblemente ligadas, su diferencia es que
        // en las doblemente ligadas, un nodo sabe que nodo va antes y cual después
        // mientras que en las listas ligadas simples, el nodo solo sabe quien sigue,
        // mas no quien iba atrás

        // * Ventajas:
        // 1. Es una estructura de datos dinámica, eso quiere decir,que solo usa la
        // memoria que necesita en el momento
        // 2. La inserción y eliminación de los nodos es más fácil. O(1)
        // 3. hay poco o nulo maluso de la memoria

        // ! Desventajas:
        // 1. Usa más memoria por cada puntero adicional
        // 2. NO hay acceso random a un elemento (No index[i])
        // 3. Accesar o buscar elementos consume más tiempo. O(n)

        // ? Usos:
        // 1. implementar Stacks/Queues
        // 2. Navegación GPS
        // 3. Playlist de Música

        LinkedList<String> linkedList = new LinkedList<>();

        /*
         * linkedList.push("A");
         * linkedList.push("B");
         * linkedList.push("C");
         * linkedList.push("D");
         * linkedList.push("F");
         * linkedList.pop();
         */

        // pop elimina el último en ser eliminado
        // [F,D,C,B,A]
        // System.out.println(linkedList);

        // Se puede tratar a una linkedList como si fuera una Queue de esta manera:
        linkedList.offer("A");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.offer("B");
        // linkedList.poll();

        linkedList.add(4, "E");
        System.out.println(linkedList);
        linkedList.remove("E");

        System.out.println(linkedList);

        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");
        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        System.out.println(first);
        System.out.println(last);

    }
}
