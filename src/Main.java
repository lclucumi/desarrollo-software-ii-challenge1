public class Main {

    public static void main(String[] args) {

        DeliveryService service = new DeliveryService();

        Delivery delivery = new Delivery(
            5.0,
            true
        );

        Vehicles motorcycle = new Vehicles(
            "Motorcycle"

        );
        service.createDelivery(delivery, motorcycle);

        Delivery delivery2 = new Delivery(
            6.0,
            true
        );

        Vehicles car = new Vehicles(
            "Vehicle"
        );
        // en el main solo es crear Vehicles y llamarlo con el nombre 
        
        service.createDelivery(delivery2,car);


    }
}
