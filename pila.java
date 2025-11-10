import java.util.Scanner;
import java.util.Stack;
public class pila{
    public static void main() {
        Stack<Nodo> pila = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("menu pilas");
            System.out.println("1--agregar tarea");
            System.out.println("2--eliminar tarea");
            System.out.println("3--mostrar sima");
            System.out.println("4--mostrar pila");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("agrega una tarea");
                    String tarea = sc.next();
                    System.out.println("agrega una hora");
                    String hora = sc.next();
                    sc.nextLine();
                    Nodo N = new Nodo(tarea,hora);
                    pila.push(N);
                    break;
                }
                case 2:{
                    if(!pila.isEmpty()){
                        System.out.println("tarea eliminada"+ pila.pop());
                    }else{
                        System.out.println("pila vacia");
                    }
                    break;
                }
                case 3:{
                    if(!pila.isEmpty()){
                    System.out.println("cima de la pila" + pila.peek());
                    }else{
                        System.out.println("pila vacia");
                    }
                    break;
                }
                case 4:{
                    System.out.println("contenido de la pila"+ pila);
                    break;
                }
                default:
                System.out.println("opcion no valida");
            }
        }while(opcion !=0);
    }
}