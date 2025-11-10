public class Nodo {
    String tarea;
    String hora;
    Nodo next;
    Nodo prev;

    public Nodo(String tarea, String hora) {
        this.tarea = tarea;
        this.hora = hora;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return tarea + " (" + hora + ")";
    }
}

