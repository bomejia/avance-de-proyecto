import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class cola {
    public static void main(){
        Queue<Nodo> cola = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do { 
            System.out.println("lista cola");
            System.out.println("1-- agregar tarea");
            System.out.println("2-- eliminar tarea");
            System.out.println("3-- mostrar sima");
            System.out.println("4-- mostrar cola");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("agregar tarea ");
                    String tarea = sc.next();
                    System.out.println("agrega una hora");
                    String hora = sc.next();
                    sc.nextLine();
                    Nodo N = new Nodo(tarea,hora);
                    cola.add(N);
                    break;
                }
                case 2:{
                    if(!cola.isEmpty()){
                        System.out.println("elemento eliminado"+ cola.poll());
                    }else{
                        System.out.println("cola vacia");
                    }
                    break;
                }
                case 3:{
                    if(!cola.isEmpty()){
                        System.out.println("inicio de la cola"+ cola.peek());
                    }else{
                        System.out.println("cola vacia");
                    }
                    break;
                }
                case 4:{
                    System.out.println("contenido en cola"+ cola);
                }
                default:
                    System.out.println("opcion no valida");
            }
        } while (opcion!=0);  
    }
}
