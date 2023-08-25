package Backend;

public class MainTemporal {

    public static void main(String[] args) {
        Recurso recursoCompartido = new Recurso(10); // Capacidad máxima del recurso

        //Productor
        Productor productor = new Productor();
        productor.setNombre("Productor");
        productor.setTurno(1);
        productor.setVelocidadProduccion(1000);
        productor.setRecursoCompartido(recursoCompartido);

        //Consumidor
        Consumidor consumidor = new Consumidor();
        consumidor.setNombre("Consumidor");
        consumidor.setTurno(1);
        consumidor.setVelocidadConsumo(1500);
        consumidor.setRecursoCompartido(recursoCompartido);

        Thread hiloProductor = new Thread(productor);
        Thread hiloConsumidor = new Thread(consumidor);

        hiloProductor.start();
        hiloConsumidor.start();

        // Esperar un tiempo antes de detener la simulación (puede ser cualquier valor)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Detener los hilos
        hiloProductor.interrupt();
        hiloConsumidor.interrupt();
    }
}
