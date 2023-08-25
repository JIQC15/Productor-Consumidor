package Backend;
import java.util.Queue;
import java.util.LinkedList;

public class Recurso {

    private Queue<Integer> cola = new LinkedList<>();
    private int capacidadMaxima;

    public Recurso(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public synchronized void producir(int elemento) {
        while (cola.size() >= capacidadMaxima) {
            try {
                wait(); // Esperar si la cola está llena
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        cola.offer(elemento); // Agregar el elemento a la cola
        notifyAll(); // Notificar a los consumidores que hay elementos disponibles
    }

    public synchronized int consumir() {
        while (cola.isEmpty()) {
            try {
                wait(); // Esperar si la cola está vacía
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        int elemento = cola.poll(); // Tomar el primer elemento de la cola
        notifyAll(); // Notificar a los productores que hay espacio disponible
        return elemento;
    }
}
