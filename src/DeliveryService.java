public class DeliveryService {

    public void createDelivery(
            Delivery delivery,
            TransportType transportType
    ) {

        double cost = delivery.getDistance() * 2000;

        if (delivery.isPriority()) {
            cost = cost + 5000;
        }

        System.out.println(
            transportType.getMessage()
        );

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}