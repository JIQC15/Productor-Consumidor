package Backend;

import java.util.Random;

public class Productor implements Runnable {
//  Atributos

    private String nombre = "Productor";
    private Recurso recursoCompartido;
    private boolean productorDespierto;
    private Random random = new Random();
    private Consumidor consumidor;
    private boolean detenerHilo;

//  Setters / Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Recurso getRecursoCompartido() {
        return recursoCompartido;
    }

    public void setRecursoCompartido(Recurso recursoCompartido) {
        this.recursoCompartido = recursoCompartido;
    }

    public Productor(Recurso recursoCompartido) {
        this.recursoCompartido = recursoCompartido;
        this.detenerHilo = false; // Inicialmente no detener el hilo

    }

//  Metodos
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted() && !detenerHilo) {
            try {
                estadoProductor();
                while (true) {

                    int elemento = recursoCompartido.producir();
                    System.out.println("Productor produjo: " + elemento);

                    if (!recursoCompartido.espacioDisponible()) {
                        System.out.println("Esta Lleno!!!");
                        Thread.sleep(dormirProductor());
                        break; // Salir del ciclo interno para dormirse
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    public void detenerHilo() {
        detenerHilo = true;
    }

    public boolean estadoProductor() {
        if (recursoCompartido.estaVacio() || recursoCompartido.espacioDisponible()) {
//            System.out.println("Productor DESPIERTO!!!");
            productorDespierto = true;
        } else {
//            System.out.println("Productor DORMIDO!!!");
            productorDespierto = false;
        }
        return productorDespierto;
    }

    public int dormirProductor() {
        System.out.println("El productor se durmio un rato XD");
        productorDespierto = false;
        return random.nextInt(7000) + 3000;
    }
}
