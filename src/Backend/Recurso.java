
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

    public  int producir() {
        while (cola.size() >= capacidadMaxima) {
        }
        cola.offer(contador); // Agregar el elemento a la cola
        return contador++;
    }

    public int consumir() {
        while (cola.isEmpty()) {
        }
        int elemento = cola.poll(); // Tomar el primer elemento de la cola
        return elemento;
    }

    public  boolean espacioDisponible() {
        return cola.size() < capacidadMaxima;
    }

    public  boolean hayElementos() {
        return !cola.isEmpty();
    }

    public  boolean estaVacio() {
        return cola.isEmpty();
    }
}