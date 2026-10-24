public class DeliveryService {

    private final transport deliveryTransport;

    public DeliveryService(transport deliveryTransport) {
        this.deliveryTransport = deliveryTransport;
    }

    public void createDelivery(Delivery delivery) {

        double cost = delivery.getDistance() * 2000;

        if (delivery.isPriority()) {
            cost = cost + 5000;
        }

        deliveryTransport.transportType();

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}
