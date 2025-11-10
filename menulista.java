import java.util.Scanner;
public class menulista {
    public static void main() {
       Scanner sc = new Scanner(System.in);
       lista L = null;
       int opciones;
       do { 
           System.out.println("menu");
           System.out.println("1--crear lista enlazada simple");
           System.out.println("2--crear lista doblemente enlazada");
           System.out.println("3--agregar tarea");
           System.out.println("4--eliminar tarea");
           System.out.println("5--mostrar todas las tareas");
           System.out.println("0--salir");
           opciones = sc.nextInt();

           switch (opciones) {
               case 1:{
                L = new lista(false, false);
                System.out.println("lista simple creada");
                break;
               }
               case 2:{
                L = new lista(true, false);
                break;
               }
               case 3:{
                if(L==null){
                    System.out.println("primero crea una lista");
                    break;
                }
                System.out.println("ingresa una tarea");
                String tarea = sc.next();
                System.out.println("ingresa una hora");
                String hora = sc.next();
                L.insert(tarea, hora);
                break;
               }
               case 4:{
                if(L==null){
                    System.out.println("crea una lista primero");
                    break;
                }
                System.out.println("ingresa una tarea a eliminar");
                String tarea = sc.next();
                L.delete(tarea);
                break;
               }
               case 5:{
                if(L != null) L.display();
                else System.out.println("primero crea una lista");
                break;
               }
               case 0:{
                System.out.println("cerrando secion");
                break;
               }
               default: System.out.println("opcion no valida");
           }
       } while (opciones !=0); 
    }
}
