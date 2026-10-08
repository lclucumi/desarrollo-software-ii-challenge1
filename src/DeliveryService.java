public class DeliveryService {

    public void createDelivery(
            Delivery delivery,
            String transportType
    ) {

        double cost = delivery.getDistance() * 2000;

        if (delivery.isPriority()) {
            cost = cost + 5000;
        }

        if (transportType.equals("MOTORCYCLE")) {
            System.out.println(
                "Delivery assigned to motorcycle"
            );
        }

        if (transportType.equals("BICYCLE")) {
            System.out.println(
                "Delivery assigned to bicycle"
            );
        }

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}
