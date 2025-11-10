import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("menu principal");
            System.out.println("1--ejecutar programa pila");
            System.out.println("2--ejecutar programa cola");
            System.out.println("3--ejecutar lista");
            System.out.println("0--salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:{
                    pila.main();
                    break;
                }
                case 2:{
                    cola.main();
                    break;
                }
                case 3:{
                    menulista.main();
                    break;
                }
                case 0:{
                    System.out.println("cerrando sesion");
                    break;
                }
                default:
                System.out.println("opcion no valida");
            }
        }while(opcion !=0);
    }
    
}
