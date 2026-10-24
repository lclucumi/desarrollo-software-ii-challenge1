public class Main {

    public static void main(String[] args) {

        Delivery delivery = new Delivery(
            5.0,
            true
        );

        DeliveryService service = new DeliveryService();

        service.createDelivery(
            delivery, new car()
        );
    }
}
/* la primera parte poermite incompprar el cambio para el nuevo recargo sin ningun problema debido a que sigue el 
razonamiento de S en SOLID, debido a que cada clase tiene una única responsabilidad y este cambioo solo se debe realizar 
en una sola clase que es DeliveryService */