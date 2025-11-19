public class Nodo {
    String tarea;
    String hora;
    Nodo siguiente;

    public Nodo(String tarea, String hora) {
        this.tarea = tarea;
        this.hora = hora;
        this.siguiente = null;
    }

    public String toString() {
        return "(" + tarea + " - " + hora + ")";
    }
}
