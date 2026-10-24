public class Main {

    public static void main(String[] args) {

        Delivery delivery = new Delivery(
            5.0,
            false
        );
        Motorcycle moto1 = new Motorcycle();
        DeliveryService service = new DeliveryService();
        service.createDelivery(moto1, delivery);

        Car carrito = new Car();
        DeliveryService servicio1 = new DeliveryService();
        servicio1.createDelivery(carrito, delivery);
    }
}
