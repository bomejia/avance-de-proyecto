import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola {
    public static void main() {
        Queue<Nodo> cola = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ COLAS ---");
            System.out.println("1 - Agregar tarea");
            System.out.println("2 - Eliminar tarea");
            System.out.println("3 - Mostrar inicio");
            System.out.println("4 - Mostrar cola");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Agrega una tarea: ");
                    String tarea = sc.nextLine();
                    System.out.print("Agrega una hora: ");
                    String hora = sc.nextLine();
                    cola.add(new Nodo(tarea, hora));
                    break;

                case 2:
                    if (!cola.isEmpty()) {
                        System.out.println("Elemento eliminado: " + cola.poll());
                    } else {
                        System.out.println("Cola vacía");
                    }
                    break;

                case 3:
                    if (!cola.isEmpty()) {
                        System.out.println("Inicio de la cola: " + cola.peek());
                    } else {
                        System.out.println("Cola vacía");
                    }
                    break;

                case 4:
                    System.out.println("Contenido en la cola: " + cola);
                    break;

                case 0:
                    System.out.println("Saliendo del menú de colas...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
}
