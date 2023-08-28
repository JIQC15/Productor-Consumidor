
package Backend;
import java.util.Queue;
import java.util.LinkedList;

public class Recurso {

    private int contador = 1;

    private Queue<Integer> cola = new LinkedList<>();
    private int capacidadMaxima;

    public Recurso(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public synchronized void producir() {
        while (cola.size() >= capacidadMaxima) {
            try {
                wait(); // Esperar si la cola está llena
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        cola.offer(contador); // Agregar el elemento a la cola
        contador++;
        notifyAll(); // Notificar a todos los hilos esperando
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
        notifyAll(); // Notificar a todos los hilos esperando
        return elemento;
    }

    public synchronized boolean espacioDisponible() {
        return cola.size() < capacidadMaxima;
    }

    public synchronized boolean hayElementos() {
        return !cola.isEmpty();
    }

    public synchronized boolean estaVacio() {
        return cola.isEmpty();
    }
}