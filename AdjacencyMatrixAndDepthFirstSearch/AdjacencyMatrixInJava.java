package AdjacencyMatrixAndDepthFirstSearch;

public class AdjacencyMatrixInJava {
    public static void main(String[] args) {
        // AdjacencyMatrix = un array 2D que guarda 1s y 0s o trues y false para
        // representar bordes
        // número de filas = número de nodos unicos
        // número de columnas = número de nodos unicos

        // runtime complexity para revisar un borde = O(1)
        // space complexity = O(v^2) V = vertices

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(3, 2));

        // Breadth FS = recorre un grafo nivel por nivel
        // Utiliza una Queue
        // Mejor si el destino está en promedio cerca al inicio
        // Los hermanos son visitados antes que los hijos

        // Depth FS = Recorre un grafo rama por rama
        // Usa un stack
        // Mejor si el destino está en promedio lejos del inicio
        // Los hijos son visitados antes que los hermanos
        // Más popular para los juegos/rompecabezas

        // !depthFirstSearch
        // graph.depthFirstSearch(2);
        // !breadthFirstSearch
        graph.breadthFirstSearch(0);

    }
}