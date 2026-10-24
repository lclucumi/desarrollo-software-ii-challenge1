public class DeliveryService {

    public void createDelivery(
            Delivery delivery,
            Transport transport
    ) {

        double cost = delivery.getDistance() * 2000;

        if (delivery.isPriority()) {
            cost = cost + (cost * 0.25);
        }

        transport.assign();

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}