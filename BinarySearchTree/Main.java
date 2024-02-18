package BinarySearchTree;

public class Main {
    public static void main(String[] args) {

        // Binary search tree = es una estructura de datos donde cada nodo es mayor que
        // su hijo izquerdo, pero menos que el derecho

        // Beneficio: nodos fáciles de localizar cuando tienen este orden

        // time complexity: mejor caso = O(log n)
        // peor caso = O(n)

        // space complexity: O(n)

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.remove(5);

        tree.display();

        System.out.println(tree.search(9));
    }
}
