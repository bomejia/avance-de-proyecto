import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN DE TAREAS ===");
            System.out.println("1 - Ejecutar programa Pila");
            System.out.println("2 - Ejecutar programa Cola");
            System.out.println("3 - Ejecutar programa Lista");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Pila.main();
                    break;
                case 2:
                    Cola.main();
                    break;
                case 3:
                    Menulista.main();
                    break;
                case 0:
                    System.out.println("Cerrando el sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
}
