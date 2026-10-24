public class DeliveryService {

    private final transport deliveryTransport;

    public DeliveryService(transport deliveryTransport) {
        this.deliveryTransport = deliveryTransport;
    }

    public void createDelivery(Delivery delivery) {

        double baseCost = delivery.getDistance() * 2000;
        double cost = baseCost;

        if (delivery.isPriority()) {
            cost = baseCost * 1.25;
        }

        deliveryTransport.transportType();

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}
