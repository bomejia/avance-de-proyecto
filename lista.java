public class Lista {
    private Nodo head;
    private Nodo tail;
    private boolean isDoubly;
    private boolean isCircular;

    public Lista(boolean isDoubly, boolean isCircular) {
        this.isDoubly = isDoubly;
        this.isCircular = isCircular;
        this.head = null;
        this.tail = null;
    }

    public void insert(String tarea, String hora) {
        Nodo N = new Nodo(tarea, hora);
        if (head == null) {
            head = N;
            tail = N;
            if (isCircular) {
                head.next = head;
                if (isDoubly) head.prev = head;
            }
        } else {
            tail.next = N;
            if (isDoubly) N.prev = tail;
            tail = N;
            if (isCircular) {
                tail.next = head;
                if (isDoubly) head.prev = tail;
            }
        }
        System.out.println("Tarea agregada correctamente");
    }

    public void delete(String tarea) {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo current = head;
        Nodo prevNode = null;
        do {
            if (current.tarea.equals(tarea)) {
                if (current == head) {
                    head = head.next;
                    if (head == null) tail = null;
                    else {
                        if (isDoubly) head.prev = tail;
                        if (isCircular) tail.next = head;
                    }
                } else {
                    prevNode.next = current.next;
                    if (isDoubly && current.next != null)
                        current.next.prev = prevNode;
                    if (current == tail) {
                        tail = prevNode;
                        if (isCircular) tail.next = head;
                    }
                }
                System.out.println("Tarea eliminada: " + tarea);
                return;
            }
            prevNode = current;
            current = current.next;
        } while (isCircular ? current != head : current != null);
        System.out.println("Tarea no encontrada");
    }

    public void display() {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo current = head;
        System.out.println("\n--- LISTA DE TAREAS ---");
        do {
            System.out.println("Tarea: " + current.tarea + " | Hora: " + current.hora);
            current = current.next;
        } while (isCircular ? current != head : current != null);
        System.out.println("\nTipo de lista: " + (isDoubly ? "Doble" : "Simple") + (isCircular ? " Circular" : ""));
    }
}
