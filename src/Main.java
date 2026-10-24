public class Main {

    public static void main(String[] args) {
        /*Caso de servicio AUTOMOVIL */
        Delivery delivery1 = new Delivery(
            5.0,
            true
        );

        DeliveryService service1 = new DeliveryService(
            new DeliveryCostCalculator()
        );

        service1.createDelivery(
            delivery1,
            TransportType.AUTOMOBILE
        );

        /*Caso de servicio MOTOCICLETA */
        Delivery delivery2 = new Delivery(
            10.0,
            false
        );

        DeliveryService service2 = new DeliveryService(
            new DeliveryCostCalculator()
        );

        service2.createDelivery(
            delivery2,
            TransportType.MOTORCYCLE
        );

        /*Caso de servicio BICICLETA */
        Delivery delivery3 = new Delivery(
            8.0,
            false
        );

        DeliveryService service3 = new DeliveryService(
            new DeliveryCostCalculator()
        );

        service3.createDelivery(
            delivery3,
            TransportType.BICYCLE
        );
        
    }

    
}
