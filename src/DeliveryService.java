public class DeliveryService {

    public void createDelivery(Delivery delivery, Transport transport) {

        double baseCost = delivery.getDistance() * 2000;
        double cost = delivery.isPriority() ? baseCost * 1.25 : baseCost;

        transport.assign();

        System.out.println("Saving delivery...");

        System.out.println("Notification sent. Cost: " + cost);
    }
}
