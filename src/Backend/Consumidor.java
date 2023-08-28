package Backend;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor implements Runnable {

    private String nombre = "Consumidor";
    private int velocidadConsumo;
    private Recurso recursoCompartido;
    private static Object estado = new Object();

    //Setters/Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidadConsumo() {
        return velocidadConsumo;
    }

    public void setVelocidadConsumo(int velocidadConsumo) {
        this.velocidadConsumo = velocidadConsumo;
    }

    public Recurso getRecursoCompartido() {
        return recursoCompartido;
    }

    public void setRecursoCompartido(Recurso recursoCompartido) {
        this.recursoCompartido = recursoCompartido;
    }

    //Metodos
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if ("Consumidor".equals(nombre)) {
                consumirElementosHastaVacio();
                dormirHastaProductorDespierto();
            }
        }
    }
    
    private void consumirElementosHastaVacio() {
        synchronized (estado) {
            while (!recursoCompartido.estaVacio()) {
                int elemento = recursoCompartido.consumir();
                System.out.println("Consumidor consumió: " + elemento);
                estado.notifyAll();
            }
        }
    }
    
    private void dormirHastaProductorDespierto() {
        synchronized (recursoCompartido) {
            while (recursoCompartido.hayElementos() || recursoCompartido.espacioDisponible()) {
                try {
                    recursoCompartido.wait();
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}


