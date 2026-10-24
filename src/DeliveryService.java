public class DeliveryService {

    public void createDelivery(Delivery delivery, PedirVehiculo vehiculo) {

        double cost = delivery.getDistance() * 2000;

        if (delivery.isPriority()) {
            cost = cost + 5000;
        }

        vehiculo.asignarEntrega();

        System.out.println("Saving delivery...");

        System.out.println("Notification sent. Cost: " + cost);
    }
}
