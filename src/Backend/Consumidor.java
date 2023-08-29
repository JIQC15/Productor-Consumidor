package Backend;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor implements Runnable {

    //Variables
    private String nombre = "Consumidor";
    private int velocidadConsumo;
    private Recurso recursoCompartido;
    private boolean consumidorDespierto = true;

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
        while(true) {
        if ("Consumidor".equals(nombre)) {
                consumirElementosHastaVacio();
                dormirHastaProductorDespierto();
            }
        }     
    }
    
    public void consumirElementosHastaVacio() {
        while (!recursoCompartido.estaVacio()) {
            consumidorDespierto();
            int elemento = recursoCompartido.consumir();
            System.out.println("Consumidor consumio: " + elemento);
        }
    }
    
    public void dormirHastaProductorDespierto() {
        while (recursoCompartido.hayElementos() || recursoCompartido.espacioDisponible()) {
            consumidorDormido();
            break;
        }
    }
    
    public void consumidorDormido() {
        consumidorDespierto = false;
        System.out.println("Consumidor Dormido!!!");
    }

    public void consumidorDespierto() {
        consumidorDespierto = true;
        System.out.println("Consumidor Despierto!!!");
    }
    
    public boolean isConsumidorDespierto(){
        return consumidorDespierto;
    }
}


