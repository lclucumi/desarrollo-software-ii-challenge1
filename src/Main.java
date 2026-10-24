public class Main {

    public static void main(String[] args) {

        Delivery delivery = new Delivery(5.0, true);

        PedirVehiculo vehiculo = new Motorcycle();

        DeliveryService service = new DeliveryService();

        service.createDelivery(delivery, vehiculo);
    }
}
