public class DeliveryService {

    public void createDelivery(
            Delivery delivery
    ) {

        double cost = delivery.getDistance() * 2000;

        if (delivery.isPriority()) {
            cost *= 1.25;
        }

        
        TransportType transport = new TransportType();
        transport.assignTransport(
            "Motorcycle");

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}
