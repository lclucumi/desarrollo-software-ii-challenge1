public class DeliveryService {

    public void createDelivery (TransportType transportType, TransportCost transportCost, Delivery delivery) {

        double cost = transportCost.cost(delivery);

        transportType.assignedTransport();

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}
