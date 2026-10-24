public class DeliveryService {

    public void createDelivery(
            Delivery delivery,
            Vehiculo vehiculo
    ) {
        
        double cost = delivery.getDistance() * 2000;

        if (delivery.isPriority()) {
            cost += cost * 1/4;
        }
        //aqui lo que hicimos fue poder no crear puros if 
        //si no que creando una interface general para poder desprender de 
        //ahi las clases carro, bicileta, y moto. solo llamando el .getName 
        //y nos quitamos eso.

        System.out.println(
            "Delivery assigned to" + vehiculo.getNombre()

        );

        System.out.println("Saving delivery");



        System.out.println(
            
            "Notification sent Cost:" + cost
        );
    }
}
