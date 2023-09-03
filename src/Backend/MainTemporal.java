//package Backend;
//
//public class MainTemporal {
//
//    public static void main(String[] args) throws InterruptedException {
//        int capacidadMaxima = 2;
//        Recurso recursoCompartido = new Recurso(capacidadMaxima);
//
//        Productor productor = new Productor();
//        productor.setNombre("Productor");
//        productor.setVelocidadProduccion(1000);
//        productor.setRecursoCompartido(recursoCompartido);
//
//        Consumidor consumidor = new Consumidor();
//        consumidor.setNombre("Consumidor");
//        consumidor.setRecursoCompartido(recursoCompartido);
//
//        Thread hiloProductor = new Thread(productor);
////        Thread hiloConsumidor = new Thread(consumidor);
//
//        hiloProductor.start();
////        hiloConsumidor.start();
//
//        // Esperar un tiempo antes de detener la simulación (puede ser cualquier valor)
//        try {
//            Thread.sleep(10000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        while (true) {}
//    }
//}

//Opcion 2

package Backend;

public class MainTemporal {

    public static void main(String[] args) throws InterruptedException {
        int capacidadMaxima = 5;
        Recurso recursoCompartido = new Recurso(capacidadMaxima,null);

        Productor productor = new Productor(recursoCompartido);
        Consumidor consumidor = new Consumidor(recursoCompartido);

        Thread hiloProductor = new Thread(productor);
        Thread hiloConsumidor = new Thread(consumidor);

        hiloProductor.start();
        hiloConsumidor.start();

        // Esperar un tiempo antes de detener la simulación (puede ser cualquier valor)
        try {
            Thread.sleep(80000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Detener los hilos y finalizar la simulación
        hiloProductor.interrupt();
        hiloConsumidor.interrupt();
    }
}