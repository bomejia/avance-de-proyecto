import java.util.Scanner;

public class Cola {

    Nodo frente;
    Nodo fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    public void encolar(String tarea, String hora) {
        Nodo nuevo = new Nodo(tarea, hora);

        if (frente == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Nodo desencolar() {
        if (frente == null) {
            return null;
        }
        Nodo temp = frente;
        frente = frente.siguiente;
        return temp;
    }

    public Nodo peek() {
        return frente;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void mostrar() {
        Nodo aux = frente;
        if (aux == null) {
            System.out.println("Cola vacía");
            return;
        }
        while (aux != null) {
            System.out.println(aux);
            aux = aux.siguiente;
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();
        int opcion;

        do {
            System.out.println("\n--- MENÚ COLAS ---");
            System.out.println("1 - Agregar tarea");
            System.out.println("2 - Eliminar tarea");
            System.out.println("3 - Mostrar inicio");
            System.out.println("4 - Mostrar cola completa");
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
                    cola.encolar(tarea, hora);
                    break;

                case 2:
                    Nodo eliminado = cola.desencolar();
                    if (eliminado != null) {
                        System.out.println("Elemento eliminado: " + eliminado);
                    } else {
                        System.out.println("Cola vacía");
                    }
                    break;

                case 3:
                    Nodo inicio = cola.peek();
                    if (inicio != null) {
                        System.out.println("Inicio de la cola: " + inicio);
                    } else {
                        System.out.println("Cola vacía");
                    }
                    break;

                case 4:
                    System.out.println("\nContenido de la cola:");
                    cola.mostrar();
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
