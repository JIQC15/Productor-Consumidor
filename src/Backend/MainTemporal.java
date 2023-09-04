//package Backend;
//
//public class MainTemporal {
//
//    public static void main(String[] args) throws InterruptedException {
//        int capacidadMaxima = 5;
//        Recurso recursoCompartido = new Recurso(capacidadMaxima,null);
//
//        Productor productor = new Productor(recursoCompartido);
//        Consumidor consumidor = new Consumidor(recursoCompartido);
//
//        Thread hiloProductor = new Thread(productor);
//        Thread hiloConsumidor = new Thread(consumidor);
//
//        hiloProductor.start();
//        hiloConsumidor.start();
//
//        // Esperar un tiempo antes de detener la simulación (puede ser cualquier valor)
//        try {
//            Thread.sleep(80000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Detener los hilos y finalizar la simulación
//        hiloProductor.interrupt();
//        hiloConsumidor.interrupt();
//    }
//}