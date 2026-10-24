public class Main {

    public static void main(String[] args) {

        Delivery delivery = new Delivery(
            5.0,
            true
        );

        Delivery delivery2 = new Delivery(
            10.0,
            false
        );
        
        Delivery delivery3 = new Delivery(
            15.0,
            true
        );


        DeliveryService service = new DeliveryService();

        service.createDelivery(
            delivery,
            "MOTORCYCLE"
        );

        service.createDelivery(
            delivery2,
            "BICYCLE"
        );
        service.createDelivery(
            delivery3,
            "CAR"
        );
    }
}

