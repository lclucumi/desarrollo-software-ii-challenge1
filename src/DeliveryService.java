public class DeliveryService {

    private static final double COST_PER_KM = 2000;
    private static final double PRIORITY_RATE = 0.25;

    public void createDelivery(
            Delivery delivery,
            TransportType transportType
    ) {

        double baseCost = delivery.getDistance() * COST_PER_KM;
        double cost = baseCost;

        if (delivery.isPriority()) {
            cost = baseCost + (baseCost * PRIORITY_RATE);
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