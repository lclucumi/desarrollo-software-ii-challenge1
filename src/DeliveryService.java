
public class DeliveryService {
    private final DeliveryCostCalculator costCalculator;

    public DeliveryService(DeliveryCostCalculator costCalculator) {
        this.costCalculator = costCalculator;
    }

    public void createDelivery(Delivery delivery, TransportType transportType) {
        double cost = costCalculator.calculate(delivery);

        System.out.println("Delivery assigned to " + transportType);
        System.out.println("Saving delivery...");
        System.out.println("Notification sent. Cost: " + cost);
    }
}