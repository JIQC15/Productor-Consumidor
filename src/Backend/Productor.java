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
        while (true) {
            if ("Productor".equals(nombre)) {
                producirElemento();
            }
        }
    }

    public void producirElemento() {
        while (recursoCompartido.estaVacio()) {
            if (!recursoCompartido.estaVacio()) {
                productorDormido();
//                    System.out.println("Productor Dormido");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (recursoCompartido.estaVacio()) {
                productorDespierto();
//                System.out.println("Productor Despierto!!!");
                while (productorDespierto && recursoCompartido.espacioDisponible()) {
                    int elemento = recursoCompartido.producir();
                    System.out.println("Productor produjo: " + elemento);

                    if (!recursoCompartido.espacioDisponible()) {
                        productorDormido();
//                        System.out.println("Productor Dormido!!!");
                    }
                }
            }
        }
    }

    public void productorDormido() {
        productorDespierto = false;
        System.out.println("Productor Dormido!!!");
    }

    public void productorDespierto() {
        productorDespierto = true;
        System.out.println("Productor Despierto!!!");
    }

    public boolean isProductorDespierto() {
        return productorDespierto;
    }

}
