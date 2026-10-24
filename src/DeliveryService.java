public class DeliveryService {

    public void createDelivery (TransportType transportType, Delivery delivery) {

        double cost = delivery.getDistance() * 2000;

        if (delivery.isPriority()) {
            cost = cost + 5000;
        }

        transportType.assignedTransport();

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}
