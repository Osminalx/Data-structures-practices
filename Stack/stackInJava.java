
import java.util.Stack;

public class stackInJava {

    public static void main(String[] args) {
        // un Stack es una estructura de datos LIFO,
        // esto quiere decir: Last In, First Out
        // es como una torre vertical y tiene dos funciones principales
        // push() para añadir hasta arriba
        // y pop() para quitar lo de hasta arriba

        Stack<String> stack = new Stack<String>();
        // Revisar si el Stack está vacio
        System.out.println(stack.empty());
        // Añadir objetos al stack
        stack.push("Minecraft");
        stack.push("Batman");
        stack.push("Stardew Valley");
        stack.push("LOL");

        System.out.println(stack.empty());
        // Imprimir mi stack
        System.out.println(stack);
        // Quitar uno, si está vacío, muestra una excepción, simepre quita el último en
        // ser añadido
        // pop() guarda el objeto que retiró del stack
        // Se puede guardar en una variable para mostrarlo
        String myFavGame = stack.pop();
        System.out.println("Mi juego favorito: " + myFavGame);
        // peek() muestra el último dato en el stack
        System.out.println("Ultimo juego de mi stack: " + stack.peek());
        // search() devuelve el puesto en la Stack del objeto que le des
        // Si se encuetra el objeto que se de, devolverá -1
        System.out.println("Minecraft se encuentra en el lugar: " + stack.search("Minecraft") + " del Stack");
        System.out.println("Stardew Valley se encuentra en el lugar: " + stack.search("Stardew Valley") + " del Stack");
        // Los stacks se pueden quedar sin memoria si se llenan de muchos datos

        System.out.println(stack);

        // Usos de los stacks
        // 1. hacer un undo/redo en un editor de texto
        // 2. Moverse adelante/detrás en un historial de navegación
        // ? 3. Algoritmos de backtracking
        // ? 4. Calling functions

    }
}