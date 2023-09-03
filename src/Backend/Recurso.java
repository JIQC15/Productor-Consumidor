//package Backend;
//import java.util.Queue;
//import java.util.LinkedList;
//
//public class Recurso {
//
//    private int contador = 1;
//
//    private Queue<Integer> cola = new LinkedList<>();
//    private int capacidadMaxima;
//
//    public Recurso(int capacidadMaxima) {
//        this.capacidadMaxima = capacidadMaxima;
//    }
//
//    public  int producir() {
//        while (cola.size() >= capacidadMaxima) {
//        }
//        cola.offer(contador); // Agregar el elemento a la cola
//        return contador++;
//    }
//
//    public int consumir() {
//        while (cola.isEmpty()) {
//        }
//        int elemento = cola.poll(); // Tomar el primer elemento de la cola
//        return elemento;
//    }
//
//    public  boolean espacioDisponible() {
//        return cola.size() < capacidadMaxima;
//    }
//
//    public  boolean hayElementos() {
//        return !cola.isEmpty();
//    }
//
//    public  boolean estaVacio() {
//        return cola.isEmpty();
//    }
//}

//Opcion 2
package Backend;
import Frontend.EspacioLabel;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Recurso {

    private int contador = 1;
    private List<EspacioLabel> espacios;
    private Queue<Integer> cola = new LinkedList<>();
    private int capacidadMaxima = 5;
    private Random random = new Random();

    public Recurso(int capacidadMaxima, List<EspacioLabel> espacios) {
        this.capacidadMaxima = capacidadMaxima;
        this.espacios = espacios;
    }

    public synchronized int producir() throws InterruptedException {
        while (cola.size() >= capacidadMaxima) {
            wait();
        }
        cola.offer(contador);
        int elemento = contador;
        contador++;
        
        int tiempoDeProduccion = generarTiempoAleatorioProducir();
        Thread.sleep(tiempoDeProduccion);
        
        notifyAll();
        return elemento;
    }

    public synchronized int consumir() throws InterruptedException {
        while (cola.isEmpty()) {
            wait();
        }
        int elemento = cola.poll();
        
        int tiempoConsumo = generarTiempoAleatorioConsumir();
        
        
        Thread.sleep(tiempoConsumo);
        notifyAll();
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
    
    private int generarTiempoAleatorioConsumir(){
        return random.nextInt(3000) + 2000;//Tardara en comer entre 4 y 2 segundos.
    }
    
    private int generarTiempoAleatorioProducir(){
        return random.nextInt(2000) + 4000;//Tardara en producir entre 1 y 3 segundo.
    }
    
    public int capacidadMaxima(){
        return capacidadMaxima;
    }
    
}
