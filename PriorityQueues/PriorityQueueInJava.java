package PriorityQueues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueInJava {
    public static void main(String[] args) {
        // Son una estructura de datos FIFO
        // First In, First Out
        // Es como una queue normal, pero maneja una prioridad con los datos que tiene

        Queue<Double> queue = new PriorityQueue<>();
        // Con esto, ya se ordenaran los datos de menor a mayor
        // ! Si se le pasa como argumento Collections.reverseOrder(), se ordenará de
        // ! mayor a menor
        // * SI el tipo de dato es un string, se ordenarán alfabéticamente

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
