package AdjacencyList;

public class AdjacencyListInJava {
    public static void main(String[] args) {
        // AdjacencyList = un array o ArrayList de listas ligadas(linkedlists)
        // Cada LinkedList tiene un nodo único en la cabeza(inicio)
        // Todos los vecinos adyacentes a ese nodo son añadidos a la linkedList de ese
        // nodo

        // Runtime complexity para revisar un borde(edge) = O(v) V= vertices
        // Space complexity = O(v + e)

        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

    }
}
