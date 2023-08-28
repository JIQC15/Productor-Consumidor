package Backend;

public class MainTemporal {

    public static void main(String[] args) {
        int capacidadMaxima = 4;
        Recurso recursoCompartido = new Recurso(capacidadMaxima);

        Productor productor = new Productor();
        productor.setNombre("Productor");
        productor.setVelocidadProduccion(1000);
        productor.setRecursoCompartido(recursoCompartido);

        Consumidor consumidor = new Consumidor();
        consumidor.setNombre("Consumidor");
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

        try {
            hiloProductor.join();
            hiloConsumidor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
