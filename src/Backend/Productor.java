package Backend;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor implements Runnable {

    // Variables
    private String nombre = "Productor";
    private int velocidadProduccion;
    private Recurso recursoCompartido;
    private boolean productorDespierto = true;

    //Setters / Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidadProduccion() {
        return velocidadProduccion;
    }

    public void setVelocidadProduccion(int velocidadProduccion) {
        this.velocidadProduccion = velocidadProduccion;
    }

    public Recurso getRecursoCompartido() {
        return recursoCompartido;
    }

    public void setRecursoCompartido(Recurso recursoCompartido) {
        this.recursoCompartido = recursoCompartido;
    }

    // Métodos
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if ("Productor".equals(nombre)) {
                producirElemento();
            }
        }
    }

    private void producirElemento() {
        synchronized (recursoCompartido) {
            while (!recursoCompartido.estaVacio()) {
                if (!recursoCompartido.estaVacio()) {
                    try {
                        productorDormido();
                        System.out.println("Productor Dormido");
                        recursoCompartido.wait();
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                        Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (recursoCompartido.estaVacio()) {
                    productorDespierto();
                    System.out.println("Productor Despierto!!!");
                    while (productorDespierto && recursoCompartido.espacioDisponible()) {
                        recursoCompartido.producir();
                        System.out.println("Productor produjo: " + 1);
                        recursoCompartido.notifyAll();
                        if (!recursoCompartido.espacioDisponible()) {
                            productorDormido();
                            System.out.println("Productor Dormido!!!");
                        }
                    }
                }
            }
        }
    }

    public void productorDormido() {
        synchronized (recursoCompartido) {
            productorDespierto = false;
        }
    }

    public void productorDespierto() {
        synchronized (recursoCompartido) {
            productorDespierto = true;
            recursoCompartido.notifyAll();
        }
    }

}
