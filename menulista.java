import java.util.Scanner;

public class Menulista {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Lista L = null;
        int opciones;

        do {
            System.out.println("\n--- MENÚ LISTAS ---");
            System.out.println("1 - Crear lista enlazada simple");
            System.out.println("2 - Crear lista doblemente enlazada");
            System.out.println("3 - Agregar tarea");
            System.out.println("4 - Eliminar tarea");
            System.out.println("5 - Mostrar todas las tareas");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opciones = sc.nextInt();
            sc.nextLine();

            switch (opciones) {
                case 1:
                    L = new Lista(false, false);
                    System.out.println("Lista simple creada");
                    break;
                case 2:
                    L = new Lista(true, false);
                    System.out.println("Lista doble creada");
                    break;
                case 3:
                    if (L == null) {
                        System.out.println("Primero crea una lista");
                        break;
                    }
                    System.out.print("Ingresa una tarea: ");
                    String tarea = sc.nextLine();
                    System.out.print("Ingresa una hora: ");
                    String hora = sc.nextLine();
                    L.insert(tarea, hora);
                    break;
                case 4:
                    if (L == null) {
                        System.out.println("Crea una lista primero");
                        break;
                    }
                    System.out.print("Ingresa una tarea a eliminar: ");
                    String tareaDel = sc.nextLine();
                    L.delete(tareaDel);
                    break;
                case 5:
                    if (L != null) L.display();
                    else System.out.println("Primero crea una lista");
                    break;
                case 0:
                    System.out.println("Saliendo del menú de listas...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opciones != 0);
    }
}
