
package Backend;

public class Consumidor implements Runnable{
    private String nombre;
    private int turno;
    private int velocidadConsumo;
    private Recurso recursoCompartido;

    //Atributos
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
        while (true) {
            // Consumir un elemento del recurso compartido
            int elemento = recursoCompartido.consumir();
            
            // Realizar acciones con el elemento (puedes mostrarlo, procesarlo, etc.)
            consumirElemento(elemento);
            

            // Esperar un tiempo antes de consumir el siguiente elemento
            try {
                Thread.sleep(velocidadConsumo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consumirElemento(int elemento) {
        // Lógica para consumir un elemento real si es necesario.
        System.out.println(nombre + " consumio el elemento: " + elemento);
    }
}
