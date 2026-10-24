public class Main {

    public static void main(String[] args) {

        Delivery delivery = new Delivery(5.0, false);

        PedirVehiculo vehiculo = new Automovil();

        DeliveryService service = new DeliveryService();

        service.createDelivery(delivery, vehiculo);
    }
}
