import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {

    public static void main(String[] args) {
        // una Queue o Cola es una estructura de datos FIFO
        // Es como una cola de personas
        // First In, First Out
        // Es una colección diseñada para sostener elementos antes de ser procesados
        // Es una estructura de datos linear

        // add = enqueue, offer()
        // remove = dequeque, poll()

        Queue<String> queue = new LinkedList<String>();
        // En este caso como Queue en java es una interface
        // Se necesita un objeto o clase que la pueda seguir
        // En este caso una LinkedList

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        // se pueden usar otros métodos que son para las colecciones con las queue
        // por ejemplo:
        System.out.println(queue.size());
        // tambien sirve este método:
        System.out.println(queue.contains("Harold"));

        // peek() sirve para ver el primero en la cola
        System.out.println(queue.peek());

        System.out.println(queue);
        queue.poll();

        System.out.println(queue);

        // Usos de las queue:
        // 1. keyboard buffer(para guardar el orden en que fueron presionadas las teclas
        // )
        // 2. Printer queue para tener el orden en que se imprimen las cosas
        // 3. para otras estructuras de datos como:
        // LinkedList, PriorityQueues, breadth-first search

    }
}