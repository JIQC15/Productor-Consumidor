package Backend;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor implements Runnable {

    //Variables
    private String nombre;
    private int turno;
    private static int recurso;
    private int velocidadProduccion;
    private Recurso recursoCompartido;
    private static Object estado = new Object();

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getRecurso() {
        return recurso;
    }

    public void setRecurso(int recurso) {
        this.recurso = recurso;
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

    //Metodos
    private int generarElemento() {
        // Lógica para generar un elemento real si es necesario
        return recurso;
    }

    @Override
    public void run() {
        while (true) {
            if (nombre == "Productor") {
                producitElemento();
            } else {
                try {
                    Thread.sleep(velocidadProduccion);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // Generar un elemento (simplemente usando el valor de recurso para este ejemplo)
//            int elemento = generarElemento();

            // Producir el elemento en el recurso compartido
//            recursoCompartido.producir(elemento);
//            producirElemento(elemento);
            // Actualizar atributos
            // Esperar un tiempo antes de producir el siguiente elemento
//            try {
//                Thread.sleep(velocidadProduccion);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    private void producitElemento() {
        synchronized (estado) {
            if (getRecurso() == 0) {
                setRecurso(10);
                System.out.println("Soy el cocinero y quedan " + getRecurso() + ".");
                estado.notifyAll();
            }

            try {
                estado.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
