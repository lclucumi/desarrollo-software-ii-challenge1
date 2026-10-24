public class Main {

    public static void main(String[] args) {

        DeliveryService service = new DeliveryService();

        // En este se aplica el costo con prioridad quitando los 5000 y poniendo el equivalente del 25%
        Delivery delivery = new Delivery(
            5.0,
            true
        );

        Vehicles motorcycle = new Vehicles(
            "Motorcycle"

        );
        service.createDelivery(delivery, motorcycle);

        // como podemos ver si no hay prioridad se mantienenel costo normal por kilometro
        Delivery delivery2 = new Delivery(
            6.0,
            false
        );

        Vehicles car = new Vehicles(
            "Vehicle"
        );
        // en el main solo es crear Vehicles y llamarlo con el nombre 
        
        service.createDelivery(delivery2,car);


    }
}
