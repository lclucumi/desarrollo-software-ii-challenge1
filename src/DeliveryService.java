public class DeliveryService {

    public void createDelivery(
            Delivery delivery,
            transportType transporte
    ) 
    {

        double cost = delivery.getDistance() * 2000;

        if (delivery.isPriority()) {
            cost = cost * 1.25;
        }

        transporte.deliveryAssigment();
        

        System.out.println("Saving delivery...");

        System.out.println(
            "Notification sent. Cost: " + cost
        );
    }
}
