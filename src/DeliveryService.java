public class DeliveryService {

    private static final double COST_PER_KM = 2000;
    private static final double PRIORITY_RATE = 0.25;

    public void createDelivery(
            Delivery delivery,
            TransportType transportType
    ) {

        double cost = calculateCost(delivery);

        System.out.println(
            transportType.getMessage()
        );

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }

    private double calculateCost(Delivery delivery) {
        double baseCost = delivery.getDistance() * COST_PER_KM;
        if (delivery.isPriority()) {
            return baseCost + (baseCost * PRIORITY_RATE);
        }

        return baseCost;
    }
}