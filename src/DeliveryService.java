public class DeliveryService {
    
    private final PriceCalculator calculator = new PriceCalculator();
    private final NotificationSender notifier = new NotificationSender();

    public void createDelivery(
            Delivery delivery,
            TransportType transporte
    ) 
    {

        double cost =  calculator.calculate(delivery);
        transporte.deliveryAssigment();
        System.out.println("Saving delivery...");
        notifier.sendConfirmation(cost);
    }
}
