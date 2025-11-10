import java.util.Scanner;
import java.util.Stack;

public class Pila {
    public static void main() {
        Stack<Nodo> pila = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ PILAS ---");
            System.out.println("1 - Agregar tarea");
            System.out.println("2 - Eliminar tarea");
            System.out.println("3 - Mostrar cima");
            System.out.println("4 - Mostrar pila");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia buffer

            switch (opcion) {
                case 1:
                    System.out.print("Agrega una tarea: ");
                    String tarea = sc.nextLine();
                    System.out.print("Agrega una hora: ");
                    String hora = sc.nextLine();
                    pila.push(new Nodo(tarea, hora));
                    break;

                case 2:
                    if (!pila.isEmpty()) {
                        System.out.println("Tarea eliminada: " + pila.pop());
                    } else {
                        System.out.println("Pila vacía");
                    }
                    break;

                case 3:
                    if (!pila.isEmpty()) {
                        System.out.println("Cima de la pila: " + pila.peek());
                    } else {
                        System.out.println("Pila vacía");
                    }
                    break;

                case 4:
                    System.out.println("Contenido de la pila: " + pila);
                    break;

                case 0:
                    System.out.println("Saliendo del menú de pilas...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
}
