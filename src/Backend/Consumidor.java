
package Backend;

import java.util.Random;

public class Consumidor implements Runnable {
//  Atributos
    private String nombre = "Consumidor";
    private Recurso recursoCompartido;
    private boolean consumidorDespierto;
    private Random random = new Random();

    public Consumidor(Recurso recursoCompartido) {
        this.recursoCompartido = recursoCompartido;
    }
    
//  Setters/Getters
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

//  Metodos
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                int tiempoDeEspera = dormirConsumidor();
                Thread.sleep(tiempoDeEspera);
                
                if (recursoCompartido.hayElementos()) {
                    if(estadoConsumidor() == true){
                    
                    int elemento = recursoCompartido.consumir();
                    System.out.println("Consumidor consumio: " + elemento);
                    
                    }
                } else {
                    estadoConsumidor();
                    Thread.sleep(2000); // Tiempo de dormir antes de revisar nuevamente
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean estadoConsumidor() {
       
        if(recursoCompartido.hayElementos()){
            System.out.println("Consumidor DESPIERTO!!");
            consumidorDespierto = true;
        } else {
            System.out.println("Consumidor DORMIDO!!");
            consumidorDespierto = false;
        }
        return consumidorDespierto;
    }
    
    public int dormirConsumidor(){
        return random.nextInt(7000) + 3000; 
    }
}
